
/**
 * Write a description of class Lanternflies here.
 *
 * @ Bryant Lin 
 * @ 09/29/2022
 */

import java.util.Scanner;
public class Bananas 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("This banana is nice and yellow.");
        System.out.println("This banana is very tasty and creamy.");
        
        System.out.print("How many bananas did you eat over the summer?");
        //int num = input.nextLine();
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("You can do better than that!");
        } // end if statement
        else {
            System.out.println("Thanks for helping me eat that many bananas!");
        } // end else statement
        
    } // end main method
} // end class