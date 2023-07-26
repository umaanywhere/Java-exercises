import java.util.Scanner;

public class ShoppingCartBreakExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_ITEMS = 10;
        String[] cartItems = new String[MAX_ITEMS];
        double[] itemPrices = new double[MAX_ITEMS];
        int itemCount = 0;
        double totalAmount = 0;

        System.out.println("Welcome to the Shopping Cart!");

        while (itemCount < MAX_ITEMS) {
            System.out.print("Enter the item you want to add to the cart (or 'checkout' to proceed): ");
            String item = scanner.nextLine();

            if (item.equalsIgnoreCase("checkout")) {
                break;
            }

            System.out.print("Enter the price of the item: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline left by nextDouble()

            cartItems[itemCount] = item;
            itemPrices[itemCount] = price;
            itemCount++;
            totalAmount += price;
        }

        System.out.println("\nItems in your cart:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(cartItems[i]);
        }

        System.out.println("\nTotal Amount to be Paid: " + totalAmount);
        System.out.println("Thank you for shopping with us!");
        scanner.close();
    }
}