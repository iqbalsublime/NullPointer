package com.sublime.np.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sublime.np.entity.Question;
import com.sublime.np.entity.Tag;
import com.sublime.np.repository.QuestionRepository;
import com.sublime.np.repository.TagRepository;

@Service
@Transactional
public class TagService {
	
	@Autowired
	private TagRepository tagRepository;
	
	@Autowired
	private QuestionRepository questionRepository;

	public List<Tag> findAll() {
		return tagRepository.findAll();
	}

	public Tag findOne(int id) {
		Tag tag = tagRepository.findOne(id);
		List<Question> questions = questionRepository.findByTag(tag);
		tag.setQuestions(questions);
		return tag;
	}


}
