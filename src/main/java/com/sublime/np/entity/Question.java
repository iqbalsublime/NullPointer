package com.sublime.np.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Size(min=1, message = "Title must be at lease 1 characters !" )
	private String title;
	
	private String description;
	
	private int upVote;

	private int downVote;
	
	@Column(name = "published_date")
	private Date publishedDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.REMOVE)
	private List<Answer> answer;
	
	@ManyToMany
	@JoinTable
	private List<Tag> tags;

}
