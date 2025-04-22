package com.pluralsight;
import java.io.BufferedReader;
import java.util.Scanner;

public class Employee {
    private String name;
    private int employeeId, hoursWorked, payRate;

    public Employee(String name, int employeeId, int hoursWorked, int payRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //getter
    public String getName() {
        return this.name;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public int getPayRate() {
        return this.payRate;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
//method
    public double getGrossPay() {
        return hoursWorked * payRate;










    }
}
