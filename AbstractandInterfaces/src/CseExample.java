interface ComputerComponent {
    void start();
    void shutdown();
}
class Processor implements ComputerComponent {// Implement the interface for a processor
    public void start() {
        System.out.println("Processor started");
    }
    public void shutdown() {
        System.out.println("Processor shutdown");
    }
}
class Memory implements ComputerComponent {  // Implement the interface for a memory module
    public void start() {
        System.out.println("Memory module started");
    }

    public void shutdown() {
        System.out.println("Memory module shutdown");
    }
}
public class CseExample {
    public static void main(String[] args) {
        ComputerComponent processor = new Processor();
        ComputerComponent memory = new Memory();
        processor.start();
        memory.start();
        processor.shutdown();
        memory.shutdown();
    }
}