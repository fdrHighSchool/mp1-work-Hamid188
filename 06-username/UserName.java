
/**
 * Write a description of class username here.
 *
 * @author (Hamid Ali)
 * @version (10/12/2022)
 */
import java.util.Scanner;
import java.util.Random;

public class UserName {
  public static void main(String[] args) {
    // create a Scanner object
    Scanner s = new Scanner(System.in);
    Random rand = new Random();
    
    int rand_int1 = rand.nextInt(10);
    int rand_int2 = rand.nextInt(10);
    int rand_int3 = rand.nextInt(10);
    int rand_int4 = rand.nextInt(10);
    
    // Get A String Input From User
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter a random number: ");
    String favNum = s.nextLine();
    
    // Get A String Input From User
    System.out.print("Are you a teacher or a student?");
    String status = s.nextLine();
    status = status.toUpperCase();


    if (status .equals("student")) {
        System.out.println(firstName + lastName.substring(0, 1) + favNum + "@nycstudents.net");
    }
    if (status .equals("teacher")) {
        System.out.println(firstName.substring(0, 1) + lastName + favNum + "@schools.nyc.gov");
    }
} 




