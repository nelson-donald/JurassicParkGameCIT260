/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.GameControl;
import byui.cit260.jurassicpark.control.MovementControl;
import byui.cit260.jurassicpark.exceptions.MovementControlException;
import byui.cit260.jurassicpark.model.Dinosaur;
import byui.cit260.jurassicpark.model.Inventory;
import byui.cit260.jurassicpark.model.Location;
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
            + "\nP - Print Map to File"
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
            case 'P':
                printMap();
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
        try{
            move.moveNorth();
        }
        catch(MovementControlException ex){
            
                ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        validateLocationAction();
        
    }
    private void moveSouth(){
        MovementControl move = new MovementControl();
        try{
            move.moveSouth();
        }
        catch(MovementControlException ex){
            
                ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        validateLocationAction();
        
        
    }
    private void moveEast(){
        MovementControl move = new MovementControl();
        try{
            move.moveEast();
        }
        catch(MovementControlException ex){
            
                ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        
        validateLocationAction();
    }
    private void moveWest(){
        
        MovementControl move = new MovementControl();
        try{
            move.moveWest();
        }
        catch(MovementControlException ex){
            
                ErrorView.display(this.getClass().getName(), ex.getMessage());
        }
        validateLocationAction();
    }
    private void showInventory(){
        InventoryMenuView invMenuView = new InventoryMenuView();
        invMenuView.display();
        
    }
    private void showMap(){
        console.println(JurassicParkGameCIT260.getGame().getMap().getMapString());
    }
    
    private void validateLocationAction()
    {
        Location l = JurassicParkGameCIT260.getGame().getMap().getLocation(JurassicParkGameCIT260.getGame().getPlayer().getLocation().getRow(), JurassicParkGameCIT260.getGame().getPlayer().getLocation().getCol());
        
        //First check to see if we are on a special location which will have no dinosaurs
        switch (l.getType()){
            case CarDepot:console.println("You are in the car depot");
                CarDepotView cdv = new CarDepotView();
                cdv.display();
                return;
            case ControlCenter:
                console.println("You are in the operation center");
                OperationCenterView ocv = new OperationCenterView();
                ocv.display();
                return;
            case PowerStation:
                console.println("You are in the Power Station");
                PowerPlantView ppv = new PowerPlantView();
                ppv.display();
                return;
        }
        
        //next make sure to check if we were attacked by a dinosaur
        Dinosaur d = l.getDinosaur();
        if( d != null)
        {
            console.println("you were atacked by a dinosaur");
        }
    }

    private void printMap() {
        PrintMapView pmv = new PrintMapView();
        pmv.display();
    }
    
}
