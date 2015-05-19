package com.sublime.np.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sublime.np.service.QuestionService;

	@Controller
	public class IndexController {
		
		@Autowired
		private QuestionService questionService;
	
		@RequestMapping("/index")
		public String index(Model model){
			model.addAttribute("questions", questionService.getAll());
			return "index";
			
		}
	}
