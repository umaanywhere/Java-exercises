import java.util.Scanner;

public class StringTrimExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = s.nextLine();

        // Trim the input to remove leading and trailing whitespaces
        String trimmedUsername = username.trim();

        // Check if the trimmed username is empty
        if (trimmedUsername.isEmpty()) {
            System.out.println("You entered an empty username.");
        } else {
            System.out.println("Your trimmed username is: " + trimmedUsername);
        }
    }
}
