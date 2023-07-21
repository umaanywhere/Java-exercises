class Test {
    private Test ()  //private constructor
    {
        System.out.println("Enjoy the learning");
    }
    public static void instanceMethod() // creating public static method
    {
        Test obj = new Test();// creating object of Test class
    }

}
class PrivateConstructor {

    public static void main(String[] args) {
        Test.instanceMethod();// calls the instanceMethod()
    }
}