/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.BreakerControl;
import byui.cit260.jurassicpark.exceptions.BreakerControlException;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author cutler24
 */
public class PowerTestView extends View {
    
////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public PowerTestView() {
        super("Solve Ohms Law"
            + "\nUsing Ohms Law calculate the resistance for 20 amps and 110 volts");
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {
        BreakerControl bc = new BreakerControl();
        try{
        boolean result = bc.validateOhmsLaw(selection, 20f, 110f );
        if(result){console.println("The power is on");
            JurassicParkGameCIT260.getGame().setParkPower(true);
            return true;}
        else{console.println("That is incorrect");
        return false;}
        
        }catch(BreakerControlException ex)
        {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
        return false;
        }
        
            
    }

    
}

