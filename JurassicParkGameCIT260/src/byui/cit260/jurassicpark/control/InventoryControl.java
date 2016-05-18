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
        if(i.getCloth().getCount() >= 1 && i.getFuel().getCount() >= 2 && i.getStick().getCount() >= 1){
            //We have enough items to make the torch
            i.getTorch().add(new Torch());
            
            //Now remove the items from our inventory that we just used
            removeFuel(i, 2);
            removeStick(i, 1);
            removeCloth(i, 1);
            
            //Now return a message to the user that we succeeded
            return "A new torch has been created. You now have " + i.getTorch().size() + "torche(s)";
        }
        else
        {
            return "You do not have enough supplies to make a torch. You need 1 cloth, 1 stick and 2 fuel.";
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
    public String addStick(Inventory i, Item item){
        Item stick = i.getStick();
        stick.setCount(stick.getCount() + item.getCount());
        return "You now have " + stick.getCount() + " stick(s) in your inentory.";
    }
}
