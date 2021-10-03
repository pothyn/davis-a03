/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution38 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Solution38 app = new Solution38();

        // take in input of a full line

        int[] evenArray = app.filterEvenNumbers(app.convertToInts(in.nextLine()));

        for(int i = 0; i < evenArray.length; i++)
            System.out.print(evenArray[i] + " ");

    }

    public int[] convertToInts(String intLine) {
        // split the intLine using intLine.split()
        String[] strArray = intLine.split(" ");

        // parse the string array
        int[] intArray = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    public int[] filterEvenNumbers(int[] intArray) {
        // evenArrayList
        ArrayList<Integer> evenArrayList = new ArrayList<>();

        // for each value of intArray
        for(int i = 0; i < intArray.length; i++)
            // add to evenArrayList
            if(intArray[i] % 2 == 0)
                evenArrayList.add(intArray[i]);


        // evenArray
        int[] evenArray = new int[evenArrayList.size()];
        // for 0 to evenArrayList size
        for(int i = 0; i < evenArray.length; i++)
            // add to evenArray
            evenArray[i] = evenArrayList.get(i);

        return evenArray;
    }

}
