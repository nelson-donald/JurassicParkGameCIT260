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
                "\nWELCOME TO JURASSIC PARK" +
                "\n" +
                "\nSomeone has sabotoged the park and we need your" +
                "\nhelp to get it back online and escape!" +
                "\n"+
                "\nFor almost a year now, people from all over the" +
                "\nworld have visited our park to see these spectacular" +
                "\ncreatures who have been extinct for millions of years." +
                "\n" +
                "\nEverything has run smoothly . . . until today." +
                "\n" +
                "\nYou are a newly hired tour guide, on your first day," +
                "\nwho experiences one of the most horrific things" +
                "\nmankind has ever seen before." +
                "\n" +
                "\nThere has been a massive power outage on the island" +
                "\nand thousands of people, including you, are in panic." +
                "\n" +
                "\nWith the power out, cages can no longer hold these dinosaurs," +
                "\nand a handful of them are already free!" +
                "\n" +
                "\nYou are one of the last tour guides alive. " +
                "\nYou need to find the power grid and get it back online " +
                "\nwhile helping others to safety." +
                "\n" +
                "\nGood luck and be careful out there! A T-Rex has already" +
                "\nbeen reported missing." +
                "\n" +
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
