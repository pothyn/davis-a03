/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

public class PaymentCalculator {

    private int balance;
    private int monthlyPayment;
    private double dailyRate;

    public PaymentCalculator(int balance, double apr, int monthlyPayment) {

        this.balance = balance;
        dailyRate = apr/365;
        this.monthlyPayment = monthlyPayment;

    }

    public int calculateMonthsUntilPaidOff() {

        double months;

        // Set months equal to the given equation
//        n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        months = (-1/30.0f);
        months *= Math.log(1 + (double)balance/monthlyPayment);
        months *= (1 - Math.pow((1+dailyRate),30));
        months /= Math.log(1+dailyRate);

        // Round to nearest cent
        months *= 100.0;
        months = Math.ceil(months);
        months /= 100.0;

        return (int)months;

    }
}