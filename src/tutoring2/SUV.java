package tutoring2;

public class SUV {
    private String color;
    private String manufacturer;
    private String model;

    public SUV(String color, String manufacturer, String model) {
        this.color = color;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
