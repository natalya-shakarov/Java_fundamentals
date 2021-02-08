package tutoring2;

public class PersonTutorial {
    public static void main(String[] args) {
        // please demonstrate how to create two unique Object
        // of the Person class below
        Person firstPerson = new Person();
        firstPerson.name = "Natalie";
        firstPerson.age = 40;

        Person secondPerson = new Person();
        secondPerson.name = "Jon";
        secondPerson.age = 53;


        // please demontsrate how to set the object's instance vars

        // please print out the name and age of both Person objects

        // using the object to get the values

        System.out.println(firstPerson.name + " --> " + firstPerson.age);
        System.out.println(secondPerson.name + " --> " + secondPerson.age);
    }
}

class Person {
    public String name;
    public int age;
}
