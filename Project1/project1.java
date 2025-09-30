package ICT152Java.Project1;
import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int selection;
        double totalCost = 0.0;
        int quantity;
        char decision;
        double ham = .50;
        double multipleItems;

        System.out.println("Welcome to Garfield Cafe!");
        System.out.println("1: Coffee - $3.99");
        System.out.println("2: Tea - $4.99");
        System.out.println("3. Grilled Cheese Sandwich - $7.99");
        System.out.println("4. Banana Nut Muffin - $2.99");
        System.out.println("5. Orange Juice - $5.99");

        selection = scnr.nextInt();

        switch (selection) {
            case 1:
                totalCost += 3.99;
                System.out.println("How many cups of coffee would you like?");
                quantity = scnr.nextInt();
                multipleItems = quantity * totalCost;
                System.out.print("For " + quantity + " cups of coffee, your total is $");
                System.out.printf("%.2f\n", totalCost * quantity);
                  if (multipleItems > 25.00) {
                     totalCost = multipleItems - (multipleItems * 0.10);
                     System.out.print("10% discount applied, new total is $");
                     System.out.printf("%.2f", totalCost);
        }
                break;
            case 2:
                totalCost += 4.99;
                System.out.println("How many cups of tea would you like?");
                quantity = scnr.nextInt();
                multipleItems = quantity * totalCost;
                System.out.print("For " + quantity + " cups of tea, your total is $");
                System.out.printf("%.2f\n", totalCost * quantity);
                  if (multipleItems > 25.00) {
                     totalCost = multipleItems - (multipleItems * 0.10);
                     System.out.print("10% discount applied, new total is $");
                     System.out.printf("%.2f", totalCost);
        }
                break;
            case 3:
                totalCost += 7.99;
                System.out.println("How many Grilled Cheese Sandwichs would you like?");
                quantity = scnr.nextInt();
                System.out.println("Would you like to add ham for an extra 50 cents per sandwich?");
                System.out.println("Y or N?");
                String wantsHam = scnr.next();
                decision = wantsHam.charAt(0);
                    switch (decision) {
                      case 'Y':
                      case 'y':
                        System.out.print("Your total for " + quantity + " sandwich(s) with ham is $" );
                        System.out.printf("%.2f\n", (quantity * totalCost) + (ham * quantity));
                        double sandwichTotal = (quantity * totalCost) + (ham * quantity);
                          if ((sandwichTotal) > 25.00) {
                             totalCost = sandwichTotal - (sandwichTotal * 0.10);
                             System.out.print("10% discount applied, new total is $");
                             System.out.printf("%.2f", totalCost);
        }
                        break;
                    
                        case 'N': 
                        case 'n':
                        System.out.print("Your total for " + quantity + " sandwich(s) is ");
                        System.out.printf("%.2f\n", (totalCost * quantity) + (ham * quantity));
                        sandwichTotal = (quantity * totalCost) + (ham * quantity);
                          if (totalCost > 25.00) {
                            totalCost = sandwichTotal - (sandwichTotal * 0.10);
                            System.out.print("10% discount applied, new total is $");
                            System.out.printf("%.2f", totalCost);
        }
                        break; 

                        default:
                        System.out.println("Invalid. Try Again."); 
                        break; }
                    break;
            case 4: 
                totalCost += 2.99;
                System.out.println("How many banana nut muffins would you like?");
                quantity = scnr.nextInt();
                multipleItems = quantity * totalCost;
                System.out.print("For " + quantity + " banana nut muffin(s), your total is $");
                System.out.printf("%.2f\n", quantity * totalCost);
                  if (multipleItems > 25.00) {
                        totalCost = multipleItems - (multipleItems * 0.10);
                         System.out.print("10% discount applied, new total is $");
                         System.out.printf("%.2f", totalCost);
        }
                break;
            case 5:
                totalCost += 5.99;
                System.out.println("How many cups of orange juice would you like?");
                quantity = scnr.nextInt();
                multipleItems = quantity * totalCost;
                System.out.print("For " + quantity + " cup(s) of orange juice, your total is");
                System.out.printf("%.2f\n", quantity * totalCost);
                  if (multipleItems > 25.00) {
                   totalCost = multipleItems - (multipleItems * 0.10);
                   System.out.print("10% discount applied, new total is $");
                   System.out.printf("%.2f", totalCost);
        }
                break;
            default:
                System.out.println("Not a valid entry, try again."); 
            
        } scnr.close();

        
    }
    
}
