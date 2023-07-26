public class NamesAppForEachLoop {
    public static void main(String[] args) {
        // Define an array of names
        String[] names = {"Uma", "Gayu", "Pavithra", "Eva", "Anu"};

        // Using the enhanced for-each loop to iterate over the array
        System.out.println("List of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}