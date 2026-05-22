package com.day2proj1.models;

import com.day2proj1.interfaces.Taxable;

public class FullTimeEmployee extends Employee implements Taxable {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getSalary() {
        return monthlySalary;
    }

    @Override
    public double calculateTax() {
        return monthlySalary * TAX_RATE;
    }
}