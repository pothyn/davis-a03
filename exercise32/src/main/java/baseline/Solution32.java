/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Hunter Davis
 */


//    Let's play Guess the Number!
//
//    Enter the difficulty level (1, 2, or 3): 1
//    I have my number. What's your guess? 5
//    Too low. Guess again: 7
//    Too low. Guess again: 9
//    You got it in 3 guesses!
//
//    Do you wish to play again (Y/N)? y
//
//    Enter the difficulty level (1, 2, or 3): 3
//    I have my number. What's your guess? 500
//    Too low. Guess again: 750
//    Too high. Guess again: 600
//    Too low. Guess again: 700
//    Too low. Guess again: 725
//    Too high. Guess again: 715
//    Too high. Guess again: 710
//    Too high. Guess again: 705
//    Too high. Guess again: 701
//    Too low. Guess again: 702
//    You got it in 10 guesses!
//
//    Do you wish to play again (Y/N)? n


package baseline;

import java.util.Scanner;

public class Solution32 {

    private int counter;
    private int secretNumber;

    private static final Scanner in = new Scanner(System.in);

    public Solution32() {
        counter = 0;
        // secretNumber will be given a value later
    }

    public static void main(String[] args) {

        Solution32 app = new Solution32();

        boolean innerWhile;
        boolean outerWhile = true;
        int playAgain = -1;
        String input;

        // introduce game
        System.out.print("Let's play Guess the Number!\n");


        while(outerWhile) {
            // take input for difficulty level
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            app.difficulty(in.nextInt());
            innerWhile = true;

            System.out.print("I have my number. What's your guess? ");

            while(innerWhile) {
                // take input
                input = in.next();
                if(app.digitChecker(input))
                    innerWhile = app.checkSecretNumber(input);
                else
                    System.out.print("Invalid input. Try again: ");
                app.addCounter();
            }
            System.out.printf("Counter: %d%n", app.getCounter());
            app.resetCounter();

            // play again?
            System.out.print("Play again? (Y/N): ");
            if(app.ynChecker(in.next()) == 1)
                outerWhile = false;
            playAgain = -2;

        }
    }

    public void addCounter() {
        counter++;
    }

    public void resetCounter() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void difficulty(int difficultyVal) {

        if(difficultyVal == 1)
            generateRandom(10);
        else if(difficultyVal == 2)
            generateRandom(100);
        else if(difficultyVal == 3)
            generateRandom(1000);

    }

    public boolean digitChecker(String input) {
        for(int i = 0; i < input.length(); i++)
            if(!Character.isDigit(input.charAt(i)))
                return false;
        return true;
    }

    public int ynChecker(String input) {

        if(input.equalsIgnoreCase("y"))
            return 0;
        else if(input.equalsIgnoreCase("n"))
            return 1;
        else
            return -1;

    }

    public boolean checkSecretNumber(String guess) {
        // guessInt is guess parsed
        int guessInt = Integer.parseInt(guess);

        // just right
        if(guessInt == secretNumber)
            return false;
        // too high
        else if(guessInt > secretNumber) {
            System.out.print("Too high. Guess again: ");
            return true;
        }
        // too low
        else {
            System.out.print("Too low. Guess again: ");
            return true;
        }
    }

    public void generateRandom(int max) {
        secretNumber = (int)Math.floor(Math.random()*(max-1+1)+1);
    }

}
