package tutoring2;

class Car {
    // the engine instance var below is composition
    Engine engine;
    // the stereo instance var below is composition
    Stereo stereo;
    String model;
    String color;

    // car constructor takes an Engine, Stereo, model and color
    public Car(Engine engine, Stereo stereo, String model, String color) {
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
