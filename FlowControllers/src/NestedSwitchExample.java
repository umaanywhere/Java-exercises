import java.util.Scanner;

public class NestedSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a car brand: ");
        System.out.println("1. Toyota");
        System.out.println("2. Honda");
        System.out.println("3. Ford");
        int carBrand = scanner.nextInt();

        System.out.println("Choose a model: ");
        System.out.println("1. Classic");
        System.out.println("2. SUV");
        System.out.println("3. EcoSport");
        int model = scanner.nextInt();

        switch (carBrand) {
            case 1:
                System.out.println("You selected Toyota.");
                switch (model) {
                    case 1:
                        System.out.println("You selected a Toyota Sedan.");
                        break;
                    case 2:
                        System.out.println("You selected a Toyota SUV.");
                        break;
                    case 3:
                        System.out.println("You selected a Toyota Hatchback.");
                        break;
                    default:
                        System.out.println("Invalid model selection for Toyota.");
                }
                break;
            case 2:
                System.out.println("You selected Honda.");
                switch (model) {
                    case 1:
                        System.out.println("You selected a Honda Sedan.");
                        break;
                    case 2:
                        System.out.println("You selected a Honda SUV.");
                        break;
                    case 3:
                        System.out.println("You selected a Honda Hatchback.");
                        break;
                    default:
                        System.out.println("Invalid model selection for Honda.");
                }
                break;
            case 3:
                System.out.println("You selected Ford.");
                switch (model) {
                    case 1:
                        System.out.println("You selected a Ford Sedan.");
                        break;
                    case 2:
                        System.out.println("You selected a Ford SUV.");
                        break;
                    case 3:
                        System.out.println("You selected a Ford Hatchback.");
                        break;
                    default:
                        System.out.println("Invalid model selection for Ford.");
                }
                break;
            default:
                System.out.println("Invalid car brand selection.");
        }
    }
}