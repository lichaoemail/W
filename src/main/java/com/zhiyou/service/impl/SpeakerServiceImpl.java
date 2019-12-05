package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.SpeakerMapper;
import com.zhiyou.mapper.UserMapper;
import com.zhiyou.model.Speaker;
import com.zhiyou.model.User;
import com.zhiyou.service.SpeakerService;
import com.zhiyou.service.UserService;

@Service
public class SpeakerServiceImpl implements SpeakerService{
	
	@Autowired
	SpeakerMapper mapper;
	
	public void add(Speaker speaker) {
		mapper.add(speaker);
	}

	public void update(Speaker speaker) {
		mapper.update(speaker);
	}

	public void delete(int id) {
		mapper.delete(id);
	}

	public List<Speaker> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public User selectByID(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByID(id);
	}

}
