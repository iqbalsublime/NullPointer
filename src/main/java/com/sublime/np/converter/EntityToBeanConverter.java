package com.sublime.np.converter;

import com.sublime.np.bean.QuestionBean;
import com.sublime.np.entity.Question;

public class EntityToBeanConverter {
	
	public static QuestionBean convertQuestionIntoToBean(Question entity) {
		QuestionBean bean = new QuestionBean();
		bean.setId(entity.getId());
		bean.setUserName(entity.getUser().getName());
		bean.setTitle(entity.getTitle());
		bean.setDescription(entity.getDescription());
		bean.setUserId(entity.getUser().getId());
		bean.setPublishedDate(entity.getPublishedDate());
		bean.setTagId(entity.getTag().getId());
		bean.setTagName(entity.getTag().getName());
		return bean;
	}
}
