/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.MazeControl;
import byui.cit260.jurassicpark.model.DungeonMap;
import byui.cit260.jurassicpark.model.Player;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public class DungeonView extends View {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    MazeControl mazeControl = new MazeControl();
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public DungeonView() {
        super("");
        this.displayMessage = mazeControl.process();
        
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'W':
                if(mazeControl.moveForward())
                {
                    console.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nYou have made it to the end of the maze.");
                    console.println("Now solve the problem.\n\n");
                    
                    PowerTestView ptv = new PowerTestView();
                    ptv.display();
                    return true;
                }
                break;
            case 'A':
                mazeControl.turnLeft();
                break;
            case 'D':
                mazeControl.turnRight();
                break;
                      
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

            
        
        this.displayMessage = mazeControl.process();
            
        return false;
    }

    
    
}
