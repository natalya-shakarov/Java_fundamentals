package labs_examples.objects_classes_methods.labs.objects;

public class Airplane {

    private String manufacturer; //Boeing
    private String model;        //747
    private int year;         //2021
    private AirplaneCockpit cockpit;
    private AirplaneCabin cabin;
    private AirplaneEngine engine;
    private AirplaneLandingGear landingGear;

    public Airplane(String manufacturer, String model, int year,
                    AirplaneCockpit cockpit, AirplaneCabin cabin, AirplaneEngine engine, AirplaneLandingGear landingGear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.cockpit = cockpit;
        this.cabin = cabin;
        this.engine = engine;
        this.landingGear = landingGear;
    }
}
