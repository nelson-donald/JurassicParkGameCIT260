/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import byui.cit260.jurassicpark.model.Drawable;
import java.io.Serializable;


/**
 *
 * @author Donald Nelson
 */
public class Item implements Serializable {
     
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    //This variable tells us the number of this item type we have.
    private int count;
    
    //This is the type of item
    private ItemType type;
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Item()
    {
    }
    
    /**
     * Initializes this item of the correct type and the count.
     * @param itemType the enum of the type of item we are creating
     * @param itemCount the count of how many of these items we have
     */
    public void initialize(ItemType itemType, int itemCount){
        
        //Instantiate our variables and set a value.
        count=itemCount;
        type=itemType;
    }

    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
    
    
}
