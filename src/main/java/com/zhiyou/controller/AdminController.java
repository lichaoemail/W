package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhiyou.model.Admin;
import com.zhiyou.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService service;

	@RequestMapping("admin_login")
	public void login(HttpServletRequest req, HttpServletResponse resp) throws Exception {
	
		//1.获取请求参数
		String accounts = req.getParameter("accounts");
		String password = req.getParameter("password");
		
		//2.将admin的登录信息  放入session域中共享数据
		Admin admin = service.adminLogin(req, accounts, password);
		req.getSession().setAttribute("admin", admin);
		
		//3.验证登录
		if (admin!=null) {
			resp.getWriter().write("success".toCharArray());
		}else {
			resp.getWriter().write(req.getAttribute("msg").toString().toCharArray());
		}
	}

}
