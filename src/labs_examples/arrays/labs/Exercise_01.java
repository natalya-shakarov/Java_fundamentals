package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        double[] array = new double[10];
        System.out.println("enter ten numbers, you may include decimals");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            double number;
            array[i] = scan.nextDouble();
        }
        double sum = 0;
        for (double number : array) {
            sum = sum+number;
        }
        System.out.println(sum);

        double average = (sum) / 2;
        System.out.println( average);
    }
}