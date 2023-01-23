package com.workshop2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        /*
         * Declaring the object of employee class
         */
        Employee employee = new Employee();
        Scanner scanner = new Scanner(System.in);
        /*
         * Printing the add persons and multiple companies.
         */
        System.out.println(" \n press 1 to add persons \n press 2 to add multiple companies");
        int choice = scanner.nextInt();
        /*
         * Using the switch case printing the persons and companies.
         */
        switch (choice){
            case 1 :
                employee.employeeDetails();
                break;
            case 2:
                employee.multipleCompanies();
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}
