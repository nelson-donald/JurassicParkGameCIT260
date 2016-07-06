/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;

import byui.cit260.jurassicpark.control.GameControl;
import byui.cit260.jurassicpark.model.Player;
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
        super("Main Menu"
            + "\n"
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
        
        String playerName = getPlayerName();
        
        Player player = GameControl.createPlayer(playerName);
        
        JurassicParkGameCIT260.setPlayer(player);
        
        displayWelcomeMessage(player.getName());
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
            ErrorView.display(this.getClass().getName(), "Error loading game");
        }
    }

    private void saveCurrentGame() {
        console.println("Enter file name: ");
        try {
            String fileName = keyboard.readLine();
            GameControl.saveGame(fileName);
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error saving game");
        }
    }

    private void helpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
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
                ErrorView.display(this.getClass().getName(), "Error getting player name");
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

    public void displayWelcomeMessage(String playerName) {
        console.println("==============================");
        console.println("Welcome " + playerName + ".");
        console.println("Enjoy the game!");
        console.println("==============================");
        
    }
            
}
