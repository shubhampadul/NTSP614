package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.CrickBuzzScoreService;
import com.nt.service.CrickBuzzScoreServiceImpl;

public class MainController extends HttpServlet {
	CrickBuzzScoreService crickBuzz;
	ApplicationContext ctx=null;
    public MainController() {
    	System.out.println("MainController.MainController()");
    }
    @Override
    public void init() throws ServletException {
    	//create IOC container
    	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/ApplicationContext.xml");
    	
    	//get Service Local obj
    	crickBuzz=ctx.getBean("crickBuzzService",CrickBuzzScoreServiceImpl.class);
    }

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid=0;
		String score=null;
		RequestDispatcher rd=null;
		//get Request Pamrm values
		mid=Integer.parseInt(req.getParameter("mid"));
		
		try {
		//invode b method of local service class obj
		score=crickBuzz.findScore(mid);
		//set score to req scope
		req.setAttribute("scoreCard",score);
		
		//forward request to view_score.jsp
		rd=req.getRequestDispatcher("/View_Score.jsp");
		rd.forward(req, res);
		}
		catch(IllegalArgumentException ie) {
			ie.printStackTrace();
			rd=req.getRequestDispatcher("/error.jsp");
			req.setAttribute("errorPage", ie);
			rd.forward(req, res);
		}
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
	
	@Override
	public void destroy() {
		crickBuzz=null;
		((AbstractApplicationContext) ctx).close();
	}
}
