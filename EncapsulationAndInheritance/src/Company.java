// Parent class
class Employee {
    protected String name;
    protected String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

// Child class 1
class Manager extends Employee {
    private String department;

    public Manager(String name, String designation, String department) {
        super(name, designation);
        this.department = department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    public void manageTeam() {
        System.out.println("Managing team...");
    }
}

// Child class 2
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String designation, String programmingLanguage) {
        super(name, designation);
        this.programmingLanguage = programmingLanguage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    public void writeCode() {
        System.out.println("Writing code...");
    }
}

// Main class
public class Company {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", "Manager", "IT");
        manager.displayInfo();
        manager.manageTeam();
        System.out.println();

        Developer developer = new Developer("Jane Smith", "Developer", "Java");
        developer.displayInfo();
        developer.writeCode();
    }
}