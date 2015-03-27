
/**
 * Write a description of class Adventure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;

public class Adventure
{
    // instance variables - replace the example below with your own
    String place;
    /**
     * Constructor for objects of class Adventure
     */
    public Adventure(String s)
    {
        
        place = s;
        // initialise instance variables
    }

    /**

     */
    
    
    public Items selectAdventure()
    {
        Items newItem = null;
        if (place.equals("woods"))
        {
            Place newPlace = new Woods();
            newItem = newPlace.explore();
        }
        else if (place.equals("desert"))
        {
            Place newPlace = new Desert();
            newItem = newPlace.explore();
        }
        else
        {
            System.out.println("You can't go there yet, idiot");
        }
        return newItem;
    }
}
