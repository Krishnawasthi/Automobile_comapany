# 🚗 Automobile Management System (Java OOP Project)

## 📌 About the Project

This project is a simple Java-based Automobile Management System created to strengthen my understanding of **Core Java** and **Object-Oriented Programming (OOP)** concepts.

Instead of building a GUI or database application, the main focus is to learn how real-world software is designed using Java classes and relationships.

---

## ❓ Problem Statement

An automobile company consists of multiple departments such as:

- Research & Development (R&D)
- Manufacturing
- Sales
- Human Resources

The company also manages:

- Employees
- Vehicles
- Customers
- Orders

Managing all these entities requires a proper object-oriented design where every object has its own responsibility and interacts with other objects.

This project aims to model that system using Java.

---

# 🎯 Project Goals

The objective of this project is to understand and implement:

- Object Creation
- Constructors
- Constructor Overloading
- Constructor Chaining
- Encapsulation
- Inheritance
- HAS-A Relationship
- IS-A Relationship
- Abstraction
- Method Overriding
- Runtime Polymorphism
- Upcasting
- Downcasting
- Access Modifiers

---

# 📂 Project Structure

```
Automobile Management System
│
├── company
├── employee
├── department
├── vehicle
├── customer
├── order
└── main
```

---

# ✅ Current Progress

### ✔ Completed

- Project Structure
- Package Creation
- Class Design
- Field Design
- Constructors
- Constructor Overloading
- Constructor Chaining
- Encapsulation
- Inheritance (IS-A)
- HAS-A Relationships
- Getters & Setters

---

### 🚧 In Progress

- Business Methods
- Department Operations
- Employee Operations
- Vehicle Operations

---

### 📅 Planned

- Abstraction
- Method Overriding
- Runtime Polymorphism
- Upcasting
- Downcasting
- Driver/Main Class
- Complete System Testing

---

# 🏗️ Current Design

```
AutomobileCompany
│
├── Employees
├── Departments
├── Vehicles
├── Customers
└── Orders

Department
│
├── Department Manager
└── Employees

Order
│
├── Customer
└── Vehicle
```

---
# 📖 Learning Approach

This project is **not copied from any tutorial**.

The goal is to develop problem-solving and object-oriented design skills by building the project step by step from scratch.

Each feature is implemented only after understanding the underlying Java concept.

---

# 🎯 Final Objective

After completing this project, I should be able to confidently design medium-sized Java applications using proper OOP principles and understand how real-world software is structured.

---

## 🛠️ Technologies Used

- Java
- Eclipse IDE
- Git
- GitHub

---

<img width="1057" height="642" alt="image" src="https://github.com/user-attachments/assets/f5b44239-3cc7-49f0-9411-a642ae499b64" />


## 🚀 Status

## 📖 What I Learned

Building this project helped me move beyond theory and understand how Object-Oriented Programming works in a real-world application.

During this project, I learned:

- Designing a real-world application using multiple Java packages.
- Creating classes and objects to represent real-world entities.
- Constructor overloading and constructor chaining using `this()` and `super()`.
- Implementing **Encapsulation** using private fields and getter/setter methods.
- Implementing **Inheritance** to reduce code duplication.
- Understanding the **HAS-A relationship** (Composition/Aggregation).
- Using **Method Overriding** to provide different behavior in child classes.
- Implementing **Abstraction** using abstract classes and abstract methods.
- Applying **Runtime Polymorphism** through upcasting.
- Understanding **Downcasting** and when it is required.
- Organizing code into reusable and maintainable modules.
- Building a complete Core Java project from scratch.

---

## 🚧 Challenges & Mistakes I Faced

While developing this project, I encountered several challenges that helped me improve my Java fundamentals.

- Initially, I struggled with constructor chaining using `this()` and `super()`.
- I mistakenly kept many fields `public` instead of making them `private` for proper encapsulation.
- I was confused about when getter and setter methods were actually needed.
- I faced difficulties understanding the difference between **IS-A** and **HAS-A** relationships.
- I encountered constructor mismatch errors after modifying parent class constructors.
- I experienced `ClassCastException` while learning downcasting and understood that an object can only be downcast to its actual type.
- I initially thought downcasting was required for every child object, but later learned it is only needed to access child-specific members.
- I learned how runtime polymorphism works through parent references pointing to child objects.
- I improved my understanding of organizing a project into multiple packages instead of writing everything in one class.
- I also solved several Git issues related to commits, pushing, merging, and repository management while developing this project.

---

## 🎯 Conclusion

This project significantly strengthened my Core Java fundamentals. It gave me practical experience in applying Object-Oriented Programming concepts to a real-world scenario and improved my confidence in designing Java applications. It also enhanced my understanding of code organization, debugging, and version control using Git and GitHub.
