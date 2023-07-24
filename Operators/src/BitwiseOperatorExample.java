public class BitwiseOperatorExample {
    public static void main(String[] args) {
        int a = 60;  // 0011 1100
        int b = 13;  // 0000 1101

        // Using bitwise AND operator
        int c = a & b;
        System.out.println("a & b = " + c);

        // Using bitwise OR operator
        c = a | b;
        System.out.println("a | b = " + c);

        // Using bitwise XOR operator
        c = a ^ b;
        System.out.println("a ^ b = " + c);

        // Using bitwise NOT operator
        c = ~a;
        System.out.println("~a = " + c);

        // Using left shift operator
        c = a << 2;
        System.out.println("a << 2 = " + c);

        // Using right shift operator
        c = a >> 2;
        System.out.println("a >> 2 = " + c);
    }
}