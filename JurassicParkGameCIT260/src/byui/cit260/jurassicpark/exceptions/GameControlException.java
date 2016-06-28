/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.exceptions;

/**
 *
 * @author igadg
 */
public class GameControlException extends Exception {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
   
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    
    public GameControlException() {
    }

    public GameControlException(String message) {
        super(message);
    }

    public GameControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
}
