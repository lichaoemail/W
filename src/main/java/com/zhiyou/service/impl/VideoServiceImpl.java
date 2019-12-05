package com.zhiyou.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou.mapper.UserMapper;
import com.zhiyou.mapper.VideoMapper;
import com.zhiyou.model.User;
import com.zhiyou.model.Video;
import com.zhiyou.service.UserService;
import com.zhiyou.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	VideoMapper mapper;
	
	public void add(Video video) {
		mapper.add(video);
	}

	public void update(Video video) {
		mapper.update(video);
	}

	public void delete(Integer[] ids) {
		mapper.delete(ids);
	}

	public List<Video> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	public User selectById(int id) {
		// TODO Auto-generated method stub
		 mapper.selectById(id);
		return null;
	}

	@Override
	public Video selectById(Integer video_id) {
		// TODO Auto-generated method stub
		return mapper.selectById(video_id);
	}

	@Override
	public List<Video> selectLike(String title, Integer speaker_id, Integer course_id) {
		// TODO Auto-generated method stub
		return mapper.selectLike(title, speaker_id, course_id);
	}


}
