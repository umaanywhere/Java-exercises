
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        System.out.println( sb1.capacity());

// example for method chaining
        sb1.append("hello").append("uma").reverse().insert(0,'u');//performs from left to right
        System.out.println(sb1);
    }
}
