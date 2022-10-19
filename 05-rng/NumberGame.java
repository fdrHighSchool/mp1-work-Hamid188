
/**
 * Write a description of class NumberGame here.
 *
 * @author (Hamid)
 * @version (9/5/2022)
 */
import java.util.Scanner;

public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("What mode do you want?\nEasy\nMedium\nHard");
        String mode = s.nextLine();
        //System.out.println(mode);
        
        int maximum;
        if(mode.equals("Easy")) {
            System.out.println((int)(Math.random()*10+1));
        }
        else if(mode.equals("Medium")) {
            System.out.println((int)(Math.random()*50+1));
        }
        else {
            System.out.println((int)(Math.random()*100+1));
        }
        
        
        
        int mysteryNumber = 5; // place-holder for now
        
        System.out.println(mysteryNumber);
        
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt(); 
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class