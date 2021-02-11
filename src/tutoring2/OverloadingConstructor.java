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

class Car {
    // the engine instance var below is composition
    Engine engine;
    // the stereo instance var below is composition
    Stereo stereo;
    String model;
    String color;

    // car constructor takes an Engine, Stereo, model and color
    public Car(Engine engine, Stereo stereo, String model, String color){
        //
        this.engine = engine;
        this.stereo = stereo;
        this.model = model;
        this.color = color;
    }

    public Car(double horsepower, String brand, String model, String color) {
        this.engine = new Engine(horsepower);
        this.stereo = new Stereo(brand);
        this.model = model;
        this.color = color;
    }
}

 class Engine {
    double horsePower;
    public Engine(double horsePower){
        this.horsePower = horsePower;
    }
}
 class Stereo {
    String brand;
    public Stereo(String brand){
        this.brand = brand;
    }
}