package com.bridgelabz.day03.employeewage;

import java.util.Random;

public class EmployeeWageProblem {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation Program");
        Random random = new Random();
        int a = random.nextInt(2);
        int wagePH = 20;
        int fullDayH = 8;
        if (a == 1) {
            System.out.println("Employee is Present\nPer Day Wage is :"+ " " +(wagePH * fullDayH));
        } else {
            System.out.println("Employee is Absent\nPer Day Wage is :"+ " " +(0));
        }
    }
}
