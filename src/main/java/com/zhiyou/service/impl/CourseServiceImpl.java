package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.CourseMapper;
import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.Course;
import com.zhiyou.model.User;
import com.zhiyou.service.CourseService;
import com.zhiyou.service.UserService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseMapper mapper;
	
	public void add(Course course) {
		mapper.add(course);
	}

	public void update(Course course) {
		mapper.update(course);
	}

	public void delete(int id) {
		mapper.delete(id);
	}

	public List<Course> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public User selectByID(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByID(id);
	}

}
