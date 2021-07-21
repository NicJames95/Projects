package com.project.entities;

import java.util.LinkedList;
import java.util.List;

public class UserService {
	
	public List<User> users = new LinkedList<>();
	
	public void saveUser(User user) {
		users.add(user);

	}
	
	public User findByEmail(String email) {
		for(int i=0; i<users.size();i++) {
			User user = users.get(i);
			if(user.getEmail().equals(email)) {
				return user;
			}
		} return null;
	}
	
	
	

}
