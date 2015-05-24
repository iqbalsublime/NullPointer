package com.sublime.np.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sublime.np.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

	

}
