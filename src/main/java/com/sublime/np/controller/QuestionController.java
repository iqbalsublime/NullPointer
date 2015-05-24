package com.sublime.np.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sublime.np.entity.Answer;
import com.sublime.np.entity.Comment;
import com.sublime.np.entity.Question;
import com.sublime.np.service.QuestionService;
import com.sublime.np.service.UserService;



@Controller
public class QuestionController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private QuestionService questionService;
	
	@ModelAttribute("answer")
	public Answer constructAnswer(){
		return new Answer();
	}
	
	@ModelAttribute("comment")
	public Comment constructComment(){
		return new Comment();
	}

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
	
	@RequestMapping(value="/question/{id}", method=RequestMethod.POST)
	public String addAnswer(Model model,@Valid @ModelAttribute("answer") Answer answer, Principal principal, BindingResult result,  @PathVariable int id){
		Question question = questionService.findOne(id);
		answer.setQuestion(question);
		String name = principal.getName();
		questionService.saveAnser(answer, name);
		return "redirect:/question/{id}.html?success=true";
	}
}
