/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.exceptions.MovementControlException;
import byui.cit260.jurassicpark.model.Dinosaur;
import byui.cit260.jurassicpark.model.Location;
import byui.cit260.jurassicpark.model.Map;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public class MovementControl {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public MovementControl(){
        
    }

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
   
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    
    /**
     * This method will take the number of tourists in our inventory and
     * subtract it by the number power level or number of tourists this
     * dinosaur kills (This is what we designed in the test matrix but I feel
     * like it should use the actual Inventory object and work directly with
     * the byref object instead)
     * @param tourists
     * @param d
     * @return 
     */
    public int dinoEncounter(int tourists, Dinosaur d)
    {
        if(tourists < d.getPowerLevel()) {
            return -10;
        }
        if(d.getPowerLevel() < 0) {
            return -1;
        }
        
        //Declare a new function instance variable called result
        int result;
        
        /*
        Set the result = the number of tourists in the inventory - the dino
        strentgh or number of tourists that get killed
        */
        result = tourists - d.getPowerLevel();
        
        //return the result which is the number of tourists left in the inventory
        return result;
    }
    
    public void moveEast() throws MovementControlException
    {
        
        Location l = JurassicParkGameCIT260.getPlayer().getLocation();
        if(l.getCol() >= Map.NUM_COLS - 1)
        {
            throw new MovementControlException( "You cannot move East.");
        }
        
            l.setCol(l.getCol() + 1);
            JurassicParkGameCIT260.getPlayer().setLocation(l);
           
    }
    
    public void moveWest() throws MovementControlException
    {
        Location l = JurassicParkGameCIT260.getPlayer().getLocation();
        if(l.getCol() == 0)
        {
            throw new MovementControlException( "You cannot move West.");
        }
        
            l.setCol(l.getCol() - 1);
            JurassicParkGameCIT260.getPlayer().setLocation(l);
            
    }
    public void moveSouth() throws MovementControlException
    {
        Location l = JurassicParkGameCIT260.getPlayer().getLocation();
        if(l.getRow() >= Map.NUM_ROWS - 1)
        {
            throw new MovementControlException( "You cannot move South.");
        }
        
            l.setRow(l.getRow() + 1);
            JurassicParkGameCIT260.getPlayer().setLocation(l);
            
    }
    
    public void moveNorth() throws MovementControlException
    {
        Location l = JurassicParkGameCIT260.getPlayer().getLocation();
        if(l.getRow() == 0)
        {
            throw new MovementControlException( "You cannot move North.");
        }
        
            l.setRow(l.getRow() - 1);
            JurassicParkGameCIT260.getPlayer().setLocation(l);
            
    }
}
