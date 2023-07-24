public class TernaryExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Using ternary operator to find the maximum of two numbers
        int max = (a > b) ? a : b;
        System.out.println("The maximum of " + a + " and " + b + " is " + max);

        // Using ternary operator to check if a number is even or odd
        int num = 7;
        String message = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + message);
    }
}

