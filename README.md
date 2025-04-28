# Low Level Design (LLD) Patterns and Problems

📜 Overview
This repository contains important low-level design patterns and detailed design solutions for classic system problems like LRU Cache, Logging System, StackOverflow, and Parking Lot.
It serves as a guide for practicing object-oriented principles, system decomposition, and design pattern applications.

🛠️ OOP Principles Covered

SOLID principles

Encapsulation, Abstraction, Polymorphism, Inheritance

Design for interfaces, composition over inheritance

📖 Design Patterns

Pattern	Description	Example

Singleton	Ensure only one instance exists globally	Logger, Configuration Manager
Factory	Create objects without exposing creation logic	Notification Factory (Email, SMS)
Strategy	Define a family of algorithms and make them interchangeable	Payment Strategy (Card, Wallet, UPI)
Observer	Notify dependent objects when state changes	Event systems, Notification updates
Decorator	Add behavior to objects dynamically	Adding features to user accounts
Adapter	Bridge two incompatible interfaces	Different payment gateway APIs
Builder	Construct complex objects step by step	Building User Profile Object

🧩 Design Problems
1. LRU Cache
Problem: Design a cache that evicts the least recently used item when full.

Key Concepts:

Doubly Linked List for ordering

HashMap for O(1) access

Classes:

LRUCache

Node

Key Operations:

get(key), put(key, value)

2. Logging System
Problem: Design a scalable logging system.

Key Concepts:

Multiple log levels (INFO, ERROR, DEBUG)

Patterns Used:

Singleton (Logger instance)

Strategy (Different logging destinations: file, console, database)

Classes:

Logger

LogAppender

ConsoleAppender, FileAppender

3. StackOverflow (Design Q&A Platform)
Problem: Design a simplified StackOverflow system.

Key Concepts:

Users, Questions, Answers, Comments, Votes

Tagging system

Search functionality

Classes:

User

Question, Answer, Comment

Vote

Tag

4. Parking Lot System
Problem: Design a parking lot with multiple types of spots and vehicles.

Key Concepts:

Different types of vehicles: Bike, Car, Truck

Patterns Used:

Singleton

Strategy (Vehicle type)

Classes:

ParkingLot

Level

ParkingSpot

Vehicle (Bike, Car, Truck)

Ticket


🚀 Best Practices
Always design for scalability and flexibility.

Start with interfaces and abstract classes first.

Apply appropriate design patterns where natural, not forced.

Document class diagrams and sequence diagrams when possible.

Think about extensibility (e.g., adding a new vehicle type in Parking Lot).

📚 References
Design Patterns: Elements of Reusable Object-Oriented Software (GoF)

System Design Primer

✍️ Contributions
Feel free to raise PRs for:

New Design Patterns

Additional system design problems

Improved code examples

📬 Contact
For suggestions or queries, feel free to open an issue or reach out.
