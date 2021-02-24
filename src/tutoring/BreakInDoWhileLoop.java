package tutoring;

public class BreakInDoWhileLoop {
    public static void main(String[] args) {
        int x = 20;
        do {
            System.out.println(x);
            x -= 3;
            if (x == 8) {
                break;
            }
        } while (x >= 0);
    }
}
