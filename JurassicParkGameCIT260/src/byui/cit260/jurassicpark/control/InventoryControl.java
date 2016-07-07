/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.model.Cloth;
import byui.cit260.jurassicpark.model.Fuel;
import byui.cit260.jurassicpark.model.Inventory;
import byui.cit260.jurassicpark.model.Item;
import byui.cit260.jurassicpark.model.Stick;
import byui.cit260.jurassicpark.model.Torch;
import java.util.List;

/**
 *
 * @author Donald Nelson
 */
public class InventoryControl {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public InventoryControl(){
        
    }

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
   
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    
    /**
     * this method will attempt to create a torch.
     * @return the text to display on the screen.
     */
    public String createTorch(Inventory i){
        String result = "";
        if(i.getCloth().getCount() >= 1 && i.getFuel().getCount() >= 2 && i.getStick().getCount() >= 1){
            //We have enough items to make the torch
            i.getTorch().add(new Torch());
            
            //Now remove the items from our inventory that we just used
            removeFuel(i, 2);
            removeStick(i, 1);
            removeCloth(i, 1);
            
            //Now return a message to the user that we succeeded
            result = ">A new torch has been created."
                    + "\n>You now have " + i.getTorch().size() + "torche(s)"
                    + "\n=================================================";
            return result;
        }
        else
        {
            result = ">You do not have enough supplies to make a torch."
            + "\n>You need 1 cloth, 1 stick and 2 fuel."
                    + "\n=================================================";
            return result;
        }
    }
    
    public String useTorch(Inventory i)
    {
        String result = "";
        if(i.getTorch().size() >= 1){
            //use torch. fix this later.
            result = ">Torch has been lit."
                    + "\n=================================================";
            return result;
        }
        else
        {
            result = ">You do not have any torches to use."
                    + "\n=================================================";
            return result;
        }
    }
    
    public boolean removeFuel(Inventory i, int count){
        Fuel f = i.getFuel();
        if(f.getCount() >= count){
            f.setCount(f.getCount()-count);
            return true;
        }
        else
        {
            return false;
        }
    }
            
    public boolean removeStick(Inventory i, int count){
        Stick s = i.getStick();
        if(s.getCount() >= count){
            s.setCount(s.getCount()-count);
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean removeCloth(Inventory i, int count){
        Cloth c = i.getCloth(); 
        if(c.getCount() >= count){
            c.setCount(c.getCount()-count);
            return true;
        }
        else
        {
            return false;
        }
    }
            
    /**
     * This function will add the stick item to the sticks in our inventory
     * @param i this is the Inventory class from our player
     * @param item this is the item class from the item we just found on the map
     * @return this will return a string to output to the user about what just happened
     */
    public String addFuel(Inventory i, Item item){
        Item fuel = i.getFuel();
        fuel.setCount(fuel.getCount() + item.getCount());
        return "You now have " + fuel.getCount() + " fuel in your inentory.";
    }
    
    
}
