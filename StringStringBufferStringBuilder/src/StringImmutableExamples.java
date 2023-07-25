public class StringImmutableExamples {
    public static void main(String[] args) {
        String s1=new String("software");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();//here there is no change in the content of s1 with s3,so s3 will added as a reference along with s1 in heap memory
        System.out.println(s1==s2);
        System.out.println(s1==s3);//both has same reference so it is true

        String s4="solutions";
        String s5=s4.toString();
        String s6=s4.toLowerCase();
        String s7=s4.toUpperCase();
        System.out.println(s4==s5);
        System.out.println(s4==s6);
        System.out.println(s4==s7);
    }
}
