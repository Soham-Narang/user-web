package com.apex.user.bao;

import com.apex.user.vo.User;

public interface UserBO {
	
	public User getUser(int userId);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int userId);
	
}
