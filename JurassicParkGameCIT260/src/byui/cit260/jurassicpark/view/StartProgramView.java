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
        
        
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
    }
    
    
    
    public void displayBanner() {
        String welcome = "";
        welcome = "=================================================" +
                "\nWELCOME TO JURASSIC PARK" +
                "\n" +
                "\nFor almost a year now, people from all over the" +
                "\nworld have visited our park to see these spectacular" +
                "\ncreatures who have been extinct for millions of years." +
                "\n" +
                "\nEverything has run smoothly, until today." +
                "\n" +
                "\nYou are a newly hired tour guide on your first day" +
                "\nwho experiences one of the most horrific things" +
                "\nmankind has ever seen before." +
                "\n" +
                "\nThere has been a massive power outage on the island" +
                "\nand thousands of people, including you, are in panic." +
                "\n" +
                "\nCages can no longer hold these dinosaurs and a handful" +
                "\nof them have already found their way out." +
                "\n" +
                "\nYou are one of the last tour guides who will need" +
                "\nto find the power grid and get back online while" +
                "\nhelping others to safety." +
                "\n" +
                "\nGood luck and be careful out there! A T-Rex has already" +
                "\nbeen reported missing." +
                "\n" +
                "\n=================================================";
                
        
        console.println(welcome);
    }
    
    
    
}
