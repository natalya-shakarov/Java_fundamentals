package tutoring;

public class IfStatements {
    public static void main(String[] args) {
        // please write and run at least 3 unique if statements below
        int i = 10;
        int a = 20;
        if (i < 20) {
            System.out.println("i is less than 20!");
        }
        if (a > 9) {
            System.out.println("a is greater than 9" + " " + (a > 9));
        }
        if (i < a) {
            System.out.println("10 is less than 20" + " " + (i < a));
        }
        // please write and run at least 2 unique if/else-if/else ladders below
        if (i > a) {
            System.out.println("i is greater than a. won't print");
        } else if (i == a) {
            System.out.println("i equals a. won't print");
        } else {
            System.out.println((a > i) + " " + "should , print");
        }
        if (i == 10 & a == 20) {
            System.out.println("this will print");
        } else if (i == 20 | a == 1) {
            System.out.println("this wont print");
        } else if (i == 19) {
            System.out.println("this wont print");
        } else if (i > 16) {
            System.out.println("this wont print");
        } else {
            System.out.println(a < i);
        }
    }
}
