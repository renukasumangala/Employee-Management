Employee Management System

Project Overview
----------------------------------------------

The Employee Management System is a RESTful web application built using Spring Boot, Spring Data JPA, and MySQL.
It allows performing CRUD operations on employee records and fetching employees based on department. The system follows a modular architecture with Controller, Service, and Repository layers for maintainability.



Features
----------------------------------------------

Add new employees

Retrieve all employees or filter by department

Retrieve employee by ID

Update employee details

Delete employee

REST API endpoints for all operations


Technologies Used
------------------------------------------------

Java 17+

Spring Boot

Spring Data JPA / Hibernate

MySQL


Project Structure
-------------------------------------------------------

com.example.employeemanagement
│
├─ controller       → REST controllers for API endpoints
├─ entity           → Employee entity class
├─ repository       → JpaRepository interface for database operations
├─ service          → Service interface and implementation for business logic
├─ dto              → (Optional) Data Transfer Object for employee
├─ exception        → Custom exception classes
└─ EmployeemanagementApplication.java → Main Spring Boot application



Database Setup

1. Create the database:



CREATE DATABASE employeedb;
USE employeedb;

2. Table employee will be auto-created by Spring Boot JPA.






API Endpoints
--------------------------------------

Method	URL	Description

POST	/api/employees	Create a new employee
GET	/api/employees	Get all employees (optional query param: ?department=IT)
GET	/api/employees/{id}	Get employee by ID
PUT	/api/employees/{id}	Update employee details
DELETE	/api/employees/{id}	Delete employee
GET	/api/employees/department/{department}	Get employees by department





Example Request

GET employees in IT department:

GET http://localhost:8080/api/employees

Response:

[
  {
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com",
    "department": "IT",
    "salary": 50000
  }
]
