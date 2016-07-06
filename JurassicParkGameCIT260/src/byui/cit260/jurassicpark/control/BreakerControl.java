/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.exceptions.BreakerControlException;
import byui.cit260.jurassicpark.view.ErrorView;

/**
 *
 * @author Kirstin Cutler
 */
public class BreakerControl {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public BreakerControl(){
        
    }

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
   
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    
    /**
     * This function calculates Ohms Law 
     * @param amps
     * @param volts
     * @return 
     */
    public float calculateOhmsLaw(float amps, float volts){
if(amps <= 0) { return -1; }
if(volts < 0) { return -1; }

float resistance = volts / amps;
return resistance;
}

    public boolean validateOhmsLaw(String guess,float amps, float volts) throws 
            BreakerControlException {
            try{
            float expected = Float.parseFloat(guess);
            float actual = calculateOhmsLaw(amps, volts);
            if (Float.compare(expected, actual) == 0){
            return true;
        }
            else
            {
                return false;
                
            }
            }catch(NumberFormatException ex) 
            {
                ErrorView.display(this.getClass().getName(),"Error validating Ohms Law: " + ex.getMessage());
               
                throw new BreakerControlException("A numerical value is required");
            }
    }    
}
