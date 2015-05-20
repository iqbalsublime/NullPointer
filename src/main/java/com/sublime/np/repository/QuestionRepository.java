package com.sublime.np.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sublime.np.entity.Question;
import com.sublime.np.entity.Tag;
import com.sublime.np.entity.User;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

	List<Question> findByUser(User user);

	List<Question> findByTag(Tag tag);


}
