class Priv {
    private int n=10;
    private void show()
    {
        System.out.println("uma");
    }
}
class c{
    public static void main(String []args)
    {
        Priv p2=new Priv();
        System.out.println(p2.n);//compile time error since private modifier an only be accessed within its only class
        p2.show();

    }
}
