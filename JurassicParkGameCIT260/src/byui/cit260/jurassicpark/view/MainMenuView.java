/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.GameControl;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author Donald Nelson
 */
public class MainMenuView extends View {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public MainMenuView() {
        super("\n"
            + "\nN - Start new game"
            + "\nL - Load saved game"
            + "\nS - Save current game"
            + "\nH - Help menu"
            + "\nQ - Quit the game");
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    

    public boolean doAction(String selection) {

        char charSel = selection.toUpperCase().charAt(0);
        
        switch (charSel) {
            case 'N':
                startNewGame();
                break;
            case 'L':
                loadSavedGame();
                break;
            case 'S':
                saveCurrentGame();
                break;
            case 'H':
                helpMenu();
                break;
            case 'Q':
                return true;
            default:
                console.println("Invalid option");
                break;
        }

        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(JurassicParkGameCIT260.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void loadSavedGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            GameControl.loadGame(fileName);
            GameMenuView gmv = new GameMenuView();
            gmv.display();
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }

    private void saveCurrentGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            GameControl.saveGame(fileName);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error on input");
        }
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
}
