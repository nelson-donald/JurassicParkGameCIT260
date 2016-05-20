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
public class GameMenuView extends View {
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    
    public GameMenuView() {
        super("\n"
            + "\nN - Move North"
            + "\nE - Move East"
            + "\nS - Move South"
            + "\nW - Move West"
            + "\nI - Show my inventory"
            + "\nQ - Exit the help menu");
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            
            case 'N':
                break;
            case 'S':
                break;
            case 'E':
                break;
            case 'W':
                break;
            case 'I':
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }

}