# 🚗 Automobile Management System (Core Java)

A Core Java project developed to understand and implement Object-Oriented Programming (OOP) concepts through a real-world Automobile Management System.

## 📌 Project Overview

This project simulates the management of an automobile company by handling employees, departments, vehicles, customers, and orders using Java OOP principles.

The main objective of this project is to gain practical experience with Core Java by designing a real-world application instead of learning concepts individually.

---

## 🎯 Problem Statement

Managing an automobile company involves multiple entities such as:

- Employees
- Departments
- Vehicles
- Customers
- Orders
- Company

This project organizes these entities into separate packages and models their relationships using Object-Oriented Programming.

---

## 📂 Project Structure

```
com.automobile
│
├── company
├── customer
├── department
├── employee
├── order
├── vehicle
└── main
```

---

## ✅ OOP Concepts Implemented

### ✔ Encapsulation
- Private data members
- Getter and Setter methods
- Controlled access to object data

### ✔ Constructor Chaining
- `this()`
- `super()`

### ✔ Inheritance
- Employee → Engineer, SalesWorker, ProductionWorker, DepartmentManager
- Vehicle → Car, ElectricCar, SUV
- Department → HRDepartment, ManufacturingDepartment, ResearchDepartment, SalesDepartment

### ✔ HAS-A Relationship
- Company HAS-A Employee
- Company HAS-A Department
- Department HAS-A DepartmentManager
- Order HAS-A Customer
- Order HAS-A Vehicle

### ✔ Method Overriding
Different child classes override parent methods to provide their own implementation.

### ✔ Abstraction
Implemented using abstract classes and abstract methods.

### ✔ Runtime Polymorphism
Parent references pointing to child objects.

Example:

```java
Employee employee = new Engineers(...);

Vehicle vehicle = new SUV(...);
```

### ✔ Upcasting
```java
Employee emp = new Engineers(...);
```

### ✔ Downcasting
```java
Engineers engineer = (Engineers) emp;
```

---

## 🚙 Modules Implemented

### Employee Module
- Engineers
- Sales Worker
- Production Worker
- Department Manager

### Department Module
- HR Department
- Manufacturing Department
- Research Department
- Sales Department

### Vehicle Module
- Car
- Electric Car
- SUV

### Customer Module

### Order Module

### Company Module

---

## 🛠 Features

- Employee Management
- Department Management
- Vehicle Management
- Customer Management
- Order Management
- Company Management
- Display Details
- Login & Logout
- Vehicle Operations
- Customer Operations

---

## 📚 Concepts Practiced

- Packages
- Classes & Objects
- Constructors
- Constructor Chaining
- Encapsulation
- Inheritance
- Abstraction
- Method Overriding
- Runtime Polymorphism
- Upcasting
- Downcasting
- HAS-A Relationship
- Method Design

---

## 🚀 Learning Outcome

This project helped me understand how Object-Oriented Programming concepts work together in a real-world application.

Instead of learning concepts independently, I implemented them in a complete Automobile Management System, improving my understanding of Core Java design and object relationships.

---

## 🔮 Future Improvements

- Interfaces
- Exception Handling
- Collections Framework
- File Handling
- JDBC Database Integration
- Java Streams & Lambda Expressions
- Unit Testing
- Spring Boot REST APIs

---

## 👨‍💻 Developed By

**Krishna Mohan Awasthi**

MCA Student | Java Developer

---

⭐ If you found this project helpful, consider giving it a star.
