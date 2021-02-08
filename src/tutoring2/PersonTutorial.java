package tutoring2;

public class PersonTutorial {
    public static void main(String[] args) {
        // please demonstrate how to create two unique Object
        // of the Person class below
        Person firstPerson = new Person();
        Person secondPerson = new Person();

        // please demonstrate how to set the object's instance vars
        firstPerson.name = "Natalie";
        firstPerson.age = 40;

        secondPerson.name = "Irina";
        secondPerson.age = 37;

        // please print out the name and age of both Person objects
        // using the object to get the values
        System.out.println(firstPerson.name + " --> " + firstPerson.age);
        System.out.println(secondPerson.name + " --> " + secondPerson.age);
    }
}


