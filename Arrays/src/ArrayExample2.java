import java.util.*;
import java.util.stream.IntStream;
public class ArrayExample2  {

    public static void main(String[] args) {

        String [] n = {"Uma", "Priya", "Bhuvi", "Nishitha", "Gayathri"};

        for (int i = 0; i < n.length; i++) {
            System.out.println("Element at index " + i + " : " + n[i]);
            System.out.println(Arrays.toString(n));
        }
    }
}