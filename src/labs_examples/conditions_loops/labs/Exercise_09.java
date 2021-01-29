package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int x = 1;
        for (x = 1; x < 10; x++) {
            if (x == 6) {
                break;
            }
            System.out.println(x);
        }
    }
}

