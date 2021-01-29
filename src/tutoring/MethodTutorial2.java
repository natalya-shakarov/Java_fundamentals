package tutoring;

public class MethodTutorial2 {
    public static void main(String[] args) {
        secondMethod(5);
        secondMethod(12);
        secondMethod(17);
        int a = 23;
        secondMethod(a);
        int b = 11;
        secondMethod(b);
        int c = a+b;
        secondMethod(c);
        a = 50;
        secondMethod(a);
        secondMethod(c);

    }

    public static void secondMethod(int x){
        System.out.println("value is " + x);
    }
}
