/*
* Assignment: Project0
* Name: Isacc Montana
* Date: 9/8/2025
*
* Program Description:
* this program takes 4 inputs being your Age, Weight, Heart Rate, and the minutes the heart rate was measured and calculates the
  amount of calories that were burned
*
* Honor Code Statement:
* I affirm that this program is my own work and that I have not
* shared this code or provided unauthorized assistance with it.
*
* Purpose:
* This assingment was designed to get a grasp on what knowledge we, the students, have grasped so far in the course and allows us 
  to demonstrate
*
* Input:
* 4 inputs which are double variables and will be input into an equation
*
* Output:
* the output of the program is the amount of calories an individul burns
*
* [Any additional instructions, limitations, or assumptions.]
*/


package ICT152Java.Project0;
import java.util.Scanner;

public class project0 {
    public static void main(String[] args) {
        
    
Scanner scnr = new Scanner(System.in);

    double years;
    double pounds;
    double beatsperMinute;
    int minutes;
    double calories;

    years = scnr.nextDouble();
    pounds = scnr.nextDouble();
    beatsperMinute = scnr.nextDouble();
    minutes = scnr.nextInt();

    years = years * 0.2757;
    pounds = pounds * 0.03295;
    beatsperMinute = (double)beatsperMinute * 1.0781;

    calories = ((years + pounds + beatsperMinute - 75.4991) * (double)minutes / 8.368);

    scnr.close();
    
    System.out.print("Calories: ");
    System.out.printf("%.2f\n", calories);
    


    
    
}
}
