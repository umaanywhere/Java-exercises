import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter number of exams: ");
        int numExams = scanner.nextInt();

        int[][] grades = new int[numStudents][numExams];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grades for student " + (i+1) + ": ");
            for (int j = 0; j < numExams; j++) {
                grades[i][j] = scanner.nextInt();
            }
        }

        // Calculating average grade for each student
        double[] averages = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numExams; j++) {
                sum += grades[i][j];
            }
            averages[i] = sum / numExams;
        }

        // Printing average grade for each student
        System.out.println("Average grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i+1) + ": " + averages[i]);
        }
    }
}