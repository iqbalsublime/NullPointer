package com.sublime.np.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sublime.np.service.QuestionService;
import com.sublime.np.service.UserService;



@Controller
public class QuestionController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private QuestionService questionService;

	@RequestMapping("/users/{id}")
	public String detail(Model model, @PathVariable int id){
		model.addAttribute("user", userService.findOneWithQuestion(id));
		return "user-detail";
	}
	
	@RequestMapping("/question/{id}")
	public String questionDetails(Model model, @PathVariable int id){
		model.addAttribute("question", questionService.findOne(id));
		return "question-detail";
	}
}
