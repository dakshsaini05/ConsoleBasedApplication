package com.daksh.userapp;

import java.util.ArrayList;

import java.util.List;

public class UserService {
	// List to store registered user 
	private List<User> users = new ArrayList<>();
	
	// Registration method
	public String registerUser(String username, String password, String email) {
		for(User user : users) {
			if(user.getUsername().equalsIgnoreCase(username)) {
				return "UserName already taken please try another";
			}
		}
		
		// create and add new user 
		users.add(new User(username, password, email));
		
		return "Registration successful";
	}
	
	public String loginUser(String username, String password) {
		for(User user : users) {
			if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) {
				return "Login Successful. Welcome, "+username;
			}
		}
		return "Invalid username or password";
	}
	
	// display all registered users(for demo)
	public void showAll() {
		if(users.isEmpty()) {
			System.out.println("No registered user yet");
		} else {
			System.out.println("====== Registered Users ======");
			for(User user:users) {
				System.out.println("Username: "+ user.getUsername() + ", Email: "+ user.getEmail()+ " | ");
			}
		}
	}
}
