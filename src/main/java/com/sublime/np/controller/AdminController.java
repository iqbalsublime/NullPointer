package com.sublime.np.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sublime.np.service.UserService;

@Controller
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public String users(Model model){
		model.addAttribute("users", userService.findAll());
		return "users";
	}
	
	
	/*
	@RequestMapping("/user/remove/{id}")
	public String removeUser(@PathVariable int id){
		userService.delete(id);
		return "redirect:/users.html";
	}*/

}
