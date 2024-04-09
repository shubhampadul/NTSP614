package com.nt.dao;

import java.util.Map;

import com.nt.bo.LoginUserBo;

public interface LoginUserDao {
	public Map<String,Object> authonicateUser(LoginUserBo bo);
}
