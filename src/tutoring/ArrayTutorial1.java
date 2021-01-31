package tutoring;

public class ArrayTutorial1 {
    public static void main(String[] args) {
        // please demonstrate how to declare and initialize a
        // String array of size five below
        String[] stringArray = new String[5];

        // once initialized, please populate each index of the array
        stringArray[0] = "apple";
        stringArray[1] = "pear";
        stringArray[2] = "peach";
        stringArray[3] = "grape";
        stringArray[4] = "berry";

        // once populated, please print out each element in the array
        // using a For Loop
        for (int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);
        }
    }
}
