🧑‍💻 Console Based User Registration & Login System (Java)

A simple console-based authentication system built using Core Java concepts like OOP, Collections and basic service layer design.

This project simulates how a real application handles:

1.User Registration

2.User Login

3.Duplicate Username Validation

4.Viewing Registered Users (for demo purpose)

It is designed as a beginner friendly project to understand application flow and separation of responsibilities before moving to JDBC / Database based systems.
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
📂 Project Structure
com.daksh.userapp
│
├── MainApp.java      → Handles user interaction (UI / Menu)
├── User.java         → Model class (User entity)
└── UserService.java  → Business logic & data handling
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
⚙️ Features
🔐 Registration

-> Accepts username, password and email

-> Prevents duplicate usernames

-> Stores user in memory (ArrayList)
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
🔑 Login

-> Validates username and password

-> Displays welcome message on success

-> Shows error on invalid credentials
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
📋 Show All Users (Demo)

-> Displays all registered users

-> Helps verify stored data
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
🧠 Concepts Used

-> Classes & Objects (OOP)

-> Encapsulation (Private fields + getters)

-> ArrayList (Dynamic Data Storage)

-> Loops & Conditional Logic

-> Layered Design (UI → Service → Model)

-> Basic Authentication Logic
