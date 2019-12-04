package com.zhiyou.service.impl;

import java.util.List;

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

	public User selectByID(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByID(id);
	}


}
