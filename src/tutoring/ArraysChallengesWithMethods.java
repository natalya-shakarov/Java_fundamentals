package tutoring;

public class ArraysChallengesWithMethods {
    public static void main(String[] args) {
        int[] agh = {12, 5, 6, 123, 14, 9};
        printBackwards(agh);

        System.out.println();

        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {2, 3, 4, 5};
        int[] test3 = {2, 3, 4, 3};
        int[] test4 = {6, 7};
        System.out.println(allLess(test1, test2)); //should print true
        System.out.println(allLess(test1, test3)); //should print false
        System.out.println(allLess(test1, test4)); //should print false b/c they are different sizes

        System.out.println();

        swap(agh);
        printBackwards(agh);

    }
    public static void printBackwards(int [] vals) {
        //this method accepts array of integers and prints them out in reverse order.
        for (int i = vals.length - 1; i >= 0; i--) {
            System.out.println(vals[i]);
        }
    }

    public static boolean allLess(int [] vals1, int [] vals2) {
        //this method returns true if every element of vals1 is less than the same elements in vals2.
        //this method returns false if two arrays are of different size.
        if (vals1.length != vals2.length){
            return false;
        }
        for (int i = vals1.length - 1; i >= 0; i--) {
            if (vals1[i] >= vals2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] mass) {
        //this method swaps every other element in array mass
        int temp;
        for (int i = 0; i < mass.length - 1; i++) {
            temp = mass[i];
            mass[i] = mass[i + 1];
            mass[i + 1] = temp;
        }

    }
}

