/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

//        Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe,"
//        or "Ask again later."
//
//        Example Output
//        What's your question?
//        > Will I be rich and famous?
//
//        Ask again later.
//        Constraint
//        The value should be chosen randomly using a pseudo random number generator.
//        Store the possible choices in a list and select one at random.

package baseline;

import java.util.Scanner;

public class Solution33 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Solution33 app = new Solution33();

        // Prompt for question
        System.out.print("What's your question?\n> ");
        // Take input but don't store
        in.nextLine();

        System.out.println(app.randomResponseGenerator());

    }

    public String randomResponseGenerator() {
        String[] responseList = {"Yes", "No", "Maybe", "Ask again later"};

        return responseList[(int)Math.floor(Math.random()*(3 + 1) + 0)];

    }

}
