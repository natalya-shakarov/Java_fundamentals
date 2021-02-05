package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 */

public class Exercise_04 {
    public static void main(String args[]) {
        int[][] array = new int[3][];
        array[0] = new int[4];
        array[1] = new int[2];
        array[2] = new int[3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }

        for (int [] outer : array) {
            for (int j : outer) {
                System.out.print(j + " , ");

            }
            System.out.println();
        }

    }

}
