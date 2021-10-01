package baseline;

import java.util.Scanner;

public class Solution28 {

    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Solution28 app = new Solution28();

        System.out.printf("The total is %d.%n", app.addValues(app.takeNumberOfValues()));
    }

    // Add up all values in an int array
    public int addValues(int[] array) {

        int count = 0;

        // Adding values to count
        for (int j : array)
            count += j;
        return count;
    }

    // Calls readValue() in a for loop and assembles them into an int[] array
    public int[] takeNumberOfValues() {
        int arraySize = 5;
        int[] arr = new int[arraySize];

        for(int i = 0; i < arr.length; i++)
            // Call readValue() and set value to an int array index i
            arr[i] = readValue();
        return arr;
    }

    public int readValue() {
        System.out.print("Enter a number: ");
        return in.nextInt();
    }

}
