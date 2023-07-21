class PrivateExample {
    private int n=10;
    private void show()
    {
        System.out.println("uma");
    }
}
class c{
    public static void main(String []args)
    {
        PrivateExample p2=new PrivateExample();
        System.out.println(p2.n);//compile time error since private modifier an only be accessed within its only class
        p2.show();

    }
}
