package tutoring;

import java.util.Scanner;

public class FactorialOfLongUserInput {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.print("enter number");
        long userNumber = kbd.nextInt();
        long factorial = 1;
        for (long i = 1; i <= userNumber; i++){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
