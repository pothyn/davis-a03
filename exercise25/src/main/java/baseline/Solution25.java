/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.util.Scanner;

public class Solution25 {

//    Create a program that determines the complexity of a given password based on these rules:
//
//    A very weak password contains only numbers and is fewer than eight characters.
//    A weak password contains only letters and is fewer than eight characters.
//    A strong password contains letters and at least one number and is at least eight characters.
//    A very strong password contains letters, numbers, and special characters and is at least eight characters.
//    If a password does not meet any of these rules, then report it as a password of unknown strength.
//
//    Example Output
//    The password '12345' is a very weak password.
//    The password 'abcdef' is a weak password.
//    The password 'abc123xyz' is a strong password.
//    The password '1337h@xor!' is a very strong password.

//    Constraints
//    Create a passwordValidator function that takes in the password as its argument and returns a numeric value you can evaluate to determine the password strength.
//    Use a single output statement.

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String password, passwordStrength = "";
        int passwordValue;
        // Solution25 app = new Solution25();

        password = in.next();

        passwordValue = passwordValidator(password);

        // Check the int value and modify passwordStrength
        if(passwordValue == 0)
            passwordStrength = "very weak";
        else if(passwordValue == 1)
            passwordStrength = "weak";
        else if(passwordValue == 2)
            passwordStrength = "strong";
        else if(passwordValue == 3)
            passwordStrength = "very strong";

        // Print out using printf
        System.out.printf("The password '%s' is a %s password.", password, passwordStrength);
    }

    public static int passwordValidator(String password) {

        int passwordValue;
        char ch;
        boolean containsNumbers = false, containsLetters = false, aboveEightCharacters, containsSpecial = false;

        aboveEightCharacters = (password.length() > 8);

        for(int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);
            // if it is a number using character.isDigit(ch)
            if (Character.isDigit(ch))
                containsNumbers = true;
            // if it is a letter using character.isLetter(ch)
            else if (Character.isLetter(ch))
                containsLetters = true;
            // if it is a special character (not digit AND not letter)
            else
                containsSpecial = true;
        }

        System.out.printf("%b, %b, %b, %b%n", containsNumbers, containsLetters, aboveEightCharacters, containsSpecial);

        if (containsNumbers && !containsLetters && !aboveEightCharacters)
             return 0;
        else if (containsLetters && !aboveEightCharacters)
             return 1;
         else if (containsLetters && containsNumbers && aboveEightCharacters)
             return 2;
         else if (containsLetters && containsNumbers && containsSpecial && aboveEightCharacters)
             return 3;

        return -1;

    }

}
