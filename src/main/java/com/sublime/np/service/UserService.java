package com.sublime.np.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sublime.np.entity.Answer;
import com.sublime.np.entity.Question;
import com.sublime.np.entity.User;
import com.sublime.np.repository.AnswerRepository;
import com.sublime.np.repository.QuestionRepository;
import com.sublime.np.repository.RoleRepository;
import com.sublime.np.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private AnswerRepository answerRepository;

	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User findOne(int id) {
		return userRepository.findOne(id);
	}


	public User findOneWithQuestions(String name) {
		User user = userRepository.findByName(name);
		return findOneWithQuestion(user.getId());
	}
	
	public User findOneWithQuestion(int id) {
		User user = findOne(id);
		List<Answer> answers = answerRepository.findByUser(user);
		List<Question> questions =  questionRepository.findByUser(user);
		/*for (Question question : questions) {
			List<Tag> tags = tagService.findByQuestion(question);
			question.setTags(tags);
		}*/
		user.setAnswers(answers);
		user.setQuestions(questions);
		return user;
	}

	public void save(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		userRepository.save(user);
	}

	public User findOne(String username) {
		return userRepository.findByName(username);
	}

	
	

}
