package com.sublime.np.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sublime.np.entity.Comment;
import com.sublime.np.entity.User;
import com.sublime.np.repository.CommentRepository;
import com.sublime.np.repository.RoleRepository;
import com.sublime.np.repository.UserRepository;

@Service
@Transactional
public class CommentService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private CommentRepository commentRepository;


	public void save(Comment comment, String name) {
		User user = userRepository.findByName(name);
		comment.setPublishedDate(new Date());
		comment.setUser(user);
		commentRepository.save(comment);
	}
	
	



}
