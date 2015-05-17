package com.sublime.np.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private int total;
	
	@ManyToMany(mappedBy="tags")
	private List<Question> questions;

}
