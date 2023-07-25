
public class StringExample1 {
    public static void main(String[] args) {
       // String s=new String("uma");//it creates object of s with value uma and after that in below we are using concat method to concat s and another ,at that time a new object is created with value uma welcome
        //s=s.concat("welcome");// since we are not assigning it to any variable so that it will move to garbage collector
        //System.out.println(s);
        String s=new String("uma");
        String s1=new String("uma");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        }
    }
