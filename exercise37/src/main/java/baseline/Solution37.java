/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */

package baseline;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Solution37 {

//    Create a program that generates a secure password. Prompt the user for the minimum length,
//    the number of special characters, and the number of numbers. Then generate a password for the user using those inputs.
//
//            Example Output
//    What's the minimum length? 8
//    How many special characters? 2
//    How many numbers? 2
//    Your password is aurn2$1s#
//
//            Constraints
//    Use lists to store the characters you’ll use to generate the passwords.
//    Ensure that the generated password is random.
//    Ensure that there are at least as many letters are there are special characters and number.

    private static final Scanner in = new Scanner(System.in);
    private Random rand = new Random();

    public static void main(String[] args) {

        Solution37 app = new Solution37();

        int minLength;
        int specialChars;
        int numbers;

        // prompt and read minimum length
        minLength = in.nextInt();

        // prompt and read number of special characters
        specialChars = in.nextInt();

        // prompt and read number of numbers
        numbers = in.nextInt();

        System.out.println(app.generatePassword(minLength, specialChars, numbers));

    }

    public String generatePassword(int minLength, int specialChars, int numbers) {

        String password = "";
        int randomVal;
        int letterNum = 0;
        int letterNumApprox = minLength - specialChars - numbers;

        // && ((specialChars > 0) && (numbers > 0))

        // for 0 to minLength (AND specialChar > 0 and numbers > 0)
        for(int i = 0; i < minLength || letterNum < letterNumApprox; i++ ) {
            // randomly choose to add in a special char, number, or letter
            randomVal = rand.nextInt(3);

            // call one of the three methods: addLetter(), addNumber(), or addSpecialChar()
            // decrease the amount of numbers or special characters depending on which func was called
            if(randomVal == 0 || (specialChars == 0 && numbers == 0)) {
                password += addLetter();
                letterNum++;
            }
            else if (randomVal == 1 && (numbers > 0)) {
                password += addNumber();
                numbers--;
            }
            else if ((randomVal == 2) && (specialChars > 0)){
                password += addSpecialChar();
                specialChars--;
            }

        }
        return password;
    }

    private char addLetter() {
        // USE LIST OF CHARS
        // return random letter
        ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i',
                        'j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));
        return list.get(rand.nextInt(26));
    }

    private char addNumber() {
        // return random number
        ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('1','2','3','4','5','6','7','8','9','0'));
        return list.get(rand.nextInt(10));
    }

    private char addSpecialChar() {
        // return random special char
        ArrayList<Character> list = new ArrayList<Character>(Arrays.asList('!','@','#','$','%','^','&','*','(',
                ')','~','/','<','>','.',',','+','=','-','_',':',';'));
        return list.get(rand.nextInt(list.size()));
    }
}
