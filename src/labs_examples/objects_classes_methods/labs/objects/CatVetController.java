package labs_examples.objects_classes_methods.labs.objects;

public class CatVetController {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.breed = "Abyssinian";
        myCat.age = 3;
        myCat.weight = 20;
        myCat.name = "Abby";

        Vet myVet = new Vet();
        myVet.firstName = "John";
        myVet.lastName = "Smith";
        myVet.credentials = "DVM";
        myVet.yearsOfExperience = 25;


        System.out.println("My cat " + myCat.name + " has a vet named " + myVet.firstName + " " + myVet.lastName +
                ". She is " + myCat.breed + ". She is " + myCat.age + " and weighs " + myCat.weight + " pounds. ");

    }
}
