/*¬
* Assignment: HW2 Branching Basics
* Name: Isacc Montana
* Date: 09/14/2025
*¬
* Program Description:
* [A brief description of what the program does. 
* This program takes two integers as input, depending on the input it will either add, subtract, multiply, or divide the 2 integers.
*¬
* Honor Code Statement:· · · ¬
* I affirm that this program is my own work and that I have not
* shared this code or provided unauthorized assistance with it.
*¬
* Purpose:· ¬
* Demonstrate understanding of if, if-else, and if-else-if branches as learned in part 1 of chapter 3
*¬
* Input:2 integers to be provided by the user

* Output: The sum, difference, product, quotient and remainder of the 2 integers.
* the output will give you accurate information depending on what the two integers are.
*¬
* [Any additional instructions, limitations, or assumptions.]· · · · · · ¬
*/


package ICT152Java.Lesson3;
import java.util.Scanner;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int videoGames;
        int books;

        videoGames = scnr.nextInt();
        books = scnr.nextInt();

        if (videoGames > books){
            System.out.println("The result of adding videoGames and books equals " + (videoGames + books)); 
        }
        if (videoGames < books){
            System.out.println("The result of subtracting videoGames from books equals " + (books - videoGames));
        }
        if (videoGames == books){
            System.out.println("The result of multiplying videoGames by books equals " + (videoGames * books));
        }
        if (books != 0) {
            System.out.println("The result of dividing videoGames and books equals " + (videoGames / books) + " with a remainder of " + (videoGames % books));
        }
        
        scnr.close();
        
    }
    
}
