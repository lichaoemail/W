package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.SubjectMapper;
import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.Subject;
import com.zhiyou.model.User;
import com.zhiyou.service.SubjectService;
import com.zhiyou.service.UserService;

@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	SubjectMapper mapper;
	
	public void add(Subject subject) {
		mapper.add(subject);
	}

	public void update(Subject subject) {
		mapper.update(subject);
	}

	public void delete(int id) {
		mapper.delete(id);
	}

	public List<Subject> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public User selectByID(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByID(id);
	}

}
