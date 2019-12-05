package com.zhiyou.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper mapper;
	
	public void add(User user) {
		mapper.add(user);
	}

	public void update(User user) {
		mapper.update(user);
	}

	public void delete(int id) {
		mapper.delete(id);
	}

	public List<User> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public User selectByID(int id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}

	@Override
	public User selectById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectById(id);
	}

	//用户登录
	@Override
	public User userLogin(HttpServletRequest req, String accounts, String password) {
		//获取user
		User user = mapper.selectByAccounts(accounts);
		if (user!=null) {//账号存在,密码错误
			req.setAttribute("msg", "您输入的密码错误,请重新输入!");
			return null;
		}else {//账号不存在
			req.setAttribute("msg", "您输入的账号不存在,请输入正确的账号!");
		}
		return user;
	}
	
	//新用户注册
	@Override
	public String userReg(String email) {
		// TODO Auto-generated method stub
		if (mapper.selectByAccounts(email)==null) {
			return "success";
		}
		return "";
	}



}
