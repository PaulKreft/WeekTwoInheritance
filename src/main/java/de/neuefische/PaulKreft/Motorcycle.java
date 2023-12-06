package de.neuefische.PaulKreft;

public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String model, String manufacturer, int yearOfManufacturing, String type) {
        super(model, manufacturer, yearOfManufacturing);
        this.type = type;
    }

    @Override
    public void printInformation() {
        System.out.println("Motorcycle{" + "model='" + getModel() + '\'' + ", manufacturer='" + getManufacturer() + '\'' + ", yearOfManufacturing=" + getYearOfManufacturing() + ", type=" + '\'' + type + '\'' + '}');

    }
}
