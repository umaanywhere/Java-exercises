public class FinalAndImmutabilityExample {
    public static void main(String[] args) {
       final StringBuffer s=new StringBuffer("Welcome");
       s.append("uma");
        System.out.println(s);//here final doesn't create immutability .this code follows stringbuffer concept only i.e:mutable
        //s=s.append("hello");//compile time error because we cannot reassign a value to final variable
    }
}
