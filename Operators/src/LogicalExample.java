public class LogicalExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 15;

        // Using logical AND operator
        if (a > b && a > c) {
            System.out.println("a is the largest number");
        }

        // Using logical OR operator
        if (b > a || b > c) {
            System.out.println("b is greater than at least one of the numbers");
        }

        // Using logical NOT operator
        boolean isGreaterThanTen = !(a < 10);
        System.out.println("Is a greater than 10? " + isGreaterThanTen);
    }
}