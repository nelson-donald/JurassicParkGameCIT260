/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import java.io.PrintWriter;
import jurassicparkgamecit260.JurassicParkGameCIT260;
/**
 *
 * @author Donald Nelson
 */
public class ErrorView extends View {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    private static final PrintWriter errorFile = JurassicParkGameCIT260.getOutFile();
    
    private static final PrintWriter logFile = JurassicParkGameCIT260.getLogFile();
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public ErrorView(){
        super("");
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    
    public static void display(String className, String errorMsg){
        errorFile.println("---------------------------" +
                "\nERROR: " + errorMsg +
                "\n---------------------------");
        
        logFile.println(className + " - " + errorMsg);
    }

    public boolean doAction(String selection) {

        return true;
    }
    
}
