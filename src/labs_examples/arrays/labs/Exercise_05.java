package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int[] test = new int[12];
        for (int i = 0; i < test.length; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = test.length-2; i >= 0; i-=2) {
            System.out.print(i + " ");
        }
    }
}
