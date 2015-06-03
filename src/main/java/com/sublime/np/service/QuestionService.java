package com.sublime.np.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.sublime.np.entity.Answer;
import com.sublime.np.entity.Comment;
import com.sublime.np.entity.Question;
import com.sublime.np.entity.Tag;
import com.sublime.np.entity.User;
import com.sublime.np.repository.AnswerRepository;
import com.sublime.np.repository.CommentRepository;
import com.sublime.np.repository.QuestionRepository;
import com.sublime.np.repository.TagRepository;
import com.sublime.np.repository.UserRepository;

@Service
@Transactional
public class QuestionService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;
	
	@Autowired
	private CommentRepository commentRepository;

	/*@Autowired
	private TagRepository tagRepository;*/

	public void save(Question question, String name) {
		User user = userRepository.findByName(name);
		question.setPublishedDate(new Date());
		question.setUser(user);
		questionRepository.save(question);
		
	}

	public List<Question> getAll() {
		return questionRepository.findAll();
	}

	public Question findOne(int id) {
		Question question = questionRepository.findOne(id);
		//Tag tag = tagRepository.findOneByQuestion(question);
		List<Comment> comments = commentRepository.findByQuestion(question);
		List<Answer> answers = answerRepository.findByQuestion(question);
		question.setAnswers(answers);
		question.setComments(comments);
		//question.setTag(tag);
		return question;
	}
	
	public void saveAnser(Answer answer, String name) {
		User user = userRepository.findByName(name);
		answer.setPublishedDate(new Date());
		answer.setUser(user);
		answerRepository.save(answer);
		
	}



}
