package com.ru.spring.login.service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ru.spring.login.service.inter.UserSerInter;

@RunWith(SpringJUnit4ClassRunner.class)//基于juint4的spring测试框架
@ContextConfiguration(locations={"/spring/applicationContext.xml"})//启动spring容器
public class Test {

	@Autowired
	private UserSerInter user;
	
	@org.junit.Test
	public void test1(){
		String userName = "nange";
		String pwd = "123456";
		if(user.getUserCount(userName, pwd) == 1){
			System.out.println("用户存在");
		}else{
			System.out.println("用户!!!!!!!!不存在");
		}
	}
}
