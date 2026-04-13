package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter principal:");
        double p = scanner.nextDouble();
        System.out.println("enter annual interest rate:");
        double annualInterestRate = scanner.nextDouble()/1200;
        System.out.println("enter number of years:");
        int numberOfYears = scanner.nextInt();

        double monthly_payment = p*((annualInterestRate*Math.pow(1+annualInterestRate,numberOfYears*12))/(Math.pow(1+annualInterestRate,numberOfYears*12)-1));
        System.out.println("Monthly interest rate: "+monthly_payment);

        double total_interest = (monthly_payment*12*numberOfYears) - p;
        System.out.println("Total interest: "+total_interest);
    }
}
