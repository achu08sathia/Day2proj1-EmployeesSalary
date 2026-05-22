Day2proj1 - Employee Salary Management System



Project Overview

A Java-based Employee Salary Management System that demonstrates

Object-Oriented Programming concepts like Abstraction, Interface, and Polymorphism.



\---



Technologies Used

\- Java

\- Maven

\- VS Code



\---



Classes and Interface



| File | Type | Description |

|------|------|-------------|

| Taxable.java | Interface | Defines TAX\_RATE 20% and calculateTax() method |

| Employee.java | Abstract Class | Base class with name and getSalary() |

| FullTimeEmployee.java | Class | Monthly salary based tax calculation |

| PartTimeEmployee.java | Class | Hourly rate x hours worked based tax calculation |

| App.java | Main Class | Entry point runs all employees |



&#x20;Project Structure



day2proj1/

├── src/

│   └── main/

│       └── java/

│           └── com/

│               └── day2proj1/

│                   ├── App.java

│                   ├── interfaces/

│                   │   └── Taxable.java

│                   └── models/

│                       ├── Employee.java

│                       ├── FullTimeEmployee.java

│                       └── PartTimeEmployee.java

└── pom.xml





How to Run



Step 1 - Clone the repository

git clone https://github.com/achu08sathia/Day2proj1-EmployeesSalary



Step 2 - Go to project folder

cd Day2proj1-EmployeesSalary



Step 3 - Compile

mvn clean compile



Step 4 - Run

mvn exec:java -Dexec.mainClass="com.day2proj1.App"



Sample Output



Employee: Alice

Tax Amount: $10000.0

\-------------------

Employee: Bob

Tax Amount: $12000.0

\-------------------

Employee: Charlie

Tax Amount: $11000.0

\-------------------

Employee: Iven

Tax Amount: $8000.0

\-------------------

Employee: Judy

Tax Amount: $9000.0

\-------------------

Employee: Franck

Tax Amount: $80.0

\-------------------

Employee: GARCE

Tax Amount: $75.0

\-------------------

Employee: Michel

Tax Amount: $60.0

\-------------------

Employee: John

Tax Amount: $110.0

\-------------------

Employee: Heidi

Tax Amount: $100.8

\-------------------





OOP Concepts Used

\- Abstraction  - Abstract class Employee

\- Interface    - Taxable interface

\- Inheritance  - FullTimeEmployee and PartTimeEmployee extend Employee

\- Polymorphism - List of Taxable objects holding different employee types



