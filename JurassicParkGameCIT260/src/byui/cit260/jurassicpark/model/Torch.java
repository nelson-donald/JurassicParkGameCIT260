/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

/**
 *
 * @author joeyhendrix, Donald Nelson
 */
public class Torch extends Item {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    //This tells us how long the torch will last. how many moves before it
    //extinguishses itself.
    private int timeToLive;
    
    //This tells us that this particular torch is lit.
    private boolean enabled;
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Torch(){
        //This will initialize the item as drawable
        initializeAsDrawable(1, 11);
        
        //This will reset the texture with a border
        resetTexture();
        
        //Setup the item information
        initialize(ItemType.Torch, 1);
        
        timeToLive = 15; 
         
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter

    public int getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(int timeToLive) {
        this.timeToLive = timeToLive;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
}
