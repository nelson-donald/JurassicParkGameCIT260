/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.exceptions.TelephoneRescueControlException;

/**
 *
 * @author joeyhendrix
 */
public class TelephoneRescueControl {
////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
////////////////////////////////////////////////////////////////////////////
    //Constructor
    

    
    
////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
   
    
    
////////////////////////////////////////////////////////////////////////////
    //Functions    


/**
 * This function will calculate the area of a square 
 * @param width
 * @param height
 * @return 
 */
public int validateAreaOfSquare( int width, int height ) {

    if( width < 0 ) 
    { return -1; }

    if( height < 0 ) 
    { return -1; }



    
    int area = width * height;



return area;
}
 public boolean validateAreaOfSquare(String guess,int width, int height) throws 
            TelephoneRescueControlException {
            try{
            int expected = Integer.parseInt(guess);
            int actual = validateAreaOfSquare(width, height);
            if (Integer.compare(expected, actual) == 0){
            return true;
            }
            else
            {
                return false;
                
            }
            }catch(NumberFormatException ex) 
            {
            throw new TelephoneRescueControlException("A numerical value is required");
            }
    }   
        
        
        
        
        
        
}
