public class StringBufferExample1 {
    public static void main(String[] args)
    {
        String s=new String("Welcome");
        s.concat("uma");//here new object is created with Welcome Uma but it is not referenced with any reference variable so it is to be meant for garbage collection
        System.out.println(s);//so s object has only welcome on it.
        StringBuffer s1=new StringBuffer("welcome");
        s1.append("uma");//since string buffer is immutable we can change with the new performance on it so that new object won't be created and it is reflected in the existing object content itself
        System.out.println(s1);
        StringBuffer s2=new StringBuffer("uma");
        StringBuffer s3=new StringBuffer("uma");
        System.out.println(s2==s3);//used for reference comparison in both string and stringbuffer
        System.out.println(s2.equals(s3));// used for reference comparison since equals()method is not overridden from object class in stringbuffer but it is overridden in string class and there it is made for content comparison
    }
}
