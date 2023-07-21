class WrappingExample1{
    public static void main(String[] args)
    {
        int i=10;
        float f= 5.5F;
        Integer i1= Integer.valueOf(i);//boxing occurs that is i1 is a box which holds value of i
        int j=i1.intValue();//unboxing,getting value from i1
        Integer i2=20;//autoboxing i.e compiler internally takes it as  Integer i1= Integer.valueOf(20)
        int k=i2;//auto unboxing
        String s="77676";
        int i3=Integer.parseInt(s);
        System.out.println(i3);
    }
}