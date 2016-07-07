/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.InventoryControl;
import byui.cit260.jurassicpark.model.Inventory;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author Donald Nelson
 */
public class InventoryMenuView extends View {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    
    public InventoryMenuView()
    {
        super("");
        updateDisplayMessage();
    }
    
    private String updateDisplayMessage()
    {
    displayMessage =     "=                   Inventory                   ="
        + "\n================================================="
        + "\nWe have a compass. Lets try not to get lost."
        + "\nTotal Cloth:\t" + JurassicParkGameCIT260.getPlayer().getInventory().getCloth().getCount()
        + "\nTotal Fuel:\t" + JurassicParkGameCIT260.getPlayer().getInventory().getFuel().getCount()
        + "\nTotal Sticks:\t" + JurassicParkGameCIT260.getPlayer().getInventory().getStick().getCount()
        + "\nTotal Torches:\t" + JurassicParkGameCIT260.getPlayer().getInventory().getTorch().size()
        + "\n================================================="
            + "\n"
            + "\nC - Create Torch"
            + "\nU - Use Torch"
            + "\nQ - Exit Inventory";
    
    return displayMessage;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'C':
                createTorch();
                break;
            case 'U':
                useTorch();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }
    
    private void createTorch(){
        InventoryControl invControl = new InventoryControl();
        String s = invControl.createTorch(JurassicParkGameCIT260.getPlayer().getInventory());
        console.println(s);
        updateDisplayMessage();
    }
    
    private void useTorch(){
        InventoryControl invControl = new InventoryControl();
        String s = invControl.useTorch(JurassicParkGameCIT260.getPlayer().getInventory());
        console.println(s);
        updateDisplayMessage();
    }
}
