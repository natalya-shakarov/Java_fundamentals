package tutoring2;

public class ThisIsMyRandomlyNamedTutorial {
    public static void main(String[] args) {
        // create an object of the Example class so that we can call the non-static paintCar()
        // method below
        System.out.println("Before tutorial construction");
        ThisIsMyRandomlyNamedTutorial ex = new ThisIsMyRandomlyNamedTutorial();
        System.out.println("After tutorial construction");
        // create a new Car object named "car" - it is a Blue Nissan XTerra
        SUV suv = new SUV("Blue", "Nissan", "XTerra");
        // the line below will print "Blue"
        System.out.println("SUV color is: " + suv.getColor());
        // call the non-static paintCar() method using the "ex" object and pass the car object
        ex.paintSUV(suv);
        // the line below will print "Green"
        System.out.println("SUV color is: " + suv.getColor());
    }

    public ThisIsMyRandomlyNamedTutorial() {
        System.out.println("Constructed a new SUVMethodTutorial object.");
    }

    /* the method below accepts a Car object - it changes the color of the car - it does
    not need to return the car - because the carVar object in paintCar() is a reference
    to the object "car" created in the main() method. */
    public void paintSUV(SUV suvVar){
        suvVar.setColor("Green");
    }
}
