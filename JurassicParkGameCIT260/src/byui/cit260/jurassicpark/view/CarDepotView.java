/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.InventoryControl;
import byui.cit260.jurassicpark.enums.ItemType;
import byui.cit260.jurassicpark.model.Item;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public class CarDepotView extends View {
    
    
    public CarDepotView()
    {
        super("=                   Inventory                   ="
        + "\n================================================="
            + "\n"
            + "\nP - Pick Up Gas"
            + "\nQ - Exit Car Depot");
        
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'P':
                pickUpGas();
                break;
            
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }
    
    private void pickUpGas(){
        
        InventoryControl invControl = new InventoryControl();
        Item i = new Item();
        i.initialize(ItemType.Fuel, 1);
        String s = invControl.addFuel(JurassicParkGameCIT260.getPlayer().getInventory(),i);
        console.println(s);
    }
    
    private void useTorch(){
        InventoryControl invControl = new InventoryControl();
        String s = invControl.useTorch(JurassicParkGameCIT260.getPlayer().getInventory());
        console.println(s);
    }
}
