/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.util.Scanner;

public class Solution26 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

//        Write a program that will help you determine how many months it will take to pay off a credit card balance.
//        The program should ask the user to enter the balance of a credit card, the APR of the card, and their monthly payment.
//        The program should then return the number of months needed (rounded up to the next integer value).
//
//        The formula for this is
//
//        n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
//
//        where
//
//        n is the number of months.
//        i is the daily rate (APR divided by 365).
//        b is the balance.
//        p is the monthly payment.
//
//        Example Output
//        What is your balance? 5000
//        What is the APR on the card (as a percent)? 12
//        What is the monthly payment you can make? 100
//        It will take you 70 months to pay off this card.
//
//                Constraints
//        Prompt for the card’s APR. Do the division internally.
//        Prompt for the APR as a percentage, not a decimal.
//        Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
//             which takes no parameters and returns the number of months.
//        Round fractions of a cent up to the next cent for internal calculations

        int balance;
        int numberOfMonths;
        int monthlyPayment;
        double apr;

        // Prompt and Take in balance
        System.out.print("What is your balance? ");
        balance = in.nextInt();

        // Prompt and take in apr
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble();

        // Prompt and take in monthlyPayment
        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = in.nextInt();

        // Initialize new Payment Calculator with entered variables
        PaymentCalculator app = new PaymentCalculator(balance, apr, monthlyPayment);

        numberOfMonths = app.calculateMonthsUntilPaidOff();

        System.out.printf("%d", numberOfMonths);

    }

}
