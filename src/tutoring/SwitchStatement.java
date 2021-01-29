package tutoring;

public class SwitchStatement {

    public static void main(String[] args) {
        int i = 3;
        testSwitchStatement(i);
    }

    public static void testSwitchStatement(int i) {
        switch (i) {
            case 0:
                System.out.println("Case 0");
            case 1:
                System.out.println("Case 1");
            case 2:
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            case 4:
                System.out.println("Case 4");
            case 5:
                System.out.println("Case 5");
            case 6:
                System.out.println("Case 6");
            default:
                System.out.println("Default Case");
        }

        System.out.println("Done with switch statement.");
    }
}
