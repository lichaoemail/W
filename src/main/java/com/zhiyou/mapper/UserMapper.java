package com.zhiyou.mapper;

import java.util.List;


import com.zhiyou.model.User;
// 保持接口的权限定名与mapper中的namespace一致
public interface UserMapper {
	//用户注册
	public void add(User user);	//方法名保持与对应mapper中的id一致
	//修改用户
	public void update(User user); //参数与mapper中的parameterType一致
	//删除用户
	public void delete(int id);
	
	List<User> selectAll(); //返回值与mapper中的resultType一致	
	
	//根据id查询用户
	public User selectById(int id);
	//根据账号查询
	public User selectByAccounts(String accounts);
}
