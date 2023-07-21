public class PassByValueAndReferenceExample {
    public static void main(String[] args) {
        int number = 10;
        int[] array = {1, 2, 3};

        // Pass by value
        modifyNumber(number);
        System.out.println("After modifyNumber(): " + number);

        // Pass by reference
        modifyArray(array);
        System.out.println("After modifyArray(): " + array[0] + ", " + array[1] + ", " + array[2]);
    }

    public static void modifyNumber(int number) {
        number = 20;
    }

    public static void modifyArray(int[] array) {
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
    }
}