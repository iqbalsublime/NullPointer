package com.sublime.np.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.sublime.np.entity.Question;
import com.sublime.np.entity.User;
import com.sublime.np.repository.QuestionRepository;
import com.sublime.np.repository.UserRepository;

@Service
@Transactional
public class QuestionService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private QuestionRepository questionRepository;

	public void save(Question question, String name) {
		User user = userRepository.findByName(name);
		question.setPublishedDate(new Date());
		question.setUser(user);
		questionRepository.save(question);
		
	}

	public List<Question> getAll() {
		return questionRepository.findAll(new PageRequest(0, 8, Direction.DESC, "publishedDate")).getContent();
	}



}
