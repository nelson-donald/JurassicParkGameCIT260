/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.Serializable;

/**
 *
 * @author Donald Nelson
 */
public class Game implements Serializable
{
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    //This tells us how long the torch will last. how many moves before it
    //extinguishses itself.
    private Player player;
    
    private Map map;

    private boolean parkPower;
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Game(){
    
    parkPower = false;    
         
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public boolean isParkPower() {
        return parkPower;
    }

    public void setParkPower(boolean parkPower) {
        this.parkPower = parkPower;
    }

    
    
}
