import java.util.Scanner;

public class PizzaOrder {
    private static final Scanner scanner = new Scanner(System.in);
    private static int vegSum = 0, nonVegSum = 0, sidesCost = 0, totalCost = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to Vikasietum Pizza Hut");
        while (true) {
            System.out.println("Press 1 for vegetarian pizza, 2 for non-vegetarian pizza, 3 for side dishes, or any other number to exit:");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    vegSum += vegetarian();
                    break;
                case 2:
                    nonVegSum += nonVegetarian();
                    break;
                case 3:
                    sidesCost += sides();
                    break;
                default:
                    System.out.println("Invalid option. Exiting...");
                    break;
            }
            totalCost = vegSum + nonVegSum + sidesCost;
            if (option != 1 && option != 2 && option != 3) break;
        }
        System.out.println("Veg cost: " + vegSum);
        System.out.println("Non-veg cost: " + nonVegSum);
        System.out.println("Sides cost: " + sidesCost);
        System.out.println("Total cost: " + totalCost);
    }

    private static int vegetarian() {
        System.out.println("Press 1 for deluxe veggie, 2 for cheese and corn, or 3 for paneer tikka:");
        int pizzaOption = scanner.nextInt();
        int pizzaCost = 0, toppingsCost = 0, totalCost = 0;
        switch (pizzaOption) {
            case 1:
                pizzaCost = 100;
                break;
            case 2:
                pizzaCost = 150;
                break;
            case 3:
                pizzaCost = 200;
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
        if (pizzaCost != 0) {
            System.out.println("Press 1 for veg toppings, 2 for extra cheese toppings, or any other number for no toppings:");
            int toppingsOption = scanner.nextInt();
            switch (toppingsOption) {
                case 1:
                    toppingsCost = 50;
                    break;
                case 2:
                    toppingsCost = 35;
                    break;
                default:
                    System.out.println("No toppings selected.");
                    break;
            }
        }
        totalCost = pizzaCost + toppingsCost;
        return totalCost;
    }

    private static int nonVegetarian() {
        System.out.println("Press 1 for non-veg supreme, 2 for chicken tikka, or 3 for pepper barbeque chicken:");
        int pizzaOption = scanner.nextInt();
        int pizzaCost = 0, toppingsCost = 0, totalCost = 0;
        switch (pizzaOption) {
            case 1:
                pizzaCost = nonVegBase(pizzaOption);
                break;
            case 2:
                pizzaCost = nonVegBase(pizzaOption);
                break;
            case 3:
                pizzaCost = nonVegBase(pizzaOption);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                break;
        }
        if (pizzaCost != 0) {
            System.out.println("Press 1 for non-veg toppings, 2 for extra cheese toppings, or any other number for no toppings:");
            int toppingsOption = scanner.nextInt();
           
