package mypack;
import other.*;
public class Pub {
    public static void main(String []args)
    {
        Profile p=new Profile();
        p.output();
        System.out.println(p.firstname);
        System.out.println(p.lastname);

    }

}