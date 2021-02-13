package labs_examples.objects_classes_methods.labs.objects;

public class Dog {

    private String name;
    private int weight;
    private String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Dog(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + " " + weight;
    }
}
