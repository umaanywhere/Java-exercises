package create;

public class ProtectedExample {
    protected int k=10;
    protected void msg()
    {
        System.out.println("leaning protected access specifier");
    }

}
class Learn{
    public static void main(String []args){
        ProtectedExample ob=new ProtectedExample();
        ob.msg();
        System.out.println(ob.k);
//protected can be accessed with same class,same package subclass ,same package non subclass,
    }
}