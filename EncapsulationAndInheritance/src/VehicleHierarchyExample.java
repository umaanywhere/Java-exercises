// Parent class
class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving the vehicle.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    private int numOfSeats;

    public Car(String brand, String model, int numOfSeats) {
        super(brand, model);
        this.numOfSeats = numOfSeats;
    }

    public void drive() {
        System.out.println("Driving the car.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Seats: " + numOfSeats);
    }
}

// Child class inheriting from Vehicle
class Motorcycle extends Vehicle {
    private boolean hasSideMirror;

    public Motorcycle(String brand, String model, boolean hasSideMirror) {
        super(brand, model);
        this.hasSideMirror = hasSideMirror;
    }

    public void drive() {
        System.out.println("Driving the motorcycle.");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has SideMirror: " + hasSideMirror);
    }
}

// Main class to test the Vehicle hierarchy
public class VehicleHierarchyExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 5);
        car.displayInfo();
        car.drive();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", false);
        motorcycle.displayInfo();
        motorcycle.drive();
    }
}