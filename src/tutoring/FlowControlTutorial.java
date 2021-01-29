package tutoring;

public class FlowControlTutorial {
    public static void main(String[] args) {
        // please demonstrate the use of the "continue" keyword below within a for loop
        for(int w = 1; w < 7; w++){
            if(w == 4 || w == 5){
                continue;
            }
            System.out.println("print w " + w);
        }

        // please demonstrate the use of the "break" keyword below in a do-while loop
        int g = 0;
        do {
            if (g == 7){
                break;
            }
            System.out.println("print g " + g);
            g++;
        } while (g <= 14);
    }
}
