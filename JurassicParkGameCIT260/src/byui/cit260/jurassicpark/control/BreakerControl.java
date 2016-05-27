/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

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
    public float validateOhmsLaw(float amps, float volts){
if(amps <= 0) { return -1; }
if(volts < 0) { return -1; }

float resistance = volts / amps;
return resistance;
}

    
}
