
/**
 * Write a description of class Adventurer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Adventurer
{
    // instance variables - replace the example below with your own
    Scanner in = new Scanner(System.in);
    private int stamina;
    private ArrayList<Items> backpack;
    /**
     * Constructor for objects of class Adventurer
     */
    public Adventurer()
    {
        stamina = 6;
        backpack = new ArrayList<Items>();
        //System.out.println("Welcome Adventurer!");
        //System.out.println("You have enough energy to go on " + stamina + " adventures today.");
        
        // initialise instance variables
    }

    /**
     * 
     * 
     *  
     */
    public void goAdventure(String s)
    {
        // put your code here
        //int i = 0;
        //while (i < stamina)
        //{
            
            //System.out.println("Where would you like to go? (You can choose the 'desert' or the 'woods'.)");
            //String place = in.nextLine();
            String place = s;
            Adventure newAdven = new Adventure(place);
            Items newItem = newAdven.selectAdventure();
            if (newItem != null)
            {
                if (backpack.size() == 10) //Very bad code. Needs to check size versus max size. Capture exception of greater than max size.
                {
                    System.out.println("Your backpack is full. Drop or sell items.");
                }
                else
                {
                    backpack.add(newItem);
                }
            }
        //    i++;
        //    System.out.println("You can go on " + (stamina - i) + " more adventures.");
        //}

    }
    
    public void lookAtItems()
    {
        if (backpack.size() == 0)
        {
            System.out.println("Your bag is empty.");
        }
        else
        {
            System.out.print("You look in your bag and find "); 
            String allItems = "[";
            allItems = allItems + backpack.get(0).getItemName();
            for (int i = 1; i < backpack.size(); i++)
            {
                allItems = allItems + ", " + backpack.get(i).getItemName();
            }
            System.out.println(allItems + "].");
        }
    }
    
    public int getStamina()
    {
        return stamina;
    }

            
}
