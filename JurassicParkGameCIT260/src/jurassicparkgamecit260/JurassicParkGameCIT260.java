/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurassicparkgamecit260;

import byui.cit260.jurassicpark.model.Inventory;
import byui.cit260.jurassicpark.model.Player;

/**
 *
 * @author igadg
 */
public class JurassicParkGameCIT260 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player p = new Player();
        p.setName("The Best Group. Pretty humble too.");
        p.setDirection(1);
        p.setInventory(new Inventory());
        
        System.out.println(p.toString());
    }
    
}
