/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import byui.cit260.jurassicpark.enums.LocationType;
import java.io.Serializable;

/**
 *
 * @author igadg
 */
public class Location implements Serializable {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    private int row;
    private int col;
    private String description;
    private Item item;
    private Dinosaur dinosaur;
    private LocationType type;
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Location() {
        //Default each location as generic
        type = LocationType.Generic;
    }
    

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public void setDinosaur(Dinosaur dinosaur) {
        this.dinosaur = dinosaur;
    }

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }
    
    
    
    
}