/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

//        Create a program that picks a winner for a contest or prize drawing.
//        Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.
//
//        Example Output
//        Enter a name: Homer
//        Enter a name: Bart
//        Enter a name: Maggie
//        Enter a name: Lisa
//        Enter a name: Moe
//        Enter a name:
//        The winner is... Maggie.

//        Constraints
//        Use a loop to capture user input into an array.
//        Use a random number generator to pluck a value from the array.
//        Don’t include a blank entry in the array.
//        Some languages require that you define the length of the array ahead of time. You may need to find another data structure, like an ArrayList.

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {

    private ArrayList<String> contestants = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {

        Solution35 app = new Solution35();

        while(app.addPerson(in.nextLine()));

        System.out.println(app.chooseWinner());

    }


    public boolean addPerson(String name) {
        if(name.isBlank())
            return false;
        // add person to array list
        contestants.add(name);
        return true;

    }

    public String chooseWinner() {
        // generate random number between 0 and array list size
        // return array list value for that index
        return contestants.get(rand.nextInt(contestants.size()));
    }
}
