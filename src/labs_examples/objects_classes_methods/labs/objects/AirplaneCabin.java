package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneCabin {

    private int numberOfSeats;
    private int numberOfBathrooms;
    private int numberOfWindows;

    public AirplaneCabin (int numberOfSeats, int numberOfBathrooms, int numberOfWindows) {
        this.numberOfSeats = numberOfSeats;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfWindows = numberOfWindows;
    }

    @Override
    public String toString() {
        return "AirplaneCabin{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfWindows=" + numberOfWindows +
                '}';
    }
}
