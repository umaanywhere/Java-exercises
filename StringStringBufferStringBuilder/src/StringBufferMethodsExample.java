public class StringBufferMethodsExample {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("uma");
        System.out.println(sb.capacity());//s.length+16

        StringBuffer sb1=new StringBuffer("happyMorning");
        System.out.println(sb1.length());

        StringBuffer sb2=new StringBuffer("Career Growth");
        System.out.println(sb2.charAt(3));
        //System.out.println(sb2.charAt(40));//whether it is string or string we always StringIndexOutOfBoundsException only in java

        StringBuffer sb3=new StringBuffer("Java");
        sb3.setCharAt(0,'M');
        System.out.println(sb3);

        StringBuffer sb4=new StringBuffer("Learning Java");
        sb4.append('!');//using append it can be added only at the end
        sb4.append(71);
        sb4.append(true);
        System.out.println(sb4);

        StringBuffer sb5=new StringBuffer("Learning endless");
        sb5.insert(8," is");//insert is used to add at specific portion
        System.out.println(sb5);
        sb5.delete(1,5);
        System.out.println(sb5);
        sb5.deleteCharAt(0);
        System.out.println(sb5);

        StringBuffer sb6=new StringBuffer("hello all");
        System.out.println(sb6.reverse());

        StringBuffer sb7=new StringBuffer("Happy Learning");
        sb7.setLength(20);
        System.out.println(sb7);

        StringBuffer sb8=new StringBuffer();
        sb8.ensureCapacity(50);//To increase capacity dynamically,we can use ensureCapacity method
        System.out.println(sb8.capacity());
        System.out.println(sb8);

        StringBuffer sb9=new StringBuffer(100);
        sb9.append("hello");
        sb9.trimToSize();
        System.out.println(sb9);
        System.out.println(sb.capacity());



    }

}
