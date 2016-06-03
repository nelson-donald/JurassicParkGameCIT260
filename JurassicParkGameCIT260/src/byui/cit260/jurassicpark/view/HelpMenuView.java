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
        super("Help Menu"
            + "\n"
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
        console.println("As you move through the park and encounter dinosaurs, some species "
                + "\nwill endanger your life. In order to protect the tourists and yourself "
                + "\nyou will need to collect cloth, sticks and fuel to make torches."
                + "\nEach torch will only ward off one dinosaur and last for a certain "
                + "\namount of time, so use it wisely."
                + "\n"
                + "\n In order to complete the game you must make it to the station "
                + "\n with ?? tourists."
        
        );
    }

    private void objectives() {
        console.println("Save as many people as you can. "
                + "\nAvoid the dinosaurs at all cost. "
                + "\nTurn back on the breaker. "
                + "\nMake a call for rescue.");
    }

    private void movementHelp() {
        console.println("North, South, East, West, Search");
    }

}
