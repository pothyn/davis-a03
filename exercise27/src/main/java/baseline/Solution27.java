/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.util.Scanner;

public class Solution27 {

//    Write a program that prompts for a first name, last name, employee ID, and ZIP code.
//    Ensure that the input is valid according to these rules:
//
//    The first name must be filled in.
//    The last name must be filled in.
//    The first and last names must be at least two characters long.
//    An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
//    The ZIP code must be a number.
//    Display appropriate error messages on incorrect data.
//
//            Example Output
//    Enter the first name: J
//    Enter the last name:
//    Enter the ZIP code: ABCDE
//    Enter the employee ID: A12-1234
//    The first name must be at least 2 characters long.
//    The last name must be at least 2 characters long.
//    The last name must be filled in.
//    The employee ID must be in the format of AA-1234.
//    The zipcode must be a 5 digit number.
//    Or
//
//    Enter the first name: John
//    Enter the last name: Johnson
//    Enter the ZIP code: 55555
//    Enter the employee ID: TK-4321
//    There were no errors found.
//            Constraints
//    Create a function for each validation rule. Then create a validateInput function that takes in all of the input data and invokes the specific validation functions.
//    Use a single output statement to display the outputs.

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String firstName;
        String lastName;
        String zip;
        String employeeID;

        // Prompt and read firstName
        System.out.print("Enter the first name: ");
        firstName = in.nextLine();

        // Prompt and read lastName
        System.out.print("Enter the last name: ");
        lastName = in.nextLine();

        // Prompt and read zip
        System.out.print("Enter the ZIP code: ");
        zip = in.nextLine();

        // Prompt and read employeeID
        System.out.print("Enter the employee ID: ");
        employeeID = in.nextLine();

        // Create instance of Solution27 with given parameters
        Solution27 app = new Solution27();

        app.validateInput(firstName, lastName, zip, employeeID);

    }

    public void validateInput(String firstName, String lastName, String zip, String employeeID) {

        // set errorDisplay to an empty string
        String errorDisplay = "";
        boolean anything = false;

        if(!checkNameFilledIn(firstName)) {
            errorDisplay += "The first name must be filled in.\n";
            anything = true;
        }
        if(!checkNameFilledIn(lastName)) {
            errorDisplay += "The last name must be filled in.\n";
            anything = true;
        }
        if(!checkNameTwoLetters(firstName)) {
            errorDisplay += "The first name must be at least 2 characters long.\n";
            anything = true;
        }
        if(!checkNameTwoLetters(lastName)) {
            errorDisplay += "The last name must be at least 2 characters long.\n";
            anything = true;
        }
        if(checkEmployeeID(employeeID)) {
            errorDisplay += "The employee ID must be in the format of AA-1234.\n";
            anything = true;
        }
        if(checkZip(zip)) {
            errorDisplay += "The zipcode must be a 5 digit number.\n";
            anything = true;
        }
        if(!anything)
            errorDisplay += "There were no errors found.\n";

        System.out.print(errorDisplay);
    }

    public boolean checkNameTwoLetters(String name) {
        // Return false if 2 letters or less
        return (name.length()>2);
    }

    public boolean checkNameFilledIn(String name) {
        // Return false if name is 0 characters
        return (name.length()!=0);
    }

    public boolean checkZip(String zip) {
        // Check if zip is five characters long
        if(zip.length() != 5)
            return true;

        // Check if zip can be parsed all the way through (using try/catch)
        for(int i = 0; i < zip.length(); i++)
            if(!Character.isDigit(zip.charAt(i)))
                return true;
        return false;
    }

    public boolean checkEmployeeID(String employeeID) {
        // Check if string is NOT 8 characters long
        if(employeeID.length() != 7)
            return true;

        // Check if firstTwo characters of string are NOT letters (.isLetter())
        if(!Character.isLetter(employeeID.charAt(0)) || !Character.isLetter(employeeID.charAt(1)))
            return true;

        // Check if third character is NOT a dash
        if(employeeID.charAt(2) != ('-'))
            return true;

        // Check if chars 4-7 are NOT numbers (Character.isDigit())
        for(int i = 3; i < 7; i++)
            if(!Character.isDigit(employeeID.charAt(i)))
                return true;

        return false;
    }


}
