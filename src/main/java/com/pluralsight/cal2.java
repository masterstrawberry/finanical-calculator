package com.pluralsight;

import java.util.Scanner;

public class cal2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter principal:");
        double p = scanner.nextDouble();
        System.out.println("enter annual interest rate:");
        double annualInterestRate = scanner.nextDouble()/100;
        System.out.println("enter number of years:");
        int numberOfYears = scanner.nextInt();

        double fv = p*Math.pow(1+(annualInterestRate/365),numberOfYears*365);
        System.out.println("future value: " + fv );

        double total_interest_earned = fv-p;
        System.out.println("Total interest earned: "+total_interest_earned);
    }
}
