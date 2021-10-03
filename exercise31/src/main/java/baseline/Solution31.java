/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.util.Scanner;

public class Solution31 {

    private static final Scanner in = new Scanner(System.in);

    private int restingHeartRate;
    private int age;

    public Solution31(int restingHeartRate, int age) {
        // initialize vars to the private ints
        this.restingHeartRate = restingHeartRate;
        this.age = age;
    }

//    When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert yourself.
//    The Karvonen heart rate formula is one method you can use to determine your rate.
//    Create a program that prompts for your age and your resting heart rate.
//    Use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.
//    Generate a table with the results as shown in the example output. The formula is
//
//            TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
//    Example Output
//    Resting Pulse: 65        Age: 22
//
//        Intensity    | Rate
//        -------------|--------
//        55%          | 138 bpm
//        60%          | 145 bpm
//        65%          | 151 bpm
//         :               :        (extra lines omitted)
//        85%          | 178 bpm
//        90%          | 185 bpm
//        95%          | 191 bpm
//            Constraints
//    Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
//    Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering valid inputs.
//    Display the results in a tabular format.

    public static void main(String[] args) {

        System.out.print("Enter the resting heart rate: ");
        int restingHeartRate = readInt();
        System.out.print("Enter the age: ");
        int age = readInt();

        Solution31 app = new Solution31(restingHeartRate, age);

        System.out.println(app.getTabularFormat());

    }

    private static int readInt() {
        String input;
        boolean exit;

        // Ensures that nothing is a letter/special character
        do {
            exit = true;
            input = in.next();
            for(int i = 0; i < input.length(); i++)
                if(!Character.isDigit(input.charAt(i))) {
                    exit = false;
                    System.out.println("Incorrect value given, try again.");
                }
        } while(!exit);

        return Integer.parseInt(input);
    }

    public String getTabularFormat() {
        String tabFormat = "";

        // add Resting pulse and age header using the private values from this file
        tabFormat += "Resting Pulse: " + restingHeartRate + "\t\tAge: " + age + "\n";

        // add intensity vs rate header
        tabFormat += "Intensity\t| Rate\n";
        tabFormat += "----------------------\n";
        // for loop from 55 to 95 with increments of 5 (index i)
        for(int i = 55; i < 100; i += 5) {
            // each will call and print getHeartRate(i)
            tabFormat += i + "%\t\t\t|  " + getTargetHeartRate(i) + " bpm\n";
        }
        // return tabFormat
        return tabFormat;
    }

    public int getTargetHeartRate(double intensity) {
        int heartRate;

        heartRate = (int)(((220 - age) - restingHeartRate) * intensity/100) + restingHeartRate;

        return heartRate;
    }
}
