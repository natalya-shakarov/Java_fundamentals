package tutoring;

public class WhileAndDoWhileLoops {

    public static void main(String[] args) {
        // declare a counter variable to use in our while loop (don't forget to increment it as you loop!)
        int counter = 0;

        // please use a while loop to print out every 3rd number between 0 and 100 below
        while (counter <= 100) {
            System.out.println(counter);
            counter += 3;
        }

        // please use a do-while loop to print out every 5th number below
        counter = 0;
        do {
            System.out.println(counter);
            counter += 5;
        } while (counter <= 100);

    }

}
