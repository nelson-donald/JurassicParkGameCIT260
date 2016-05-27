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
 * @author cutler24
 */
public class BreakerControlTest {
    
    public BreakerControlTest() {
    }

    /**
     * Test of validateOhmsLaw method, of class BreakerControl.
     */
    @Test
    public void testValidateOhmsLaw() {
        System.out.println("validateOhmsLaw");
        BreakerControl instance = new BreakerControl();
        
        //Test 1
        float amps = -1.0F;
        float volts = 1.0F;       
        float expResult = -1.0F;
        float result = instance.validateOhmsLaw(amps, volts);
        assertEquals(expResult, result, 0.1);
        
        
        
        //Test 2
        amps = 1.0F;
        volts = -1.0F;       
        expResult = -1.0F;
        result = instance.validateOhmsLaw(amps, volts);
        assertEquals(expResult, result, 0.1);
        
        
        //Test 3
        amps = 20.0F;
        volts = 15.0F;       
        expResult = .75F;
        result = instance.validateOhmsLaw(amps, volts);
        assertEquals(expResult, result, 0.1);
        
        
        //Test 4
        amps = 20.0F;
        volts = 110.0F;       
        expResult = 5.5F;
        result = instance.validateOhmsLaw(amps, volts);
        assertEquals(expResult, result, 0.1);
        
        
        //Test 5
        amps = 110.0F;
        volts = 20.0F;       
        expResult = .18181818F;
        result = instance.validateOhmsLaw(amps, volts);
        assertEquals(expResult, result, 0.001);
        
        
        
        
    }
    
}
