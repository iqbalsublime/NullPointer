package com.sublime.np.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sublime.np.entity.Question;
import com.sublime.np.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

//	List<Tag> findByQuestion(Question question);


}
