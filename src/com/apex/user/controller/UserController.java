package com.apex.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.apex.user.bao.UserBO;
import com.apex.user.vo.User;

@Controller
public class UserController {
	
	@Autowired
	UserBO userBo;
	
	@RequestMapping("/enter.do")
	public String entry(@ModelAttribute User user) {
		
		
		return "person"; 
	} 
	
	@RequestMapping("/processregistraionform.do")
	public String processRegistraionForm(@ModelAttribute User user) {
		
		System.out.println("UserController:processRegistraionForm:start");
		
		userBo.addUser(user);
		
		System.out.println("UserController:processRegistraionForm:exiting");
		return "success"; 
	}
	
}
