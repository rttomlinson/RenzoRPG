
/**
 * Write a description of class AdventureTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class AdventureTime
{
    // instance variables - replace the example below with your own
    
    private final String EXIT_STRING = "exit game";
    /**
     * Constructor for objects of class AdventureTime
     */
    public static void main(String args[])
    {
        // initialise instance variables
        Scanner in = new Scanner(System.in);
        Adventurer bob = new Adventurer();
        System.out.println("Welcome Adventurer!");
        System.out.println("Where would you like to go? (You can choose the 'desert' or the 'woods'.)");
        String nextAction = in.nextLine();
        while (!nextAction.equals("exit game"))
        {
            
            bob.goAdventure(nextAction);
            //bob.lookAtItems();
            nextAction = in.nextLine();
        }
    }

    
}
