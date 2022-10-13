
/**
 * Write a description of class Lanternfly here.
 *
 * @author (Hamid)
 * @version (9/30/2022)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 5) {
            System.out.println("You can do better than that!");
        } // end if statement
        else {
            System.out.println("New personal record,good job!");
        } // end else statement
        
    } // end main method

} // end class

