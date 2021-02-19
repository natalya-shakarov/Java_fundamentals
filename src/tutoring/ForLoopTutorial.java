package tutoring;

public class ForLoopTutorial {
    public static void main(String[] args) {
        // please use a for loop below to print out every number between 0 & 100
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        // please use another for loop below to print out every odd number between 100 and 0 in descending order
        for (int x = 99; x >= 0; x-=2) {
            System.out.println(x);
        }

        // pleasure demonstrate "nesting" two for loops below
        for(int i = 0; i <= 100; i++) {
            System.out.println("i is " + i);
            for(int x = 99; x >= 0; x-=2) {
                System.out.println("x is " + x);
            }
        }
    }
}
