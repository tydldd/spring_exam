package com.ru.spring.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ru.spring.login.dao.inter.UserDaoInter;

/**
 * 使用注解定义user dao
 * @author nange
 *
 */
@Repository //通过spring注解定义一个dao
public class UserDaoImp implements UserDaoInter{

	@Autowired //自动注入jdbcTemplatebean
	private JdbcTemplate jdbc;
	
	@SuppressWarnings("deprecation")
	public int getUserCount(String sql, Object...args){
		int res = jdbc.queryForInt(sql,args);
		System.out.println(res);
		return res;
	}
	
}
