package tutoring;

public class MethodTutorial3 {
    public static void main(String[] args) {
        double a = thirdMethod(9.0);
        System.out.println("a = " + a);
        double x = thirdMethod(12.0);
        System.out.println("x = " + x);
        double j = thirdMethod(30.0);
        System.out.println("j = " + j);
    }
    public static double thirdMethod(double z){
        return z / 3.0;
    }
}
