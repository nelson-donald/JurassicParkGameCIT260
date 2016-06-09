/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.GameControl;
import byui.cit260.jurassicpark.control.MovementControl;
import byui.cit260.jurassicpark.model.Inventory;
import byui.cit260.jurassicpark.model.Player;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author Donald Nelson
 */
public class GameMenuView extends View {
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    private MovementControl movementControl = new MovementControl();
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    
    public GameMenuView() {
        
        
        super(          
           "\n================================================="
            + "\n=                   Game Menu                   ="
          + "\n================================================="
            + "\nN - Move North"
            + "\nE - Move East"
            + "\nS - Move South"
            + "\nW - Move West"
            + "\nI - Inventory"
            + "\nM - Show Map"
            + "\nD - Describe this location"
            + "\nQ - Exit the help menu");
        
        
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            
            case 'N':
                moveNorth();
                break;
            case 'S':
                moveSouth();
                break;
            case 'E':
                moveEast();
                break;
            case 'W':
                moveWest();
                break;
            case 'I':
                showInventory();
                break;
            case 'M':
                showMap();
                break;
            case 'D':
                showDescription();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }
showDescription();
        return false;
    }
    private void showDescription()
    {
        console.println(JurassicParkGameCIT260.getGame().getMap().getLocation(JurassicParkGameCIT260.getPlayer().getLocation().getRow(),JurassicParkGameCIT260.getPlayer().getLocation().getCol()).getDescription());
    }
    private void moveNorth(){
        MovementControl move = new MovementControl();
        console.println(move.moveNorth());
        
    }
    private void moveSouth(){
        MovementControl move = new MovementControl();
        console.println(move.moveSouth());
        
    }
    private void moveEast(){
        MovementControl move = new MovementControl();
        console.println(move.moveEast());
    }
    private void moveWest(){
        
        MovementControl move = new MovementControl();
        console.println(move.moveWest());
    }
    private void showInventory(){
        InventoryMenuView invMenuView = new InventoryMenuView();
        invMenuView.display();
        
    }
    private void showMap(){
        
    }
    
}
