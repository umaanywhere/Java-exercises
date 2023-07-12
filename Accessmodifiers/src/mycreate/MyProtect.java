package mycreate;
import create.*;
//different package subclass proetected can be accessed
 class MyProtect extends Pro{
     public static void main(String []args){
         MyProtect obj=new MyProtect();
         obj.msg();
         System.out.println(obj.k);

     }
 }

