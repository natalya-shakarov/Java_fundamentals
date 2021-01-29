package tutoring;

public class Variables {

    public static void main(String[] args) {
        int i = 10;
        if(i > 0){
            System.out.println("i is greater than 0");
            if (i < 20) {
                System.out.println("i is less than 20");
            }

            for(int count = 0; count < 5; count = count + 1){
                System.out.println("This is count: " + count);
            }

            int count = 0;
            while (count < 5) {
                System.out.println("This is count: " + count);
                count++;
            }
        }

    }
}
