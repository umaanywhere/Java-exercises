class SmartPhones{
    String name;
    int releaseyear;
    void insertLatest(String nam,int year)
    {
        name=nam;
        releaseyear=year;
    }
    void display()
    {
        System.out.println(name+" "+releaseyear);
    }
}
class Test
{
    public static void main(String []args)
    {
        SmartPhones s1=new SmartPhones();
        //s1.name="vivo";//by reference variable
        //s1.releaseyear=2001;//by reference variable
        s1.insertLatest("samsung",2012);
        s1.display();

        SmartPhones s2=new SmartPhones();
        //s2.name="oppo";//by reference variable
        //s2.releaseyear=2008;//by reference variable
        s2.insertLatest("reno",2019);//by method
        s2.display();



    }
}
