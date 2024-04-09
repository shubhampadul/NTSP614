package com.nt.service;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.LoginUserBo;
import com.nt.dao.LoginUserDao;
import com.nt.dto.LoginUserDto;
@Service("loginService")
public class LoginUserMngmtServiceImpl implements LoginUserMngmtService{
	@Autowired
	LoginUserDao dao;
	
	public String validateUser(LoginUserDto dto) {
		LoginUserBo bo=null;
		Map<String,Object> outMap=null;
		String result=null;
		bo=new LoginUserBo();
		
		//convert dto to bo
		BeanUtils.copyProperties(dto, bo);
		
		outMap=dao.authonicateUser(bo);
	//	System.out.println(outMap);
		//get result from procedure
		result=(String) outMap.get("RESULT");
		return result;
	}

}
