package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.dto.HotelsInfoDTO;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		MainController controller=null;
		List<HotelsInfoDTO> listDTO=null;
		
		//Parent Container
		pFactory=new DefaultListableBeanFactory();

		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
		
		//child Container
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		
		controller=cFactory.getBean("controller",MainController.class);
		
		listDTO=controller.fetchHotelsByCity(new String[]{"pune","mumbai","Hyderabad"});
		
		listDTO.forEach(dto->System.out.println(dto));
		
	}

}
