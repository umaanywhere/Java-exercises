public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 3;

        // Operator Precedence
        int result = a + b * c;
        System.out.println("Result of a + b * c = " + result);

        //  Operator Associativity
        int x = 10, y = 5, z = 3;
        result = (x + y) * z;
        System.out.println("Result of (x + y) * z = " + result);

        //  Parentheses to Control Precedence
        result = a + (b * c);
        System.out.println("Result of a + (b * c) = " + result);
    }
}