package com.ru.spring.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ru.spring.login.dao.inter.UserDaoInter;
import com.ru.spring.login.service.inter.UserSerInter;

@Service
public class UserSerImp implements UserSerInter{

	@Autowired
	private UserDaoInter dao;
	
	/**
	 * 判断用户是否存在
	 */
	public int getUserCount(String userName, String pwd) {
		String sql = "select count(*) from `t_user` where `user_name`=?";
		return dao.getUserCount(sql, "nange");
	}
	
}
