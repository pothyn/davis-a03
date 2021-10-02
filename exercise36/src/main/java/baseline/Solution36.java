/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

//        Write a program that prompts for response times from a website in milliseconds.
//        It should keep asking for values until the user enters “done

//        The program should print the average time (mean), the minimum time, the maximum time,
//        and the population standard deviation.
//
//        Example Output
//        Enter a number: 100
//        Enter a number: 200
//        Enter a number: 1000
//        Enter a number: 300
//        Enter a number: done
//        Numbers: 100, 200, 1000, 300
//        The average is 400.0
//        The minimum is 100
//        The maximum is 1000
//        The standard deviation is 353.55

//        Constraints
//        Create functions called average, max, min, and std, which take in a list of numbers and return the results.
//        Use loops and arrays to perform the input and mathematical operations.
//        Be sure to exclude the "done" entry from the inputs.
//        Be sure to properly ignore any invalid inputs.
//        Keep the input separate from the processing and the output.

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution36 {

    private static final Scanner in = new Scanner(System.in);
    private ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        Solution36 app = new Solution36();

        System.out.print("Enter a number: ");

        while(app.addNumber(in.nextLine()))
            System.out.print("Enter a number: ");

        System.out.printf("%nNumbers: %s%n", app.getListNumbers());

        System.out.printf("The average is %.1f%n", app.getAvg());
        System.out.printf("The minimum is %d%n", app.getMin());
        System.out.printf("The maximum is %d%n", app.getMax());
        System.out.printf("The standard deviation is %.2f%n", app.getStd());

    }

    public String getListNumbers() {

        String total = "";

        // Use a for loop to add all the values to a single string and return it
        for(int i = 0; i < numbers.size(); i++) {
            total += numbers.get(i);
            if(i != numbers.size() - 1)
                total +=  ", ";
        }
        return total;
    }


    public boolean addNumber(String value) {
        if(value.equals("done"))
            return false;
        if(isAllDigits(value))
            numbers.add(Integer.parseInt(value));
        return true;
    }

    private boolean isAllDigits(String value) {
        // return false if any of the values are NOT digits
        // otherwise return true

        for(int i = 0; i < numbers.size(); i++)
            if(!Character.isDigit(value.charAt(i)))
                return false;
        return true;
    }


    public int getMax() {
        // run through all the values
        // return highest
        int max = numbers.get(0);

        for(int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max)
                max = numbers.get(i);
        }
        return max;
    }

    public int getMin() {
        // run through all the values
        // return lowest

        int min = numbers.get(0);

        for(int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < min)
                min = numbers.get(i);
        }
        return min;
    }

    public double getAvg() {
        double average = 0;

        // add up all values
        for(int i = 0; i < numbers.size(); i++)
            average += numbers.get(i);

        // divide by size of arraylist and return that value
        return average/numbers.size();

    }

    public double getStd() {

        double average = getAvg();
        double standardDeviation = 0;

        for(int i = 0; i < numbers.size(); i++) {
            standardDeviation += Math.pow(numbers.get(i) - average, 2);
        }

        return Math.sqrt(standardDeviation / numbers.size());
    }
}
