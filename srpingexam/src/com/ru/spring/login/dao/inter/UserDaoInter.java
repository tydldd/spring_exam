package com.ru.spring.login.dao.inter;

public interface UserDaoInter {

	@SuppressWarnings("deprecation")
	public int getUserCount(String sql, Object...args);
}
