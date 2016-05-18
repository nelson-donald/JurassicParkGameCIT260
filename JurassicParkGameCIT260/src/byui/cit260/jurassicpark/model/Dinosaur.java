/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

/**
 *
 * @author Daniel
 */
public class Dinosaur {
    
    private int hitPoints;
    
    //TODO maybe make this an enum - maybe
    private String breed;
    
    private boolean carnivore;
    
    
    public Dinosaur() {
        
    }
    
    public boolean isHerbivore() {
        return !carnivore;
    }
    
    public boolean isCarnivore() {
        return carnivore;
    }
}
