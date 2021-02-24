package tutoring;

public class ForLoopTutorialA {
    public static void main(String[] args) {
        forLoop();
    }
    public static void forLoop(){

        // declare an int variable named "val" and set it to zero
        int val = 0;
        // write a for loop (with a counting variable named "i") that will iterate from zero to 100 (inclusive),
        // incrementing by 1 on each loop
        for (int i = 0; i <= 100; i++) {
            // inside the for loop, add the value of "i" to the current value of "val"
            val = i + val;
        }

        System.out.println(val);
    }
}
