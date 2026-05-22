package com.day2proj1.models;

import com.day2proj1.interfaces.Taxable;

public class PartTimeEmployee extends Employee implements Taxable {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateTax() {
        return getSalary() * TAX_RATE;
    }
}