package com.sublime.np.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sublime.np.entity.Comment;
import com.sublime.np.entity.Question;
import com.sublime.np.entity.Role;
import com.sublime.np.entity.Tag;
import com.sublime.np.entity.User;
import com.sublime.np.repository.CommentRepository;
import com.sublime.np.repository.QuestionRepository;
import com.sublime.np.repository.RoleRepository;
import com.sublime.np.repository.TagRepository;
import com.sublime.np.repository.UserRepository;

@Transactional
@Service
public class InitDbService {

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TagRepository tagRepository;
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private CommentRepository commentRepository;



	

	@PostConstruct
	public void init() {
		
			Role roleUser = new Role();
			roleUser.setName("ROLE_USER");
			roleRepository.save(roleUser);

			Role roleAdmin = new Role();
			roleAdmin.setName("ROLE_ADMIN");
			roleRepository.save(roleAdmin);

			User userAdmin = new User();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			userAdmin.setName("admin");
			userAdmin.setEnabled(true);
			userAdmin.setPassword(encoder.encode("admin"));
			List<Role> roles = new ArrayList<Role>();
			roles.add(roleAdmin);
			roles.add(roleUser);
			userAdmin.setRoles(roles);
			userRepository.save(userAdmin);
			
			Tag tag1 = new Tag();
			tag1.setName("Java");
			tagRepository.save(tag1);
			Tag tag2 = new Tag();
			tag2.setName("Java Script");
			tagRepository.save(tag2);
			
		
			
			Question question1 = new Question();
			question1.setTitle("Null Pointer Exception problem");
			question1.setDescription("My problem is blah blah......................gddgdddddddddddddddddddddddddddddddddddddddddddddddddd.");
			question1.setUser(userAdmin);
			question1.setPublishedDate(new Date());
			question1.setTag(tag1);
			questionRepository.save(question1);
			
			Question question2 = new Question();
			question2.setTitle("SQL Exception");
			question2.setDescription("My problem is blah blah...gdgdjkgjdkgkdjkgjkdjkgkdjkgjkdjkgjdkjkgjkdjkkddddddjdkgkdjkgkdjkgjkdjkjgkdjkgjkdjkgjdk....................");
			question2.setUser(userAdmin);
			question2.setPublishedDate(new Date());
			question2.setTag(tag2);
			questionRepository.save(question2);
			

			Comment comment1 = new Comment();
			comment1.setCommentText("Hello");
			comment1.setPublishedDate(new Date());
			comment1.setUser(userAdmin);
			comment1.setQuestion(question1);
			
			Comment comment2 = new Comment();
			comment2.setCommentText("Hello......");
			comment2.setPublishedDate(new Date());
			comment2.setUser(userAdmin);
			comment2.setQuestion(question1);
			commentRepository.save(comment1);
			commentRepository.save(comment2);

		
	}
}
