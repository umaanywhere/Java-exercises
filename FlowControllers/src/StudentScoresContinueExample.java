import java.util.Scanner;

public class StudentScoresContinueExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        double totalScore = 0;
        int validScoresCount = 0;

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the score for student " + i + ": ");
            double score = scanner.nextDouble();

            if (score < 0) {
                System.out.println("Invalid score entered. Skipping...");
                continue;
            }

            totalScore += score;
            validScoresCount++;
        }

        if (validScoresCount > 0) {
            double averageScore = totalScore / validScoresCount;
            System.out.println("\nAverage score of " + validScoresCount + " students: " + averageScore);
        } else {
            System.out.println("No valid scores entered.");
        }

        //scanner.close();
    }
}