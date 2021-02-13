package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneLandingGear {

    private int numberOfWheels;
    private double wheelsRadiusMeters;

    public AirplaneLandingGear(int numberOfWheels, double wheelsRadiusMeters) {
        this.numberOfWheels = numberOfWheels;
        this.wheelsRadiusMeters = wheelsRadiusMeters;
    }

    @Override
    public String toString() {
        return "AirplaneLandingGear{" +
                "numberOfWheels=" + numberOfWheels +
                ", wheelsRadiusMeters=" + wheelsRadiusMeters +
                '}';
    }
}
