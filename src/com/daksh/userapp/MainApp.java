package com.daksh.userapp;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserService service = new UserService();
		while(true) {
			System.out.println("\n====== USER APP MENU ======");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Show all user(for demo)");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter userName: ");
				String username = sc.nextLine();
				
				System.out.println("Enter password: ");
				String password = sc.nextLine();
				
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				
				String regMsg = service.registerUser(username, password, email);
				System.out.println(regMsg);
				break;
				
			case 2:
				System.out.println("Enter username: ");
				String uname = sc.nextLine();
				
				System.out.println("Enter password: ");
				String pass = sc.nextLine();
				
				String loginMsg = service.loginUser(uname, pass);
				System.out.println(loginMsg);
				break;
				
			case 3: 
				service.showAll();
				break;
				
			case 4:
				System.out.println("Exiting the application....Thank You:)");
				sc.close();
				System.exit(0);
				
			default:
				System.out.println("Invalid choice please try again");
			}
		}
	}
}
