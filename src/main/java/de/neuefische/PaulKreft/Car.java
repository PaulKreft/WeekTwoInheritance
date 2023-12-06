package de.neuefische.PaulKreft;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, String manufacturer, int yearOfManufacturing, int numberOfDoors) {
        super(model, manufacturer, yearOfManufacturing);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void printInformation() {
        System.out.println("Car{" + "model='" + getModel() + '\'' + ", manufacturer='" + getManufacturer() + '\'' + ", yearOfManufacturing=" + getYearOfManufacturing() + ", numberOfDoors=" + numberOfDoors + '}');
    }
}
