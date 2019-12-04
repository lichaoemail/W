package com.zhiyou.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhiyou.model.Admin;
import com.zhiyou.model.User;
import com.zhiyou.service.UserService;
//import com.zhiyou100.entity.ResponseVo;
//import com.zhiyou100.entity.UserLoginException;

@Controller
@RequestMapping("login")
public class AdminController {
//	@Autowired
//	private UserService service;
//	
//	@PostMapping
//	public @ResponseBody ResponseVo<User> login(@RequestBody User u,HttpSession session)throws  UserLoginException{
//		System.out.println("登陆：：u="+u);
//		User dbUser=service.login(u.getUname(), u.getUpwd());
//		session.setAttribute("user", dbUser);
//		return new ResponseVo<User>(dbUser, 200, "登陆成功！");
//	}
//	@PutMapping("/{uid}")
//	public @ResponseBody ResponseVo<String> logout(@PathVariable("uid") Integer uid,HttpSession session)throws  UserLoginException{
//		System.out.println("登出：：uid="+uid);
//		service.logOut(uid);
//		session.invalidate();
//		return new ResponseVo<String>("", 200, "登出成功！");
//	}
	
	@Autowired
	private UserService service;
	

	 @RequestMapping(value = "islogin", method = RequestMethod.POST)
	 public String isLogin(Admin admin) {
		System.out.println("accounts=" + admin.getAccounts()+",password="+ admin.getPassword());
		return "sendRedirect:success";
	 }	

	 

}
