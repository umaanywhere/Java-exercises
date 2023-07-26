import java.util.Scanner;

public class GuessingGameWhileLoop {
    public static void main(String[] args) {
        int secretNumber = 42; // The secret number to be guessed
        int guess;

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Try to guess the secret number between 1 and 100.");

        // Keep prompting the user for their guess until they guess the correct number
        while (true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the correct number!");
                break; // Exit the loop when the user guesses the correct number
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Close the Scanner to release resources
        scanner.close();
        System.out.println("Thank you for playing the Guessing Game!");
    }
}