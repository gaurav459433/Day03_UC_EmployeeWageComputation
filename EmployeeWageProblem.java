package com.bridgelabz.day03.employeewage;

import java.util.Random;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        Random random = new Random();
        int a = random.nextInt(3) + 1;
        int wagePH = 20;
        int fullDayH = 8;
        int partTimeDayH = 4;
        int days = 0;
        int salary = 0;
        int monthly_salary = 0;
//        if (a == 1) {
//            System.out.println("Employee is Present\nPer Day Wage is :" + " " + (wagePH * fullDayH));
//        } else if (a == 2) {
//            System.out.println("Employee is Present Halfday\nPer Day Wage is :" + " " + (wagePH * partTimeDayH));
//        } else {
//            System.out.println("Employee is Absent\nPer Day Wage is :" + " " + (0));
//        }

        while (days != 20) {
            days++;

            switch (a) {
                case 1: salary = (wagePH * fullDayH);
                    System.out.println("Employee is Present\nPer Day Wage is :" + " " + salary );
                    break;
                case 2: salary = (wagePH * partTimeDayH);
                    System.out.println("Employee is Present Halfday\nPer Day Wage is :" + " " + salary );
                    break;
                default:
                    System.out.println("Employee is Absent\nPer Day Wage is :" + " " + (0));
                    break;
            }
            monthly_salary += salary;
            System.out.println("Employee's Monthly Salary is: " + monthly_salary);
            System.out.println();
        }
    }
}
