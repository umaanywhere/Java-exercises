import java.util.Scanner;

public class RestaurantDiscount {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();
        double discount = 0.0;

        if (totalBill >= 1000) {
            discount = 0.1 * totalBill; // 10% discount for bills >= 1000
        }
        else if (totalBill >= 500) {
            discount = 0.05 * totalBill; // 5% discount for bills >= 500
        }
        else if (totalBill >= 200) {
            discount = 0.02 * totalBill; // 2% discount for bills >= 200
        }
        else{
            System.out.println("Not applicable");
        }

        double finalBill = totalBill - discount;
        System.out.println("Discount applied: " + discount);
        System.out.println("Final bill amount: " + finalBill);
    }
}