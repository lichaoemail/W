package com.zhiyou.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.zhiyou.model.Admin;

// 保持接口的权限定名与mapper中的namespace一致
public interface AdminService {
	public Admin adminLogin(HttpServletRequest req, String accounts, String password);
	
	
	void add(Admin admin);	//方法名保持与对应mapper中的id一致
	void update(Admin admin); //参数与mapper中的parameterType一致
	void delete(int id);
	List<Admin> selectAll(); //返回值与mapper中的resultType一致	
	Admin selectByID(int id);
	
}
