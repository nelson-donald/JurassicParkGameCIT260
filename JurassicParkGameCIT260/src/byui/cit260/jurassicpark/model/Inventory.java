/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.jurassicpark.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Kirstin Cutler, Donald Nelson
 */
public class Inventory implements Serializable {
    
    
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
    
    //Tells us whether we have a torch in use
    private boolean activeTorch;
    
    private int tourists;
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Inventory(){
        compass = new Compass();
        cloth=new Cloth();
        fuel = new Fuel();
        stick = new Stick();
        torch = new ArrayList<Torch>();
        activeTorch = false;
        tourists = 10;
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

    public void setActiveTorch(boolean activeTorch) {
        this.activeTorch = activeTorch;
    }

    
    public boolean isActiveTorch() {
        return activeTorch;
    }
    
    public int getTourists(){
        return tourists;
    }
    
    public void setTourists(int val){
       this.tourists = val;
    }
    ////////////////////////////////////////////////////////////////////////////
    //Functions

    
}
