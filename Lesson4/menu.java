package ICT152Java.Lesson4;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int choice;
        double totalCost = 0.0;

        System.out.println("Welcome to the menu ordering system!");
        System.out.println("1. Burger - $5.00");
        System.out.println("2. Pizza - $7.00");
        System.out.println("3. Salad - $4.50");
        System.out.println("4. Soda - $1.50");
        System.out.println("5. Exit");
        System.out.println("Enter the number of the item you want to order:");

        choice = scnr.nextInt();

        switch (choice) {
            case 1:
                totalCost += 5.00;
                System.out.println("You ordered a Burger.");
                break;
            case 2:
                totalCost += 7.00;
                System.out.println("You ordered a Pizza.");
                break;
            case 3:
                totalCost += 4.50;
                System.out.println("You ordered a Salad.");
                break;
            case 4:
                totalCost += 1.50;
                System.out.println("You ordered a Soda.");
            case 5:
                System.out.println("Thank you for visiting!");
                return;// Exit the program
            default:
                System.out.println("Invalid choice. Please select again.");
            
        }

        System.out.println("Your total cost is $" + totalCost);

        scnr.close();

    }
}
