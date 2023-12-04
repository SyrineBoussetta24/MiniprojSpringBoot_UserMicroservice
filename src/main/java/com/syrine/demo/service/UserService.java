package com.syrine.demo.service;

import java.util.List;

import com.syrine.demo.entities.Role;
import com.syrine.demo.entities.User;
public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
}
