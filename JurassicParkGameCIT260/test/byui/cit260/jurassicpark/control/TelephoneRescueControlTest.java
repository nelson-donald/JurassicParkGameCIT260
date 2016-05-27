/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joeyhendrix
 */
public class TelephoneRescueControlTest {
    
    public TelephoneRescueControlTest() {
    }

    /**
     * Test of validateAreaOfSquare method, of class TelephoneRescueControl.
     */
    @Test
    public void testValidateAreaOfSquare() {
        System.out.println("validateAreaOfSquare");
        TelephoneRescueControl instance = new TelephoneRescueControl();
        
        
        
        
        
        
        //Test 1
        int width = -1;
        int height = 1;
        int expResult = -1;
        int result = instance.validateAreaOfSquare(width, height);
        assertEquals(expResult, result);
        
        
        //Test 2
         width = 1;
         height = -1;
         expResult = -1;
         result = instance.validateAreaOfSquare(width, height);
        assertEquals(expResult, result);
        
        
        //Test 3
         width = 0;
         height = 1;
         expResult = 0;
         result = instance.validateAreaOfSquare(width, height);
        assertEquals(expResult, result);
        
        
        //Test 4
         width = 1;
         height = 0;
         expResult = 0;
         result = instance.validateAreaOfSquare(width, height);
        assertEquals(expResult, result);
        
        
        //Test 5
         width = 10;
         height = 10;
         expResult = 100;
         result = instance.validateAreaOfSquare(width, height);
        assertEquals(expResult, result);
      
    }
    
}
