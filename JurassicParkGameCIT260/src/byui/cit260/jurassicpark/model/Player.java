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
    private String[][] location;

    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Player() {
        inventory = new Inventory();
        
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

    public String[][] getLocation() {
        return location;
    }

    public void setLocation(String[][] location) {
        this.location = location;
    }

    
    ////////////////////////////////////////////////////////////////////////////
    //Overrides
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + this.direction;
        hash = 89 * hash + Objects.hashCode(this.inventory);
        hash = 89 * hash + Arrays.deepHashCode(this.location);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", direction=" + direction + ", inventory=" + inventory + ", location=" + location + '}';
    }

    
    
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.direction != other.direction) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Arrays.deepEquals(this.location, other.location)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
