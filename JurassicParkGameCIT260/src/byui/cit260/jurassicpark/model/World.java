/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

/**
 *
 * @author Daniel
 */
public class World {
    
    private Location[][] grid;
    
    public static final int WIDTH = 5;
    public static final int HEIGHT = 5;
    
    public World() {
        grid = new Location[WIDTH][HEIGHT];
    }
    
}
