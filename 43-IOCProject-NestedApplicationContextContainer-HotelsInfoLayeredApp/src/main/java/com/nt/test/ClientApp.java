package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.dto.HotelsInfoDTO;

public class ClientApp {

	public static void main(String[] args) throws Exception {
		ApplicationContext pctx=null,cctx=null;
		MainController controller=null;
		List<HotelsInfoDTO> listDTO=null;
		
		/*//Parent Container(FileSystemXmlApplicationContext)
		pctx=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/business-beans.xml");
		//child Container
		cctx=new FileSystemXmlApplicationContext(new String[] {"src/main/java/com/nt/cfgs/presentation-beans.xml"},pctx);
	    */	
	    
		//Parent Container(ClassPathXmlApplicationContext)
   		pctx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//child Container
   		cctx=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation-beans.xml"},pctx);
			
		controller=cctx.getBean("controller",MainController.class);
		
		listDTO=controller.fetchHotelsByCity(new String[]{"pune","mumbai","Hyderabad"});
		
		listDTO.forEach(dto->System.out.println(dto));
		
		//close container
		((AbstractApplicationContext)cctx).close();
	}

}
