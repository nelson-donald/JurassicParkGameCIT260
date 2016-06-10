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
public class OperationCenterView extends View{
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
     public OperationCenterView() {
        
        
        super(          
           "\n=================================================="
            + "\n=              Operation Center               ="
          + "\n================================================="
            + "\nP - Make a phone call"       
            + "\nQ - Exit the operation center");
        
        
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'P':
                makePhoneCall();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }
    private void makePhoneCall() {
        if (JurassicParkGameCIT260.getGame().isParkPower() == true) {
        PhoneCallView pcv = new PhoneCallView();  
        pcv.display();
        
        } else {
        
            
            
        }
    }
    
}
