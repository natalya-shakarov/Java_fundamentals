package tutoring2;

public class Student {

    static int MAX_NUMBER_OF_STUDENTS = 30;

    String firstName;
    String lastName;
    int age;
    String[] courses = new String[2];

    Student(String a, String b) {
        firstName = a;
        lastName = b;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

}
