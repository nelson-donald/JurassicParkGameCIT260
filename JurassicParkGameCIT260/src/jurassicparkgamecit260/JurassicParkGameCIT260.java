/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurassicparkgamecit260;

import byui.cit260.jurassicpark.model.Game;
import byui.cit260.jurassicpark.model.Inventory;
import byui.cit260.jurassicpark.model.Player;
import byui.cit260.jurassicpark.view.StartProgramView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author igadg
 */
public class JurassicParkGameCIT260 {

    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    private static Player player;
    
    private static Game game;
    
    private static PrintWriter outFile;
    
    private static BufferedReader inFile;
    
    private static PrintWriter logFile;
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StartProgramView startProgram = null;
        try{
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            String logPath = "log.txt";
            logFile = new PrintWriter(logPath);
            
            startProgram = new StartProgramView();
            startProgram.startProgram();
            
        }catch(Exception e){
            e.printStackTrace();           
            
            startProgram.startProgram();
        }finally{
            try{
                if(inFile != null){
                    inFile.close();
                }
                if(outFile != null){
                    outFile.close();
                }
                if(logFile != null){
                    logFile.close();
                }
            }catch(Exception e)
            {
                System.out.println("Error closing files");
            }
        }
        
        
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        JurassicParkGameCIT260.player = player;
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        JurassicParkGameCIT260.game = game;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        JurassicParkGameCIT260.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        JurassicParkGameCIT260.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        JurassicParkGameCIT260.logFile = logFile;
    }

    
    
    
    
}
