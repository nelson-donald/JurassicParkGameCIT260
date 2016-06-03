/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

/**
 *
 * @author Donald Nelson
 */
public class HelpMenuView extends View {
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public HelpMenuView() {
        super("\n"
            + "\nA - About this game"
            + "\nH - How to play"
            + "\nO - Objective"
            + "\nM - Movement help"
            + "\nQ - Exit the help menu");
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
     

    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'A':
                aboutGame();
                break;
            case 'H':
                howToPlay();
                break;
            case 'O':
                objectives();
                break;
            case 'M':
                movementHelp();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }
        
        return false;
    }

    private void aboutGame() {
        console.println("Created by Donald Nelson, Joey Hendrix, Kirstin Cutler.");
    }

    private void howToPlay() {
        console.println("If you can't figure it out on your own ... ");
    }

    private void objectives() {
        console.println("Save as many people as you can. Avoid the dinosaurs at all cost. Turn back on the breaker. Make a call for rescue.");
    }

    private void movementHelp() {
        console.println("North, South, East, West, Search");
    }

}
