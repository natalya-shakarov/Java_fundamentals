package tutoring;

public class IfStatementsA {
    public static void main(String[] args) {
        int a = -20;
        int b = 30;
        int c = 40;

        //come up with if statement if int a is odd or even and print it out

        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        // come up with if statement to check if b greater than c and print it out
        if (b > c) {
            System.out.println("b is greater than c");
        } else {
            System.out.println("b is not greater than c");
        }
        //come up with if statement if b is positive or negative and print it out
        if (b < 0) {
            System.out.println("b is negative");
        } else {
            System.out.println("b is positive");
        }
        //come up with if statement to check if b is closer to a or c is closer to a and print it out
        int distC = Math.abs(c - a);
        int distB = Math.abs(a - b);
        if (distB < distC) {
            System.out.println("b is closer to a");
        } else {
            System.out.println("c is closer to a");
        }
        //come up with if statement to check if c is not zero and print it out
        if (c != 0) {
            System.out.println("c is not zero");
        } else {
            System.out.println("c is zero");
        }
        //come up with if statement to check if b is greater in magnitude than c using Math.abs and print it out
        if (Math.abs(b) > Math.abs(c)) {
            System.out.println("b is greater in magnitude than c");
        } else {
            System.out.println("b is Not greater in magnitude than c");
        }
        //come up with if statement to check if a and c are opposite signs (one is positive and the other negative)
        //and print it out
        if (a < 0 && c > 0) {
            System.out.println("a and c are opposite signs");
        } else {
            System.out.println("a and c are Not opposite signs");
        }
        //come up with if statement to check if a is a single digit number and print it out
        if (a <= 9 && a >= 9) {
            System.out.println("a is a single digit number");
        } else {
            System.out.println("a is Not a single digit number");
        }
        //come up with if statement to check if a is odd and b is even, or if b is odd and a is even, print it out
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("a and b are even");
        } else {
            System.out.println("a or b is odd");
        }
        //come up with if statement to check if a is a multiple of b (that is, if b is evenly divisible by a)
        int mult1 = Math.abs(b / 2);
        if (mult1 % 2 == 0) {
            System.out.println("b is evenly divisible by a");
        } else {
            System.out.println("b is not evenly divisible by a");
        }
    }
}
//Math.abs is a method that takes any value positive or negative and returns its absolute value. Magnitude.