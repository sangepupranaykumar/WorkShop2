package com.workshop2;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    Company list = new Company();
    ArrayList<Company> listOfEmployee = new ArrayList<>();
    /*
     * Creating the Method to add the employee details.
     */
    public void addEmployee(){
        System.out.println("Enter the Name of Employee :");
        list.setName(scanner.next());
        System.out.println("Enter the age of the Employee :");
        list.setAge(scanner.next());
        System.out.println("Enter the phone number of Employee :");
        list.setPhoneNumber(scanner.next());
        System.out.println("Enter the City of Employee :");
        list.setCity(scanner.next());
        System.out.println("Enter the State of Employee :");
        list.setState(scanner.next());
        System.out.println("Enter the department of Employee :");
        list.setDepartment(scanner.next());
        listOfEmployee.add(list);
        System.out.println(listOfEmployee);
    }

    /*
     * Creating the method for the number of employees.
     */
    public void employeeDetails(){
        System.out.println("Enter the Number of Employees");
        int number = scanner.nextInt();
        for (int i=1; i<=number; i++){
            addEmployee();
        }
    }
    /*
     * Creating the method for the multiple companies.
     */
    public void multipleCompanies(){
        System.out.println("Enter the number of companies ");
        int number1 = scanner.nextInt();
        for (int i=1; i<=number1; i++){
            System.out.println("Enter the Company Name");
            String input = scanner.next();
            System.out.println(input);
            System.out.println("Enter the number of employees :");
            int noOfEmployee = scanner.nextInt();
            for ( int j=1; j<=noOfEmployee; j++){
                addEmployee();
            }
        }
    }
}
