package tutoring2;

public class FirstClassTutorial {

    public static void main(String[] args) {
        //ArrayList<Student> students = new ArrayList<>();
        Student firstStudent = new Student();
        firstStudent.firstName = "Natalie";
        firstStudent.lastName = "Shakarov";
        System.out.println(firstStudent.firstName);
        System.out.println(firstStudent.getFullName());

        Student secondStudent = new Student();
        secondStudent.firstName = "Kyle";
        secondStudent.lastName = "Davis";
        System.out.println(secondStudent.firstName);
        System.out.println(secondStudent.getFullName());

        System.out.println(Student.MAX_NUMBER_OF_STUDENTS);
    }

}
