package tutoring;

public class MethodTutorial4 {
    public static void main(String[] args) {
        fourthMethod(8);
        fourthMethod(10);
        fourthMethod(15);
        fourthMethod(1024);
        fourthMethod(3);
        fourthMethod(-7);
        fourthMethod(-14);
    }
    public static void fourthMethod (int c){
        if (c < 10){
            return;
        }
        System.out.println(c);
    }
}
