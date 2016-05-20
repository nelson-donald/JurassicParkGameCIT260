/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.model.Game;
import byui.cit260.jurassicpark.model.Map;
import byui.cit260.jurassicpark.model.Player;
import byui.cit260.jurassicpark.view.ErrorView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 * The purpose of this class is to handle all the control processing for the
 * game. It will be filled out at a later date.
 * @author Donald Nelson
 */
public class GameControl {
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public GameControl(){
        
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    
    public static void createNewGame(Player player) {
        
        Game g = new Game();
        g.setPlayer(player);
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        JurassicParkGameCIT260.setGame(g);
    }
    
    public static void saveGame(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            oos.writeObject(JurassicParkGameCIT260.getGame());
        } catch(Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
        }
    }
    
    public static void loadGame(String filePath) {
        Game game = null;
        
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            game = (Game)ois.readObject();
            
            JurassicParkGameCIT260.setGame(game);
            JurassicParkGameCIT260.setPlayer(game.getPlayer());
        } catch (Exception e) {
            ErrorView.display("ProgramController", e.getMessage());
        }
    }
    
    public static Player createPlayer(String playerName) {
        
        if(playerName == null) {
            return null;
        }
        
        Player p = new Player();
        p.setName(playerName);
        return p;
    }
}
