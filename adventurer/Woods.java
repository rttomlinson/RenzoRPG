
/**
 * Write a description of class Woods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Woods extends Place implements Explorable   
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Woods
     */
    public Woods()
    {
        // initialise instance variables
        x = 0;
    }

    public Items explore()
    {
        // put your code here
        System.out.println("You explore the woods");
        Random rand = new Random();
        Items s = null;
        int advenGen = rand.nextInt(2);
        if (advenGen == 0)
        {
            s = new Hairball();
            System.out.println("You found a " + s.getItemName() + ".");
        }
        else
        {
            System.out.println("You find a goblin in the woods. Run away!");
        }
        return s;
        
    }
}
