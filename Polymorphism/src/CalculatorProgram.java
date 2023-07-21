class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
}

public class CalculatorProgram {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Addition
        int sum1 = calculator.add(5, 10);
        double sum2 = calculator.add(2.5, 3.7);

        // Subtraction
        int difference1 = calculator.subtract(10, 5);
        double difference2 = calculator.subtract(8.9, 4.2);

        // Multiplication
        int product1 = calculator.multiply(4, 6);
        double product2 = calculator.multiply(2.5, 3.5);

        System.out.println("Sum (int): " + sum1);
        System.out.println("Sum (double): " + sum2);
        System.out.println("Difference (int): " + difference1);
        System.out.println("Difference (double): " + difference2);
        System.out.println("Product (int): " + product1);
        System.out.println("Product (double): " + product2);
    }
}
