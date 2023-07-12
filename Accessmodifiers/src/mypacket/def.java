package mypacket;
import packet.*;
class def {
   public static void main(String []args)
    {
        A a1=new A();
        System.out.println(a1.v);
        System.out.println(a1.a);
        a1.reveal();//default member modifier cannot be accessed from outside the package

    }



}
