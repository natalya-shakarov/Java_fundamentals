package tutoring;

import java.util.ArrayList;

public class ArrayListDebug {
    public static void main(String[] args) {

        // please demonstrate how to declare an ArrayList below
        ArrayList<String> list = new ArrayList();

        // please demonstrate how to add values to an array ArrayList
        list.add("hi");
        list.add("hi hi");
        list.add("hi bye");
        list.add("bye bye");

        for(String c : list) {
            System.out.println(c);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
