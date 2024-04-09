package com.nt.test;

import java.util.List;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.dto.HotelsInfoDTO;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext pctx=null,cctx=null;
		MainController controller=null;
		List<HotelsInfoDTO> listDTO=null;
		Properties props=null;
			
	    
		//Parent Container(ClassPathXmlApplicationContext)
   		pctx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//child Container
   		cctx=new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation-beans.xml"},pctx);
			
 
   		
		controller=cctx.getBean("controller",MainController.class);
		try {
		listDTO=controller.fetchHotelsByCity(new String[]{"pune","mumbai","Hyderabad"});
		
		listDTO.forEach(dto->System.out.println(dto));
		}catch(Exception e) {
			e.printStackTrace();
		}
		//close container
		((AbstractApplicationContext)cctx).close();
		props=new Properties();
		System.out.println(System.getProperties());
	}

}
