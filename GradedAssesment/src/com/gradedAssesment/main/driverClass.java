package com.gradedAssesment.main;

import com.gradedAssesment.departments.adminDepartment;
import com.gradedAssesment.departments.hrDepartment;
import com.gradedAssesment.departments.techDepartment;

import java.util.Scanner;

public class driverClass {

    public static void main(String args[]){

        int department;
        Scanner sc = new Scanner(System.in);

        System.out.println("----------Welcome to Departments---------");
        System.out.println("Please Select your department!");
        System.out.println("1. Admin Department");
        System.out.println("2. HR Department");
        System.out.println("3. Tech Department");
        department = sc.nextInt();


        switch(department){
            case 1:
                new adminDepartment();
                break;

            case 2:
                new hrDepartment();
                break;

            case 3:
                new techDepartment();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
