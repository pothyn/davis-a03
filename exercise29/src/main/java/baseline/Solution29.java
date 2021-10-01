package baseline;

import java.util.Scanner;

public class Solution29 {

//    Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.
//
//    The formula is
//
//            years = 72 / r
//    where r is the stated rate of return.
//
//    Example Output
//    What is the rate of return? 0
//    Sorry. That's not a valid input.
//    What is the rate of return? ABC
//    Sorry. That's not a valid input.
//    What is the rate of return? 4
//    It will take 18 years to double your initial investment.
//    Constraints
//    Don’t allow the user to enter 0.
//    Don’t allow non-numeric values.
//    Use a loop to trap bad input, so you can ensure that the user enters valid values.

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Solution29 app = new Solution29();

        System.out.printf("It will take you %d years to double your initial investment.", app.readInput());

    }

    public int readInput() {
        String input;
        int rateOfReturn;
        int years;
        boolean numeric = true;

        do {
            // Prompt and read input, store in input
            input = in.nextLine();
            // if input isnt fully numeric
            for(int i = 0; i < input.length(); i++) {
                if(!Character.isDigit(input.charAt(i)))
                    numeric = false;
            }

            if(!numeric) {
                // continue (aka go back through loop)
                System.out.println("Sorry. That's not a valid input.");
                numeric = true;
            }
            // else if input = 0
            else if(Integer.parseInt(input) == 0)
                // prompt that you cant enter 0. continue and go back through loop
                System.out.println("You can't enter 0.");
            // else
            else {
                rateOfReturn = Integer.parseInt(input);
                years = 72 / rateOfReturn;
                return years;
            }
            } while(true);

    }
}
