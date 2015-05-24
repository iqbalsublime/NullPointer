package com.sublime.np.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sublime.np.entity.Comment;
import com.sublime.np.entity.Question;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

	List<Comment> findByQuestion(Question question);

	

}
