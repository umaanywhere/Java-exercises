public class WrapperExample2 {
    public static void main(String[] args) {
        // Converting int to Integer using Integer constructor
        int num = 10;
        Integer integerNum = new Integer(num);

        // Converting String to Integer using Integer static method
        String str = "20";
        Integer integerStr = Integer.parseInt(str);

        // Converting Integer to int using intValue() method
        int intNum = integerNum.intValue();

        // Using compareTo() method to compare two Integer objects
        int compareResult = integerNum.compareTo(integerStr);

        System.out.println("integerNum = " + integerNum);
        System.out.println("integerStr = " + integerStr);
        System.out.println("intNum = " + intNum);
        System.out.println("compareResult = " + compareResult);
    }
}