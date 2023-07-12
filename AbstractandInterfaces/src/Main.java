abstract class Shape {
    public abstract double calculateArea();
    public void displayArea() {
        double area = calculateArea();
        System.out.println("The area of the shape is: " + area);
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 7);
        r.displayArea();

        Circle c = new Circle(3);
        c.displayArea();
    }
}