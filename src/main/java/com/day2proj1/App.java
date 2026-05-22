package com.day2proj1;

import java.util.ArrayList;
import java.util.List;

import com.day2proj1.interfaces.Taxable;
import com.day2proj1.models.Employee;
import com.day2proj1.models.FullTimeEmployee;
import com.day2proj1.models.PartTimeEmployee;

public class App {
    public static void main(String[] args) {
        List<Taxable> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Alice", 50000));
        employees.add(new FullTimeEmployee("Bob", 60000));
        employees.add(new FullTimeEmployee("Charlie", 55000));
        employees.add(new FullTimeEmployee("Iven", 40000));
        employees.add(new FullTimeEmployee("Judy", 45000));
        employees.add(new PartTimeEmployee("Franck", 20, 20));
        employees.add(new PartTimeEmployee("GARCE", 25, 15));
        employees.add(new PartTimeEmployee("Michel", 30, 10));
        employees.add(new PartTimeEmployee("John", 22, 25));
        employees.add(new PartTimeEmployee("Heidi", 28, 18));

        for (Taxable emp : employees) {
            System.out.println("Employee: " + ((Employee) emp).getName());
            System.out.println("Tax Amount: $" + emp.calculateTax());
            System.out.println("-------------------");
        }
    }
}