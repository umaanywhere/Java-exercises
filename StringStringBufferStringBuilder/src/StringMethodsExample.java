public class StringMethodsExample {
    public static void main(String[] args) {
        String s="UmaMahi";
        System.out.println(s.charAt(5));
        //System.out.println(s.charAt(20));//Runtime exception :String index out of bounce exception occurs
        s=s.concat("FullCreative");//here it can also be replaced with s=s+"FullCreative" or s+="FullCreative" instead of concat method
        System.out.println(s);

        String s1="Good day";
        System.out.println(s1.equals("GOOD DAY"));//because in string equals() method is overridden from object class for content comparison
        System.out.println(s1.equalsIgnoreCase("GOOD DAY"));//here,the cases of upper and lower is not considered/ignored and only the content is compared here

        String s2=null;
        System.out.println(s2);
        System.out.println(s2.length());//check this part with all methods

        String s3="Learning is necessary";
        System.out.println(s3.length());//length starts from 1.If we use length variable as present below in here means it will throw compile time error

        int[] s4={10,20,30,40};
        System.out.println(s4.length);//here length variable is used for getting length of array.if we use length() here it gives compile time error

        String s5="blablabla";
        System.out.println(s5.replace('l','a'));

        String s6="HappyLearning";
        System.out.println(s6.substring(3));
        System.out.println(s6.substring(3,9));//it begins from 3rd index and stops at 9-1 i.e:at 8th index

        String s7="UmaMahi";
        System.out.println(s7.indexOf('a'));//if same character is available for multiple times in a word then it return index of when that character is available for first time in a word
        System.out.println(s7.lastIndexOf('a'));//it returns last occurrence index of that character
        System.out.println(s7.toUpperCase());
    }

}
