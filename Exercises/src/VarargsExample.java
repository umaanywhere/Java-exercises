public class VarargsExample {
    public static void main(String[] args) {
        printNumbers(1, 2, 3); // calling the varargs method
        printNumbers(4, 5, 6, 7, 8); // calling the varargs method with more arguments
    }

    public static void printNumbers(int... numbers) {
        // varargs parameter is treated as an array
        System.out.print("Numbers: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}