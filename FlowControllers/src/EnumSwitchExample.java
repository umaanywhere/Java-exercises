import java.util.Scanner;

enum CoffeeType {
    ESPRESSO, AMERICANO, LATTE, CAPPUCCINO, MOCHA
}

public class EnumSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your coffee type: ");
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println((type.ordinal() + 1) + ". " + type.name());
        }
        int choice = scanner.nextInt();

        switch (CoffeeType.values()[choice - 1]) {
            case ESPRESSO:
                System.out.println("You ordered an Espresso.");
                break;
            case AMERICANO:
                System.out.println("You ordered an Americano.");
                break;
            case LATTE:
                System.out.println("You ordered a Latte.");
                break;
            case CAPPUCCINO:
                System.out.println("You ordered a Cappuccino.");
                break;
            case MOCHA:
                System.out.println("You ordered a Mocha.");
                break;
            default:
                System.out.println("Invalid coffee selection.");
        }
    }
}