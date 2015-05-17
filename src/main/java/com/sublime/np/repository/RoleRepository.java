package com.sublime.np.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sublime.np.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByName(String string);

}
