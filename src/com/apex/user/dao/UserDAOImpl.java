package com.apex.user.dao;

import org.springframework.stereotype.Repository;

import com.apex.user.vo.User;

@Repository
public class UserDAOImpl implements UserDAO {

	
	
	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		System.out.println("UserDAOImpl :addUser: Start ");
		
		
		
		System.out.println("UserDAOImpl :addUser: end");	
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

}
