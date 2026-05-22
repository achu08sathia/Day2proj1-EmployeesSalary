Day2proj1 - Employee Salary Management System

Project Overview
A Java-based Employee Salary Management System that demonstrates
Object-Oriented Programming concepts like Abstraction, Interface, and Polymorphism.

Technologies Used
- Java
- Maven
- VS Code

Classes and Interface

| File | Type | Description |
|------|------|-------------|
| Taxable.java | Interface | Defines TAX_RATE 20% and calculateTax() method |
| Employee.java | Abstract Class | Base class with name and getSalary() |
| FullTimeEmployee.java | Class | Monthly salary based tax calculation |
| PartTimeEmployee.java | Class | Hourly rate x hours worked based tax calculation |
| App.java | Main Class | Entry point runs all employees |

 Sample Output
Employee: Alice
Tax Amount: $10000.0
Employee: Bob
Tax Amount: $12000.0
Employee: Franck
Tax Amount: $80.0

 OOP Concepts Used
- Abstraction  - Abstract class Employee
- Interface    - Taxable interface
- Inheritance  - FullTimeEmployee and PartTimeEmployee extend Employee
- Polymorphism - List of Taxable objects holding different employee types

