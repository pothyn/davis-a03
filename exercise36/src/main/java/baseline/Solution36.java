/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

//        Write a program that prompts for response times from a website in milliseconds.
//        It should keep asking for values until the user enters “done.”
//
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

public class Solution36 {

    public static void main(String[] args) {
        // while (addNumber(in.nextLine());

        // print getListNumbers()

        // print getAvg()
        // print getMin()
        // print getMax()
        // print getStd()

    }

    public String getListNumbers() {
        // Use a for loop to add all the values to a single string and return it
    }


    public boolean addNumber(String value) {
        // check if value is equal to "done"
            // return false
        // check if it is only digits via isAllDigits(value)
            // add to arrayList

    }

    private boolean isAllDigits(String value) {
        // return false if any of the values are NOT digits
        // otherwise return true
    }


    public int getMax() {
        // run through all the values
        // return highest
    }

    public int getMin() {
        // run through all the values
        // return lowest
    }

    public double getAvg() {
        // add up all values
        // divide by size of arraylist
        // return that value
    }

    public double getStd() {
        // call getAvg()

        // for each value in the array list add onto standardDevitation the (number - mean) ^ 2

        // return sqrt(standardDeviation / arrayList size)
    }
}
