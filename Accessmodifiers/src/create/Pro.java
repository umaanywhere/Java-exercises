package create;

public class Pro {
    protected int k=10;
    protected void msg()
    {
        System.out.println("leaning protected access specifier");
    }

}
class Learn{
    public static void main(String []args){
        Pro ob=new Pro();
        ob.msg();
        System.out.println(ob.k);
//protected can be accessed with same class,same package subclass ,same package non subclass,
    }
}