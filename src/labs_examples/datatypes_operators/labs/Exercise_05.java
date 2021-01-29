package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");
        }

        // write your code below
        if (a & b) {
            System.out.println("a & b is false it won't print true");
        }
        if (a && b) {
            System.out.println("a && b is false it won't print");
        }
        if (a || b) {
            System.out.println("a || b is true and will print");
        }
        if (a ^ b) {
            System.out.println("a ^ b it will print because one of the variables is true");
        }
        if (!(a == b)) {
            System.out.println("a does not equal b therefore true and will print");
            System.out.println();
        }
    }

    }



