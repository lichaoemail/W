package com.zhiyou.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zhiyou.model.User;

public interface UserService {
	//用户注册
	public void add(User user);	//方法名保持与对应mapper中的id一致
	//修改用户
	public void update(User user); //参数与mapper中的parameterType一致
	//删除用户
	public void delete(int id);
	//根据id查询用户
	public User selectById(int id);
	
	public User userLogin(HttpServletRequest req, String accounts, String password);
	public String userReg(String email);
	
	
	
	
	
	List<User> selectAll(); //返回值与mapper中的resultType一致	
}

