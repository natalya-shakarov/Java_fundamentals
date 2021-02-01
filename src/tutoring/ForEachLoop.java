package tutoring;

public class ForEachLoop {
    public static void main(String[] args) {

        // please declare an array or arraylist below
        int[] bike = new int[6];

        // please populate that array or arraylist
        bike [0] = 15;
        bike [1] = 1;
        bike [2] = 123;
        bike [3] = 153;
        bike [4] = 5;
        bike [5] = 90;

        // please use a For Each Loop to print each element
        // in the array or arraylist you declared and populated above

        for (int i : bike) {
            System.out.println(i);
        }
    }
}
