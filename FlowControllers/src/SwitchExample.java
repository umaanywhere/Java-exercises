import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();
        String day;
        switch (dayNumber) {
            case 1:
                day = "Sunday";
               break;
            case 2:
                day = "Monday";
               break;
            case 3:
                day = "Tuesday";
               break;
            case 4:
                day = "Wednesday";
                break;
            case 5:
                day = "Thursday";
               break;
            case 6:
                day = "Friday";
                break;
            case 7:
                day = "Saturday";
               break;
            default:
                day = "Invalid day number";

        }

        System.out.println("The day is: " + day);
    }
}