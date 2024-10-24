package com.syrine.demo.service;

import java.util.List;

import com.syrine.demo.entities.Role;
import com.syrine.demo.entities.User;
import com.syrine.demo.service.register.RegistrationRequest;
public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	User registerUser(RegistrationRequest request);
	public void sendEmailUser(User u, String code);
	
	public User validateToken(String code);
}
