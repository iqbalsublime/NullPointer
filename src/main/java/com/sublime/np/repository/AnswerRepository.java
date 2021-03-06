package com.sublime.np.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sublime.np.entity.Answer;
import com.sublime.np.entity.Question;
import com.sublime.np.entity.User;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {

	List<Answer> findByQuestion(Question question);

	List<Answer> findByUser(User user);

}
