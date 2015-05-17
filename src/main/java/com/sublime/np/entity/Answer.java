package com.sublime.np.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String title;

	private String description;
	
	@Column(name = "published_date")
	private Date publishedDate;
	
	private int upVote;

	private int downVote;
	
	@ManyToOne
	@JoinColumn(name="question_id")
	private Question question;
	
	

}
