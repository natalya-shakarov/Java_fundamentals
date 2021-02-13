package labs_examples.objects_classes_methods.labs.objects;

public class DogController {
    public static void main(String[] args) {
        Dog firstDog = new Dog("Fido");
        Dog secondDog = new Dog("Lucy", 20);
        Dog thirdDog = new Dog("Spike", 50, "brown");
        System.out.println(firstDog);
        System.out.println(secondDog);
        System.out.println(thirdDog);
    }
}
