public class StringConstructorOfCharArrayExample {
    public static void main(String[] args) {
        // for char array
        char[] c={'j','a','v','a'};
        String s=new String(c);//here for character object equivalent string is created and stored in s.
        System.out.println(s);
        //for byte array
        byte[] b={97,98,99,100};
        String s1=new String(b);
        System.out.println(s1);
    }
}
