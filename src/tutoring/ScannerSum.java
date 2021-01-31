package tutoring;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {

        //Exercise 3: Write a Java program to ask the user for a number,
        // then read in that number of values and print out the sum.
        System.out.print("enter number:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("enter number " + i + ": ");
            sum = sum + scanner.nextInt();
        }
        System.out.println(sum);
    }
}
