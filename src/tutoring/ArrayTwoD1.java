package tutoring;

public class ArrayTwoD1 {
    public static void main(String[] args) {
        // please demonstrate how to declare a Two-Dimensional Array
        // with a height of 4 and a width of 5 below
        int[][] intArray2 = new int[4][5];

        // using a nested for loop, please populate every index in the 2-D Array
        for(int i = 0; i<intArray2.length; i++){
            for(int j = 0; j<intArray2[i].length; j++){
                intArray2[i][j] = i*j;
            }
        }
        // once populated, use a nested for loop to print each element in the 2-D array
        for(int i = 0; i<intArray2.length; i++){
            for(int j = 0; j<intArray2[i].length; j++){
                System.out.print(intArray2[i][j] + "-");
            }
            System.out.println();
        }
    }


}



