package com.zhiyou.interceptor;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
*@author 
*@version 创建时间:2019年11月25日 上午10:05:10
*@ClassName 类名称
*@Description 类描述
*/
@Repository
public class MyInterceptor  implements HandlerInterceptor{

	/**
	 * 在视图结合之后调用
	 * */
	@Override
	public void afterCompletion(HttpServletRequest req, HttpServletResponse resp, Object arg2, Exception arg3)
			throws Exception {
		
		System.out.println("在视图结合之后调用");
	}

	/**
	 * controller方法执行完,但是视图结合之前
	 * */
	@Override
	public void postHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2, ModelAndView modelAndView)
			throws Exception {
		// TODO Auto-generated method stub
	/*	ModelMap map = modelAndView.getModelMap();
		System.out.println("controller方法执行完,但是视图结合之前    ");
		*/
	}

	/**
	 * 
	 * 在请求方法controller方法之前调用
	 * return false表示拦截,true表示放行
	 * */
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object arg2) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println("return false:表示拦截;true表示放行");
		System.out.println("在请求方法controller方法之前调用,我的拦截器;false:表示拦截,true表示放行");
		return true;
	}




}
