public class AverageCalculator {

    public static double calculateAverage(double... numbers) {
        if (numbers.length == 0) {
            return 0;  // return 0 if no numbers are provided
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Calculate the average of 3 numbers
        double average1 = calculateAverage(2.5, 4.7, 6.3);
        System.out.println("Average 1: " + average1);

        // Calculate the average of 5 numbers
        double average2 = calculateAverage(1.2, 3.4, 5.6, 7.8, 9.0);
        System.out.println("Average 2: " + average2);

        // Calculate the average of no numbers
        double average3 = calculateAverage();  // Returns 0
        System.out.println("Average 3: " + average3);
    }
}