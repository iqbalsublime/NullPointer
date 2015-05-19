package com.sublime.np.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sublime.np.entity.Question;
import com.sublime.np.service.QuestionService;
import com.sublime.np.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private QuestionService questionService;
	
	@ModelAttribute("question")
	public Question constructBlog(){
		return new Question();
	}
	
	@RequestMapping("/account")
	public String account(Model model, Principal principal){
		String name = principal.getName();
		model.addAttribute("user", userService.findOneWithQuestions(name));
		return "account";
	}
	
	@RequestMapping("/newquestion")
	public String newquestion(Model model, Principal principal){
		
		return "newquestion";
	}
	
	@RequestMapping(value="/newquestion", method=RequestMethod.POST)
	public String addBlog(Model model,@Valid @ModelAttribute("question") Question question, Principal principal, BindingResult result){
		if(result.hasErrors()){
			return account(model, principal);
		}
		String name = principal.getName();
		questionService.save(question, name);
		return "redirect:/newquestion.html";
	}
	
	
}
