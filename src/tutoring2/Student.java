package tutoring2;

public class Student {

    static int MAX_NUMBER_OF_STUDENTS = 30;

    String firstName;
    String lastName;
    int age;
    String[] courses = new String[2];

    String getFullName() {
        return firstName + " " + lastName;
    }

}
