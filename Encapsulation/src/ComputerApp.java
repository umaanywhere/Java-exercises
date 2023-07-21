// Parent class
class Computer {
    protected String brand;
    protected String model;
    protected CPU cpu;
    protected RAM ram;

    public Computer(String brand, String model, CPU cpu, RAM ram) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("CPU: " + cpu.getDescription());
        System.out.println("RAM: " + ram.getDescription());
    }
}
// Component class
class CPU {
    private String brand;
    private String model;

    public CPU(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getDescription() {
        return brand + " " + model + " CPU";
    }
}

// Component class
class RAM {
    private int capacity;
    private String type;

    public RAM(int capacity, String type) {
        this.capacity = capacity;
        this.type = type;
    }

    public String getDescription() {
        return capacity + "GB " + type + " RAM";
    }
}
// Child class
class Laptop extends Computer {
    private double screenSize;

    public Laptop(String brand, String model, CPU cpu, RAM ram, double screenSize) {
        super(brand, model, cpu, ram);
        this.screenSize = screenSize;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}

// Main class
public class ComputerApp {
    public static void main(String[] args) {
        CPU cpu1 = new CPU("Intel", "Core i7");
        RAM ram1 = new RAM(8, "DDR4");
        Computer desktop = new Computer("Dell", "XPS 8930", cpu1, ram1);
        desktop.displayInfo();
        System.out.println();

        CPU cpu2 = new CPU("Dell", "Octal 5");
        RAM ram2 = new RAM(16, "DDR4");
        Laptop laptop = new Laptop("HP", "Pavilion", cpu2, ram2, 15.6);
        laptop.displayInfo();
    }
}