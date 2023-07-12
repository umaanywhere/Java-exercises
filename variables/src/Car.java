public class Car {
    static int totalCars ;// Class variable
    String make;  // Instance variables
    String model;  // Instance variables
    //static block
    static{
        totalCars=0;
        System.out.println("Initializing static data member ");//we can initialize the data member of static variable here and it is executed before main method
    }
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        totalCars++; // it will increment totalCars each time a new Car object is created
    }
    public void displayCarDetails() {
        int carNumber = totalCars; // Local variable
        System.out.println("Car " + carNumber + " - Make: " + make + ", Model: " + model);
    }
    public static void main(String[] args) {
        Car c1 = new Car("ford", "Eco sport");
        c1.displayCarDetails();

        Car c2 = new Car("Hyundai", "i20");
        c2.displayCarDetails();
    }
}