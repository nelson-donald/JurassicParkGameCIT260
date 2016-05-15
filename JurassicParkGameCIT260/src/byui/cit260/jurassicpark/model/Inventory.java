/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.jurassicpark.model;

import java.util.List;


/**
 *
 * @author cutler24, Donald Nelson
 */
public class Inventory {
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    //This will store the compass
    private Compass compass;
    
    //This will store the cloth
    private Cloth cloth;
    
    //this will store the fuel
    private Fuel fuel;
    
    //this will store the sticks
    private Stick stick;
    
    //this will store the torches
    private List<Torch> torch;
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Inventory(){
        
    }

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
    public Compass getCompass() {
        return compass;
    }

    public void setCompass(Compass compass) {
        this.compass = compass;
    }

    public Cloth getCloth() {
        return cloth;
    }

    public void setCloth(Cloth cloth) {
        this.cloth = cloth;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Stick getStick() {
        return stick;
    }

    public void setStick(Stick stick) {
        this.stick = stick;
    }

    public List<Torch> getTorch() {
        return torch;
    }

    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    
    /**
     * this method will attempt to create a torch.
     * @return the text to display on the screen.
     */
    public String createTorch(){
        if(cloth.getCount() >= 1 && fuel.getCount() >= 2 && stick.getCount() >= 1){
            torch.add(new Torch());
            return "A new torch has been created. You now have " + torch.size() + "torche(s)";
        }
        else
        {
            return "You do not have enough supplies to make a torch. You need 1 cloth, 1 stick and 2 fuel.";
        }
    }
}
