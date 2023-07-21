package mycreate;
import create.*;
//different package subclass protected can be accessed
 class MyProtect extends ProtectedExample{
     public static void main(String []args){
         MyProtect obj=new MyProtect();
         obj.msg();
         System.out.println(obj.k);

     }
 }

