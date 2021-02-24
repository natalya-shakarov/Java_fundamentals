package tutoring;

public class WhileLoops {
    public static void main(String[] args) {
        //find the first factor of 91, other than 1
        int n = 91;
        int factor = 2;
        while (n % factor != 0) {
            factor++;
        }
        System.out.println(factor);
        System.out.println();

        //
        int x = 1;
        while (x < 5) {
            System.out.println(x * x);
            x++;
        }
        System.out.println(x);
    }
}




