/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

/**
 *
 * @author igadg
 */
public class Dinosaur extends Item {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    //This tells us how long the torch will last. how many moves before it
    //extinguishses itself.
    private int powerLevel;
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Dinosaur(){
        
         
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    
    
}
