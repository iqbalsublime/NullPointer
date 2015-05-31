package com.sublime.np.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sublime.np.entity.Answer;
import com.sublime.np.entity.Comment;
import com.sublime.np.entity.Question;
import com.sublime.np.service.CommentService;
import com.sublime.np.service.QuestionService;
import com.sublime.np.service.UserService;



@Controller
public class QuestionController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping(value = "/getAllProfiles", method = RequestMethod.GET)
	public  @ResponseBody String getAllProfiles( ModelMap model ) {
		String jsonData = "[{\"firstname\":\"ajitesh\",\"lastname\":\"kumar\",\"address\":\"211/20-B,mgstreet\",\"city\":\"hyderabad\",\"phone\":\"999-888-6666\"},{\"firstname\":\"nidhi\",\"lastname\":\"rai\",\"address\":\"201,mgstreet\",\"city\":\"hyderabad\",\"phone\":\"999-876-5432\"}]";
		return jsonData;
	}
	

	@RequestMapping("/users/{id}")
	public String detail(Model model, @PathVariable int id){
		model.addAttribute("user", userService.findOneWithQuestion(id));
		return "user-detail";
	}
	
	@RequestMapping("/question/{id}")
	public String questionDetails(Model model, @PathVariable int id){
		model.addAttribute("question", questionService.findOne(id));
		model.addAttribute("answer", new Answer());
		model.addAttribute("comment", new Comment());
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
	
	/*@RequestMapping(value="/comment/{id}", method=RequestMethod.POST)
	public String addComment(Model model,@Valid @ModelAttribute("comment") Comment comment, Principal principal, BindingResult result,  @PathVariable int id){
		Question question = questionService.findOne(id);
		comment.setQuestion(question);
		String name = principal.getName();
		commentService.save(comment, name);
		return "redirect:/question/{id}.html?success=true";
	}*/
}
