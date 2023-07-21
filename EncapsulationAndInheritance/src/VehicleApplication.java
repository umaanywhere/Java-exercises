// Parent class
class MotorVehicle {
    protected String brand;
    protected String model;
    protected Engine engine;

    public MotorVehicle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engine.getDescription());
    }
}

// Component class
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getDescription() {
        return type + " engine";
    }
}

// Main class
public class VehicleApplication {
    public static void main(String[] args) {
        Engine engine1 = new Engine("Petrol");
        MotorVehicle car = new MotorVehicle("Toyota", "Camry", engine1);
        car.displayInfo();
        System.out.println();

        Engine engine2 = new Engine("Diesel");
        MotorVehicle truck = new MotorVehicle("Ford", "F-150", engine2);
        truck.displayInfo();
    }
}