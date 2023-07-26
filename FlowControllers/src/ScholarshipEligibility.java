import java.util.Scanner;

public class ScholarshipEligibility {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble();
        System.out.print("Enter your family's annual income: ");
        double annualIncome = scanner.nextDouble();

        if (gpa >= 3.5) {
            if (annualIncome < 50000) {
                System.out.println("Congratulations! You are eligible for a full scholarship.");
            } else {
                System.out.println("Congratulations! You are eligible for a partial scholarship.");
            }
        }
        else {
            System.out.println("Sorry, you are not eligible for any scholarships.");
        }
    }
}