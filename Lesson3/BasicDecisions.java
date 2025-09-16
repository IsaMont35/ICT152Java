/*¬
* Assignment: Lesson 3 Basic Decisions
* Name: Isacc Montana
* Date: 09/15/2025
*¬
* Program Description:This program accepts a user inputed character and will display bank information
*¬
* Honor Code Statement:
* I affirm that this program is my own work and that I have not shared this code or provided unauthorized assistance with it.
*¬
* Purpose:· The purpose of this program is to demonstrate understanding of basic java decision commands
*¬
* Input:· one of 4 characters entered by the user
*¬
* Output:· the output of this program will be a users bank account current balance, or balance after a deposit or withdrawal
*¬
* NA
*/

package ICT152Java.Lesson3;
import java.util.Scanner;

public class BasicDecisions {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double balance = 4452.62;
        char x;
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdrawal");
        System.out.println("D. Exit");
        x = scnr.next().charAt(0);

    switch(x) {
        case 'A' :
            System.out.println("Total Balance: " + balance);
            break;

        case 'a' :
            System.out.println("Total Balance: " + balance);
            break;

        case 'B' :
            double deposit;
            System.out.print("Deposit amount: ");
            deposit = scnr.nextDouble();
            balance = balance + deposit;
            System.out.println("New balance: " + balance);
            break;

        case 'b' :
            System.out.print("Deposit amount: ");
            deposit = scnr.nextDouble();
            balance = balance + deposit;
            System.out.println("New balance: " + balance);
            break;

        case 'C' : 
            double withdrawal;
            System.out.println("Withdrawal amount: ");
            withdrawal = scnr.nextDouble();
            if (withdrawal > balance - 5) {
                System.out.println("Error: insufficient funds");
             }
             else if (withdrawal < balance - 5){
                balance = balance - withdrawal;
                System.out.println("Remaining balance: ");
                System.out.printf("%.2f", balance);

             }
             break;

        case 'c' : 
            System.out.println("Withdrawal amount: ");
            withdrawal = scnr.nextDouble();
            if (withdrawal > balance - 5) {
                System.out.println("Error: insufficient funds");
             }
             else if (withdrawal <= balance - 5){
                balance = balance - withdrawal;
                System.out.print("Remaining balance: ");
                System.out.printf("%.2f", balance);
             }
             break;

        case 'D' :
             System.out.println("Thank you! We hope to see you again soon!");
             break;

        case 'd' : 
             System.out.println("Thank you! We hope to see you again soon!");
             break;

        default: 
             System.out.println("Invalid Entry!");

        scnr.close();

        }




    }
}
