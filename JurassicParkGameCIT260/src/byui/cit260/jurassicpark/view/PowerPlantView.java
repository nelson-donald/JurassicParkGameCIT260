/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author Donald Nelson
 */
public class PowerPlantView extends View {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public PowerPlantView() {
        super("Power Plant"
            + "\nP - Turn the power on"
            + "\nQ - Exit the power plant");
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'P':
                powerOn();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }

    private void powerOn() {
        if (JurassicParkGameCIT260.getGame().isParkPower()) {
            console.println("Power is on");
        } else {
          PowerTestView ptv = new PowerTestView();
          ptv.display();
        }
    }
}
