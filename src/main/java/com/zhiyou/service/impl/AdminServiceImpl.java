package com.zhiyou.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.AdminMapper;
import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.Admin;
import com.zhiyou.model.User;
import com.zhiyou.service.AdminService;
import com.zhiyou.service.UserService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminMapper mapper;
	
	//管理员登录
	@Override
	public Admin adminLogin(HttpServletRequest req, String accounts, String password) {
		Admin admin = mapper.selectByAccounts(accounts);
		//判断admin的登录信息
		if (admin!=null) {
			//账号存在,密码错误
			if (!admin.getPassword().equals(password)) {
				req.setAttribute("msg", "您输入的密码错误,请重新输入!");
				return null;
			}
		}else {
			//账号不存在
			req.setAttribute("msg", "您输入的账号不存在,请输入正确的账号!");
		}
		return admin;
	}
	
	
	public void add(Admin admin) {
		mapper.add(admin);
	}

	public void update(Admin admin) {
		mapper.update(admin);
	}

	public void delete(int id) {
		mapper.delete(id);
	}

	public List<Admin> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public Admin selectByID(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByID(id);
	}



}
