import de.neuefische.PaulKreft.Car;
import de.neuefische.PaulKreft.Motorcycle;
import de.neuefische.PaulKreft.Vehicle;

public class DreamGarage {
    public static void main(String[] args) {
        Vehicle dreamVehicle = new Vehicle("Master 419", "Porsche", 1962);
        Car weekendCar = new Car("Corsa", "Opel", 2004, 3);
        Motorcycle feelGoodBike = new Motorcycle("Black Shadow", "Vincent", 1952, "Bike to flex with");

        dreamVehicle.printInformation();
        weekendCar.printInformation();
        feelGoodBike.printInformation();
    }
}
