package labs_examples.objects_classes_methods.labs.objects;

public class ObjectsExercises {
    public static void main(String[] args) {
        AirplaneCabin myAirplaneCabin = new AirplaneCabin(50, 4, 50);
        AirplaneCockpit myAirplaneCockpit = new AirplaneCockpit("Jon", "Kyle");
        AirplaneEngine myAirplaneEngine = new AirplaneEngine("General Electric CF6", 238604.0, 238603.1);
        AirplaneLandingGear myAirplaneLandingGear =new AirplaneLandingGear(8, 2.5);
        Airplane myAirplane = new Airplane("Boeing", "747", 2021,
                myAirplaneCockpit, myAirplaneCabin, myAirplaneEngine, myAirplaneLandingGear);
        System.out.println(myAirplane.toString());
        System.out.println(myAirplaneCabin.toString());
        System.out.println(myAirplaneCockpit.toString());
        System.out.println(myAirplaneEngine.toString());
        System.out.println(myAirplaneLandingGear.toString());
    }
}
