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
import com.sublime.np.entity.Question;
import com.sublime.np.service.QuestionService;
import com.sublime.np.service.TagService;
import com.sublime.np.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private QuestionService questionService;
	
	@Autowired
	private TagService tagService;
	
	@ModelAttribute("question")
	public Question constructQuestion(){
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
		model.addAttribute("tags", tagService.findAll());
		return "newquestion";
	}
	
	@RequestMapping(value="/newquestion", method=RequestMethod.POST)
	public String addBlog(Model model,@Valid @ModelAttribute("question") Question question, Principal principal, BindingResult result){
		if(result.hasErrors()){
			return account(model, principal);
		}
		String name = principal.getName();
		questionService.save(question, name);
		return "redirect:/newquestion.html?success=true";
	}
	
	@RequestMapping("/tag/{id}")
	public String tagDetails(Model model, @PathVariable int id){
		model.addAttribute("tag", tagService.findOne(id));
		return "tag-detail";
	}
	
	/*@RequestMapping("/angular")
	public String angular(Model model, String principal){
		System.out.println(principal);
		return "account";
	}*/
	
	@RequestMapping(value = "/angular", method = RequestMethod.GET)
	public @ResponseBody String getAllProfiles( ModelMap model ) {
	    String jsonData = "[{\"firstname\":\"ajitesh\",\"lastname\":\"kumar\",\"address\":\"211/20-B,mgstreet\",\"city\":\"hyderabad\",\"phone\":\"999-888-6666\"},{\"firstname\":\"nidhi\",\"lastname\":\"rai\",\"address\":\"201,mgstreet\",\"city\":\"hyderabad\",\"phone\":\"999-876-5432\"}]";
	    return jsonData;
	}
	
}
