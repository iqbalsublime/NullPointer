package com.sublime.np.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Question {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Size(min=5, message = "Title must be at least 5 characters !" )
	private String title;
	
	@Size(min=20, message = "Description must be at least 20 characters !" )
	private String description;
	
	private int upVote;

	private int downVote;
	
	@Column(name = "published_date")
	private Date publishedDate;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.REMOVE)
	private List<Answer> answers;
	
	@OneToMany(mappedBy="question", cascade=CascadeType.REMOVE)
	private List<Comment> comment;
	
	@ManyToOne
	@JoinColumn(name="tag_id")
	private Tag tag;
	
	
	public List<Comment> getComment() {
		return comment;
	}


	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getUpVote() {
		return upVote;
	}


	public void setUpVote(int upVote) {
		this.upVote = upVote;
	}


	public int getDownVote() {
		return downVote;
	}


	public void setDownVote(int downVote) {
		this.downVote = downVote;
	}


	public Date getPublishedDate() {
		return publishedDate;
	}


	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}


	public Tag getTag() {
		return tag;
	}


	public void setTag(Tag tag) {
		this.tag = tag;
	}


	



}
