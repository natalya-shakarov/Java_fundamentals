package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList <String> world = new ArrayList<>();
        world.add("Hello");
        world.add("world");
        world.add("!!");
        world.add("!");

        System.out.println(world + " these are all elements in array list world");
        System.out.println(world.get(0) + "  -->index 0 returns 1st element in array list world");
        System.out.println(world.size() + " is the number of elements in array list world");
        System.out.println();
        world.remove(2);
        System.out.println(world + "  -->index 2 removes element 3 from array list world");
        world.clone();
        System.out.println(world + "  creates a copy of array list world");
    }


}
