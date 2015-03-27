package Locations;


/**
 * Write a description of class Desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Desert extends Place implements Explorable
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Desert
     */
    public Desert()
    {
        // initialise instance variables
        super();
    }

    public Items explore()
    {
        // put your code here
        System.out.println("You explore the desert");
        Random rand = new Random();
        int advenGen = rand.nextInt(2);
        Items s = null;
        if (advenGen == 0)
        {
            s = new Hairball();
            System.out.println("You found a " + s.getItemName() + ".");
        }
        else
        {
            System.out.println("You find a scorpion in the desert. Run away!");
        }
        return s;
    }
}
