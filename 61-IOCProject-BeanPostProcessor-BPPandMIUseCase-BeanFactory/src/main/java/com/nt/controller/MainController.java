package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.NitService;

public class MainController extends HttpServlet {
	 DefaultListableBeanFactory factory;
	 XmlBeanDefinitionReader reader;
	NitService nitService;
	RequestDispatcher rd = null;

	public MainController(NitService nitService) {
		System.out.println("MainController() 1 param constructor");
		this.nitService = nitService;
	}

	public MainController() {
		System.out.println("MainController() 0 param construtor");
	}

	@Override
	public void init() throws ServletException {
		factory =new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");		
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		StudentDTO stDTO = null;
		EmployeeDTO empDTO=null;
		String regMsg = null;
		
		
		nitService = factory.getBean("nitService", NitService.class);
		if (req.getParameter("s1").equals("RegisterStudent")) {
		
			stDTO = new StudentDTO();
			stDTO.setId(Integer.parseInt(req.getParameter("sid")));
			stDTO.setName(req.getParameter("sname"));
			stDTO.setCourse(req.getParameter("course"));
			stDTO.setAddrs(req.getParameter("addrs"));
			stDTO.setQulfy(req.getParameter("qlfy"));
			System.out.println(stDTO);
			regMsg = nitService.registerStudent(stDTO);
			req.setAttribute("Result", regMsg);
		} else {
			empDTO=new EmployeeDTO();
			empDTO.setId(Integer.parseInt(req.getParameter("eid")));
			empDTO.setName(req.getParameter("ename"));
			empDTO.setAddrs(req.getParameter("addrs"));
			empDTO.setDesg(req.getParameter("desg"));
			empDTO.setExp(Float.parseFloat(req.getParameter("exp")));
			regMsg = nitService.registerEmployee(empDTO);
			req.setAttribute("Result", regMsg);
		}

		rd = req.getRequestDispatcher("/Result.jsp");
		rd.forward(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

	@Override
	public void destroy() {
	factory=null;
	}

}
