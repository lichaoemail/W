package com.zhiyou.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.zhiyou.model.User;
import com.zhiyou.service.UserService;
import com.zhiyou.util.FtpUtil;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	public void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String accounts = req.getParameter("email");
		String password = req.getParameter("password");
		User user = service.userLogin(req, accounts, password);
		req.getSession().setAttribute("user", user);
		if (user != null) {
			resp.getWriter().write("success".toCharArray());
		} else {
			resp.getWriter().write(req.getAttribute("msg").toString().toCharArray());
		}
	}

	@RequestMapping("reg_email")
	public void regEmail(String email, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.getWriter().write(service.userReg(email));
	}

	@RequestMapping("user_reg")
	public void userReg(String email, String password, HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		service.add(new User(null, email, null, password, null, null, null, null, null, null));
		resp.getWriter().write("success");
	}

	@RequestMapping("user_exit")
	public void exit(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		req.getSession().setAttribute("user", null);
		req.getSession().setAttribute("admin", null);
		resp.getWriter().write("success".toCharArray());
	}

	@RequestMapping("user_show")
	public String show(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		return "usershow";
	}

	@RequestMapping("user_update")
	public String update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String service = req.getParameter("service");
		if (service.equals("data")) {
			return "data";
		}
		if (service.equals("password")) {
			return "password";
		}
		if (service.equals("img")) {
			return "img";
		}
		return "";
	}

	@RequestMapping("user_alter")
	public String alter(User user, HttpServletRequest req, HttpServletResponse resp) throws IOException {
		service.update(user);
		req.getSession().setAttribute("user", service.selectById(user.getId()));
		return "usershow";
	}

	@RequestMapping("upload.do")
	public String upload(MultipartFile file1, int id, HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String imgurl = FtpUtil.upload(file1.getInputStream(), file1.getOriginalFilename());
		service.update(new User(id, null, null, null, null, null, null, null, imgurl, null));
		req.getSession().setAttribute("user", service.selectById(id));
		return "usershow";
	}
	
	
	
	
/*	@RequestMapping("show")
	public String show(HttpServletRequest req,HttpServletResponse rep) {
		req.setAttribute("list",service.selectAll());
		return "show";
	}
	
	@RequestMapping("add")
	public String add(User user,HttpServletRequest req,HttpServletResponse rep) {
		service.add(user);
		return "redirect:show";
	}
	
	@RequestMapping("delete")
	public String add(int id,HttpServletRequest req,HttpServletResponse rep) {
		service.delete(id);
		return "redirect:show";
	}
	
	@RequestMapping("selectByID")
	public String selectByID(int id,HttpServletRequest req,HttpServletResponse rep) {
		req.setAttribute("user", service.selectById(id));
		return "update";
	}
	
	@RequestMapping("update")
	public String update(User user,HttpServletRequest req,HttpServletResponse rep) {
		service.update(user);
		return "redirect:show";
	}*/
}
