package tutoring;

public class ArrayForEnhancedWhileLoops {
    public static void main(String[] args) {
        String[] val = {"apple", "ro", "go", "hi", "by"};
        for (int i = 0; i < val.length; i++) {
            // here, we'll use the counter variable "i" from the for loop to access an element in the array
            System.out.println(val[i]);
        }
        System.out.println();

        for (String nextVal : val) {
            System.out.println(nextVal);
        }
        System.out.println();

        int x = 0;
        while (x < val.length) {
            System.out.println(val[x]);
            x++;
        }
    }
}
