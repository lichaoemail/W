<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/zhiyou/base.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/zhiyou/profile.css">
<link href="zhiyou/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>视频管理</title>
</head>
<body>

<header>
	<menu>
		<div class="container clearfix">
			<ul class="clearfix f_left">
				<li>视频管理系统</li>
				
				<li class="menu_active"><a href="">视频管理</a></li>
				<li class="menu_active"><a href="">主讲人管理</a></li>
				<li class="menu_active"><a href="">课程管理</a></li>
			</ul>
			
			<div id="user_bar">
				<span>${session.admin.accounts}</span>
				<a  id="lay_out" href="admin.jsp">退出</a>
			</div>
		</div>
	</menu>
</header>

<div style="float: left;margin-bottom: 10px">
<form action="user">
	搜索内容:<input type="text" placeholder="请输入关键字" name="value">
	搜索字段:<select name="name">
			<option>姓名</option>
			<option>员工ID</option>
		  </select>
		<input type="hidden" value="like" name="service">
		<input class="btn btn-primary btn-lg" type="submit" value="提交">
</form>
</div>
<div style="float: right"><button  type="button" class="btn btn-primary btn-lg" onclick="add()" float="left">添加员工</button></div>



</body>
</html>