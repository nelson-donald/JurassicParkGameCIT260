/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.model.Dinosaur;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author igadg
 */
public class MovementControlTest {
    
    public MovementControlTest() {
    }

    /**
     * Test of dinoEncounter method, of class MovementControl.
     */
    @Test
    public void testDinoEncounter() {
        System.out.println("dinoEncounter");
        Dinosaur d = new Dinosaur();
        MovementControl instance = new MovementControl();
        
        //**********************************************************************
        //TEST 1
        //These are the input values.
        int tourists = 2;
        d.setPowerLevel(1);
        
        //This is the output value
        int expResult = 1;
        
        int result = instance.dinoEncounter(tourists, d);
        assertEquals(expResult, result);
        
        //**********************************************************************
        //TEST 2
        //These are the input values.
        tourists = 8;
        d.setPowerLevel(2);
        
        //This is the output value
        expResult = 6;
        
        result = instance.dinoEncounter(tourists, d);
        assertEquals(expResult, result);
        
        
        //**********************************************************************
        //TEST 3
        //These are the input values.
        tourists = 1;
        d.setPowerLevel(3);
        
        //This is the output value
        expResult = -10;
        
        result = instance.dinoEncounter(tourists, d);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
