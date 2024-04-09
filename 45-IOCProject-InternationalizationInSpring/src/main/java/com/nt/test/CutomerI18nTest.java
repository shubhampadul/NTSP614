package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CutomerI18nTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Locale             locale=null;
		String str1=null,str2=null,str3=null,str4,str5=null;
		JButton b1=null,b2=null,b3=null,b4=null;
		//create ioc container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//create locale object
		locale=new Locale(args[0],args[1]); 
		str1=ctx.getMessage("cap1", new Object[]{},"caption1", locale);
		str2=ctx.getMessage("cap2", new Object[]{},"caption2", locale);
		str3=ctx.getMessage("cap3", new Object[]{},"caption3", locale);
		str4=ctx.getMessage("cap4", new Object[]{},"caption4", locale);
		str5=ctx.getMessage("title",new Object[]{},"caption5", locale);
		
		//System.out.println(str1=ctx.getMessage("cap1", new Object[]{},"caption1", new Locale("hi","IN")));
	
		
		//create frame object
		JFrame frame=new JFrame();
		frame.setLayout(new FlowLayout());
		frame.setTitle(str5);
		frame.setSize(200,200);
		
		//crate buttons by getting lables from activated properties file
		b1=new JButton(str1);
		b2=new JButton(str2);
		b3=new JButton(str3);
		b4=new JButton(str4);
		
		//add buttons to frame
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		
		frame.setVisible(true);
		frame.pack();
		((AbstractApplicationContext) ctx).close();
	}
}
