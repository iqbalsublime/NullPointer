package com.sublime.np.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.sublime.np.annotation.UniqueUsername;


@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Size(min=3, message = "Name must be at lease 3 characters !" )
	@Column(unique = true)
	@UniqueUsername(message = "Such a username already exists!")
	private String name;
	
	@Size(min=3, message = "Invalid email address!")
	@Email(message ="Invalid email address!")
	private String email;

	@Size(min=3, message = "Password must be at lease 3 characters !" )
	private String password;
	
	private boolean enabled;
	
	@ManyToMany
	@JoinTable
	private List<Role> roles;
	
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Question> questions;
	
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Answer> answers;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
}
