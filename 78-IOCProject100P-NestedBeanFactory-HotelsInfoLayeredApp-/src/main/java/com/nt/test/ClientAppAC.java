package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.BusinessConfig;
import com.nt.config.PresentationConfig;
import com.nt.controller.MainController;
import com.nt.dto.HotelsInfoDTO;

public class ClientAppAC {

	public static void main(String[] args) throws Exception {
		ApplicationContext pCtx = null, cCtx = null;

		MainController controller = null;
		List<HotelsInfoDTO> listDTO = null;

		// Parent Container
		pCtx = new AnnotationConfigApplicationContext(BusinessConfig.class);

		// child Container
		cCtx = new AnnotationConfigApplicationContext(PresentationConfig.class);

		((AbstractApplicationContext) cCtx).setParent(pCtx);

		controller = cCtx.getBean("controller", MainController.class);

		listDTO = controller.fetchHotelsByCity(new String[] { "pune", "mumbai", "Hyderabad" });

		listDTO.forEach(dto -> System.out.println(dto));

		((AbstractApplicationContext) pCtx).close();
		((AbstractApplicationContext) cCtx).close();

		/**/
	}
}