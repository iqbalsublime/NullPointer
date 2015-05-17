package com.sublime.np.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sublime.np.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User findByName(String name);



}
