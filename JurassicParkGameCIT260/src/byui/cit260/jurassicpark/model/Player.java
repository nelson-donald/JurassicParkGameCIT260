/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kirstin Cutler, Donald Nelson
 */
public class Player implements Serializable{
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    //The name of the player
    private String name;
    
    //The direction the player is facing
    private int direction;
    
    //The inventory
    private Inventory inventory;
    
    //The Location on the map where the player is currently
    private Location location;
    
    private int[][] dungeonLocation = new int[1][2];
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Player() {
        inventory = new Inventory();
        direction=2;
        dungeonLocation[0][0] = 5;
        dungeonLocation[0][1] = 7;
    }
    

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    
    public int[][] getDungeonLocation() {
        return dungeonLocation;
    }

    public void setDungeonLocation(int x, int y, int location) {
        this.dungeonLocation[x][y] = location;
    }

    

    
    ////////////////////////////////////////////////////////////////////////////
    //Overrides

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}