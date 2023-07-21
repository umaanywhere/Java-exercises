import java.util.stream.IntStream;
public class WaysOfInitializingArray {
    public static void main(String[] args)
    {
        // int[] intArray=IntStream.range(1,10).toArray();//last value is not included in array
        // int[] intArray1=IntStream.rangeClosed(1,10).toArray();//last element is included in array
        //int[] c=IntStream.of(1,5,8,2,10).toArray();
        int[] c=IntStream.of(1,5,8,2,10).sorted().toArray();
        
        for (int i = 0; i < c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
}
