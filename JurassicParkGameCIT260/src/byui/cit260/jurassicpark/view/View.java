/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public abstract class View implements ViewInterface {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    protected String displayMessage;
    protected final PrintWriter console = JurassicParkGameCIT260.getOutFile();
    protected final BufferedReader keyboard = JurassicParkGameCIT260.getInFile();
    private String newPage = "\n\n\n\n\n=================================================";
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public View(){
        
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions

    @Override
    public void display(){
        boolean done = false;
        do{
            String value = this.getInput();
            if(value.toUpperCase().equals("Q")){
                return;
            }
            
            console.println(this.newPage);
            done = this.doAction(value);
        } while (!done);
    }
    
    @Override
    public String getInput(){
        String input = " ";
        boolean validInput = false;
        
        while(!validInput){
            console.println("\n" + this.displayMessage);
            try {
                input = keyboard.readLine();
            } catch(Exception e){
                throw new RuntimeException("Error reading input");
            }
            input = input.trim();
            input = input.toUpperCase();
            
            if(input.length() < 1){
                console.println("\nInvalid value: You muse enter a character.");
            }
            break;
        }
        return input;
    }
}
