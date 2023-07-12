final class FinalClass {
    public void display() {
        System.out.println("Welcome,Uma");
    }

    public static final void finalExample()// final method
    {
        final String message = "Hello, world!";

        System.out.println(message);
    }
}

public class ExampleProgram {
    public static void main(String[] args) {
        final int number = 10; // final variable

        System.out.println("number is: " + number);

        finalExample();

        FinalClass finalObj = new FinalClass(); // final class object
        finalObj.display();
    }
}


