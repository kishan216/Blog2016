package com.mns.blog.daos;

import com.mns.blog.entity.User;

public interface UserLogin {

	public User getUser(String userId,String password);
	
	public boolean addUser(String userId,String password);
	
	public boolean deleteUser(String userId);
	
	public boolean updateUser(String userId, String password);
	
}
