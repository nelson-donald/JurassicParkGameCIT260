/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

/**
 *
 * @author Donald Nelson
 */
public class OperationCenterView extends View{
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }
}
