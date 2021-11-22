package com.apex.user.bao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apex.user.dao.UserDAO;
import com.apex.user.vo.User;

@Service
public class UserBOImpl implements UserBO {

	@Autowired
	UserDAO userDao;
	
	@Override
	public User getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void addUser(User user) {
		
		System.out.println("UserBOImpl :addUser: Start ");
		
		userDao.addUser(user);
		
		System.out.println("UserBOImpl :addUser: end");
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
