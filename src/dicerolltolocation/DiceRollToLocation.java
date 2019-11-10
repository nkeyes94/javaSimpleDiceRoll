/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dicerolltolocation;
import java.util.*;

/**
 *
 * @author Nate
 */
public class DiceRollToLocation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        int i;
        int die1;
        int die2;
        int startingLocation;
        int newLocation;
        int oldLocation;
        int firstRoll;
        int totalRoll;
        
        Scanner input = new Scanner(System.in);
        
        String[] player = {"Nate", "Bob", "John", "Larry"};
        
        startingLocation = 0;
        
        oldLocation = firstRoll(startingLocation, player);
        
        
    }
    
    public static int firstRoll(int startingLocation, String[] player)
    {
        int die1;
        int die2;
        int totalRoll;
        int location;
        Random diceRoll = new Random();
        Scanner input = new  Scanner(System.in);
        
        int i;
        for(i = 0; i < 4; i++)
        {
            System.out.println(player[i] +"'s First Turn!");
            System.out.println("Please hit enter to roll");
            input.nextLine();
            die1 = diceRoll.nextInt(6)+1;
            System.out.println("First Dice Roll = "+ die1);
            die2 = diceRoll.nextInt(6)+1;
            System.out.println("Second Dice Roll = "+ die2);
            totalRoll = die1 + die2;
            System.out.println("Sum of both dice = "+ totalRoll);
            location = startingLocation + totalRoll;
            return location;
        }
    }
    
}
