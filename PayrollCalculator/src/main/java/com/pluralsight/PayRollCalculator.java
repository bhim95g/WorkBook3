package com.pluralsight;

import java.io.*;
import java.util.regex.Pattern;

public class PayRollCalculator {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");

            BufferedReader bufReader = new BufferedReader(fileReader);
            bufReader.readLine(); //skips first line

            String input;
            //read until there is no more data
            while ((input = bufReader.readLine()) != null) {
                String[] items = input.split(Pattern.quote("|"));
                int id = Integer.parseInt(items[0]);
                String name = items[1];
                double worksHour = Double.parseDouble(items[2]);
                double paRate = Double.parseDouble(items[3]);

                Employee emp = new Employee(id, name, worksHour, paRate);
                System.out.printf("ID: %d | Name: %s | Gross Pay: $%.2f%n", Employee.getEmployeeId(), Employee.getName(),
                        Employee.getGrossPay());
            }
            bufReader.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: reading file");
            System.out.println(e.getMessage());



        }
    }
}
