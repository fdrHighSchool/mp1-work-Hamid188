
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
    
    // Get A String Input From User
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter a random number: ");
    String RandNum = s.nextLine();
    
    System.out.print("Are you a teacher or a student?:");
    String status = s.nextLine();
    status = status.toUpperCase();


    if (status.equals("student")) {
        System.out.println("Hello" + " " + firstName + lastName.substring(0, 1) + RandNum + "@nycstudents.net");
    }
    if (status.equals("teacher")) {
        System.out.println("Hello" + " " + firstName.substring(0, 1) + lastName + RandNum + "@schools.nyc.gov");
    }
  } 
  
    
  public static String generatePassword(int length) {
    String password = "";

    for(int i = 0; i < length; i++) {
      // generate a random number
      // 65 - 90 capital letter
      // 97 - 122 lower case
      // 33 - 47 special symbols
      int capital = (char)(int)(Math.random()*(90-65+1) + 65);
      int lowercase = (char)(int)(Math.random()*(122-97+1) + 95);
      int specialsymbol = (char)(int)(Math.random()*(47-33+1) + 33);
      
      char C = (char)(capital);
      char L = (char)(lowercase);
      char S = (char)(specialsymbol);
      
      System.out.println("Your secret password is" + " " + capital + " " + C + lowercase + "" + L + specialsymbol + "" + S);
      

    } // End For Loop

    return password;
  } // End GeneratePassword Method
}










