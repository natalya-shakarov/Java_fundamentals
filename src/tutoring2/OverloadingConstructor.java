package tutoring2;

public class OverloadingConstructor {
    public static void main(String[] args){
        // create the engine object
        Engine myEngine = new Engine(400);
        // create the stereo object
        Stereo myStereo = new Stereo("Panasonic");

        // pass the engine and stereo objects to the Car constructor
        Car myCar = new Car(myEngine, myStereo, "XTerra", "Blue");

        // print out to prove that it worked
        System.out.println("I drive a " + myCar.color + " " + myCar.model + " with a sweet "
                + myCar.stereo.brand + " stereo, and a " + myCar.engine.horsePower
                + " horse power engine");

        Car myNewCar = new Car(100.7, "Panasonic", "Mazda", "white");
        System.out.println("I drive a " + myNewCar.color + " " + myNewCar.model + " with a sweet "
                + myNewCar.stereo.brand + " stereo, and a " + myNewCar.engine.horsePower
                + " horse power engine");
    }
}

