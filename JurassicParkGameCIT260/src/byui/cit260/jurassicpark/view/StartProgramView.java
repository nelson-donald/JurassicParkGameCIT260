/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.GameControl;
import byui.cit260.jurassicpark.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public class StartProgramView {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    protected final PrintWriter console = JurassicParkGameCIT260.getOutFile();
    protected final BufferedReader keyboard = JurassicParkGameCIT260.getInFile();

    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public StartProgramView() {
        
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Function

    public void displayStartProgramView() {
        
        displayBanner();
        
        String playerName = getPlayerName();
        
        Player player = GameControl.createPlayer(playerName);
        
        JurassicParkGameCIT260.setPlayer(player);
        
        displayWelcomeMessage(player.getName());
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    public String getPlayerName() {
        
        boolean isValidName = false;
        String name = "";
        
        console.println("Please enter your name: ");
        
        while(!isValidName) {
            String input = "";
            try {
                input = keyboard.readLine();
            } catch(Exception e) {
                ErrorView.display(this.getClass().getName(), "Error reading input");
            }
            
            if(input == null || input.length() >= 2) {
                isValidName = true;
                name = input;
            } else {
                console.println("Input is invalid - name must be at least 2 characters");
            }
        }
        
        return name;
    }
    
    public void displayBanner() {
        String welcome = "";
        welcome = "=================================================" +
                "\nWelcome to Jurassic Park" +
                "\n" +
                "\nSomeone has sabotoged the park and we need your" +
                "\nhelp to get it back online and get escape." +
                "\n=================================================";
                
        
        console.println(welcome);
    }
    
    public void displayWelcomeMessage(String playerName) {
        console.println("==============================");
        console.println("Welcome " + playerName + ".");
        console.println("Enjoy the game!");
        console.println("==============================");
        
    }
    
}
