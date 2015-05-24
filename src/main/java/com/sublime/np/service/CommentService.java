package com.sublime.np.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sublime.np.repository.RoleRepository;
import com.sublime.np.repository.UserRepository;

@Service
@Transactional
public class CommentService {
	
	@Autowired
	private UserRepository userRepository;

	
	@Autowired
	private RoleRepository roleRepository;
	
	



}
