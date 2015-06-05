package com.sublime.np.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sublime.np.bean.QuestionBean;
import com.sublime.np.converter.EntityToBeanConverter;
import com.sublime.np.entity.Comment;
import com.sublime.np.entity.Question;
import com.sublime.np.entity.Shop;
import com.sublime.np.entity.User;
import com.sublime.np.service.QuestionService;

@Controller
public class JSONController {
	
	
	@Autowired
	private QuestionService questionService;

	@RequestMapping(value = "mkyoung", method = RequestMethod.GET)
	public @ResponseBody Object getShopInJSON() {

		Shop shop = new Shop();
		shop.setName("G");
		shop.setStaffName(new String[] { "mkyong1", "mkyong2" });
		Shop shop1 = new Shop();
		shop1.setName("G1");
		shop1.setStaffName(new String[] { "mkyong1", "mkyong2" });
		List<Shop> shops = new ArrayList<Shop>();
		shops.add(shop1);
		shops.add(shop);
		
		User user1 = new User();
		user1.setId(1);
		user1.setEmail("iqbal@gmail.com");
		user1.setName("Iqbal");
		User user2 = new User();
		user2.setId(1);
		user2.setEmail("iqbal@gmail.com");
		user2.setName("Iqbal");
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
		List<Question> questions = questionService.getAll();
		
		
		return users;

	}
	
	@RequestMapping(value = "getquestion", method = RequestMethod.GET)
	public @ResponseBody List<QuestionBean> getQuestion() {
		List<Question> questions = questionService.getAll();
		List<QuestionBean> questionbeans = new ArrayList<QuestionBean>();
		for (Question question : questions) {
			QuestionBean questionBean = new QuestionBean();
			questionBean = EntityToBeanConverter.convertQuestionIntoToBean(question);
			questionbeans.add(questionBean);
		}
		return questionbeans;
	}
	
	@RequestMapping(value = "postcomment",method = RequestMethod.POST)
	@ResponseBody public Object postForm(@RequestBody Comment comment) {
		System.out.println("Hello"+" "+comment.getCommentText());
		
		return comment;
	}

}