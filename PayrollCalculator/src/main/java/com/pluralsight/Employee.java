package com.pluralsight;

public class Employee {
    private String name;
    private int employeeId;
    private double hoursWorked, payRate;

    public Employee(int employeeId, String name, double hoursWorked, double payRate) {
        this.name = name;
        this.employeeId = employeeId;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //getter
    public static String getName() {
        return this.name;
    }

    public static int getEmployeeId() {
        return this.employeeId;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public double getPayRate() {
        return this.payRate;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
//method
    public static double getGrossPay() {
        return hoursWorked * payRate;










    }
}
