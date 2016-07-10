/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.GameControl;
import byui.cit260.jurassicpark.model.Player;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public class PrintMapView extends View {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public PrintMapView() {
        super("Where would you like to save the Map File?\n");
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    

    public boolean doAction(String selection) {

        //String fileName = selection.toUpperCase().toString();
        try {
            
        WriteMapView wmv = new WriteMapView();
        
        if(wmv.writeToFile(selection)){
            return true;
        }
        
            } catch(Exception e) {
                ErrorView.display(this.getClass().getName(), "Error writing to file. " + e.getMessage());
            }
        return false;
    }


    
    
    

            
}
