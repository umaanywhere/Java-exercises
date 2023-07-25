public class StringBufferConstructorExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("happylearninguma");//since it has 16 characters ,it will not create new object .It will create new object  at the time of adding 17th char.
        System.out.println(sb.capacity());
        sb.append("u");
        System.out.println(sb.capacity());

        StringBuffer sb1=new StringBuffer(500);
        System.out.println(sb1.capacity());

        StringBuffer sb2=new StringBuffer("umamahi");
        System.out.println(sb2.capacity()) ;

    }
}
