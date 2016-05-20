/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

/**
 *
 * @author igadg
 */
public class Map {
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    public static final int NUM_ROWS = 5;
    public static final int NUM_COLS = 5;

    private Location[][] location;
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Map() {
        location = new Location[NUM_ROWS][NUM_COLS];
        init();
    }
    

    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter

    public Location getLocation(int row, int col) {
        return location[row][col];
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Function
    
    public void init() {

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                Location loc = new Location();

                //Create a random location type
                //loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
                loc.setRow(row);
                loc.setCol(col);

                location[row][col] = loc;
            }
        }
    }

    public String getMapString() {

        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                //rtn += location[row][col].getType().name().charAt(0);
                
                //if(location[row][col].getHero() != null) {
                //    rtn += location[row][col].getHero().getName().charAt(0);
                //}
                
                rtn += "\t";
            }
            rtn += "\n";
        }

        return rtn;
    }
    
}
