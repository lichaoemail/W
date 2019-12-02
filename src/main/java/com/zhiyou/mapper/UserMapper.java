package com.zhiyou.mapper;

import java.util.List;


import com.zhiyou.model.User;
// 保持接口的权限定名与mapper中的namespace一致
public interface UserMapper {
	void add(User user);	//方法名保持与对应mapper中的id一致
	void update(User user); //参数与mapper中的parameterType一致
	void delete(int id);
	List<User> selectAll(); //返回值与mapper中的resultType一致	
	User selectByID(int id);
}
