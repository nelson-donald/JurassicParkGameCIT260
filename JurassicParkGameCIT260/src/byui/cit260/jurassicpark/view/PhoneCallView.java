/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.TelephoneRescueControl;
import byui.cit260.jurassicpark.exceptions.TelephoneRescueControlException;

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
    try{
        boolean result = trc.validateAreaOfSquare(selection, 20, 15);
        if(result){
            console.println("You win the game!");
            System.exit(0);
        return true;
        }
        else{console.println("That is incorrect");
        return false;}
        
        }catch(TelephoneRescueControlException ex)
        {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
        return false;
        }
    
    
   
    }
    
    
}

