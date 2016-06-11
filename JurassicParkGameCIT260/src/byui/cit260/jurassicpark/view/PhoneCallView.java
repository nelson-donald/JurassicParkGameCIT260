/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.TelephoneRescueControl;

/**
 *
 * @author joeyhendrix
 */
public class PhoneCallView extends View {
    
  ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
     public PhoneCallView() {
        
        
        super(          
           "What's the area of a square whose height is 15' and width is 20'?");
        
        
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

    TelephoneRescueControl trc = new TelephoneRescueControl();
    
    if (Integer.compare(Integer.parseInt(selection),trc.validateAreaOfSquare(20, 15)) == 0) {
     console.println("You win the game!");
        return true;
        
    } 
    console.println("Wrong Answer.");
        return false;
    }
    
    
}

