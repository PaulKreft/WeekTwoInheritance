package de.neuefische.PaulKreft;

public class Vehicle {
    private String model;
    private String manufacturer;
    private int yearOfManufacturing;

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public Vehicle(String model, String manufacturer, int yearOfManufacturing) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public void printInformation() {
        System.out.println("Vehicle{" + "model='" + model + '\'' + ", manufacturer='" + manufacturer + '\'' + ", yearOfManufacturing=" + yearOfManufacturing + '}');
    }
}
