abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract double calculateMonthlySalary();

    public String getName() {
        return name;
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlySalary() {
        return hourlyRate * hoursWorked;
    }
}

class ContractEmployee extends Employee {
    private double contractAmount;

    public ContractEmployee(String name, double contractAmount) {
        super(name);
        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateMonthlySalary() {
        return contractAmount / 12;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new FullTimeEmployee("Pooja", 5000);
        employees[1] = new PartTimeEmployee("Abi", 20, 80);
        employees[2] = new ContractEmployee("Gopi", 60000);

        for (Employee employee : employees) {
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Monthly Salary:" + employee.calculateMonthlySalary());
            System.out.println("------------------------------");
        }
    }
}