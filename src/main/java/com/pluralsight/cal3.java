package com.pluralsight;

import java.util.Scanner;

public class cal3 {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the monthly payout:");
        double monthly_payout=scanner.nextDouble();
        System.out.println("Enter the expected interest rate:");
        double expected_interest_rate=scanner.nextDouble()/1200;
        System.out.println("Enter the years to payout:");
        int years=scanner.nextInt();

        double present_annuity = monthly_payout*((1-Math.pow(1+expected_interest_rate,-12*years))/expected_interest_rate);
        System.out.println("present annuity: "+present_annuity);
    }
}
