class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String brand, int numberOfSeats) {
        super(brand);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    public void park() {
        System.out.println("Parking a car");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void drive() {
        System.out.println("Driving a motorcycle");
    }

    public void performStunt() {
        System.out.println("Performing a stunt");
    }
}

 class VehicleRental {
    public static void main(String[] args) {
        Vehicle car = new Car("Honda", 4);
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", false);

        car.drive();
        motorcycle.drive();

        // Upcasting
        Vehicle vehicle1 = new Car("Toyota", 5);
        Vehicle vehicle2 = new Motorcycle("BMW", true);

        vehicle1.drive();
        vehicle2.drive();
        //vehicle1.park();//compilation error since superclass reference cannot be used for accessing method specific to subclass
    }
}