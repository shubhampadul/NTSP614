package com.nt.anno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.anno.beans.VotingEligibilityCheck;

@SpringBootApplication
public class SpringBootBeanLifeCyleByAnnotationApprochApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootBeanLifeCyleByAnnotationApprochApplication.class, args);
	     
		VotingEligibilityCheck vec=null;
	
	
		//call getBean()
		vec=ctx.getBean("vec",VotingEligibilityCheck.class);
		System.out.println(vec.checkVotingValidity());
		//System.out.println(vec);
		((AbstractApplicationContext) ctx).close();
	}
}
