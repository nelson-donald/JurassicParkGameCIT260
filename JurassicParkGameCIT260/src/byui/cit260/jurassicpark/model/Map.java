/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.Serializable;

/**
 *
 * @author igadg
 */
public class Map implements Serializable {
    
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
                location[0][0].setDescription(">The tall grass spread throughout this valley"
                + "\n>puts you and your tourists on edge."
                + "\n>There is a dense forest to the south.");
                
                location[0][1].setDescription(">There is a mix of tall grass and tropical"
                + "\n>foliage. There is an electrical fense to the"
                + "\n>south with a hole. The Dinosaurs probably"
                + "\n>broke out through there");
                
                location[0][2].setDescription(">A beautiful waterfall cascades down the"
                + "\n>cliffside to the south. The mist in the air"
                + "\n>makes the humidity that much more unbearable.");
                
                location[0][3].setDescription(">The car depot has been abandoned. Tools can"
                        + "\n>be seen scattered throughout the shop");
                
                location[0][4].setDescription(">Dense jungle makes it difficult to move.");
                
                location[1][0].setDescription(">A large stone building can be seen to the"
                + "\n>South. Warning signs about electical current"
                + "\n>can be seen posted everywhere. A door to the"
                        + "\n>building is South");
                
                location[1][1].setDescription("");
                location[1][2].setDescription("");
                location[1][3].setDescription("");
                location[1][4].setDescription("");
                location[2][0].setDescription(">You find yourself inside of the Power Station."
                + "\n> There must be something that we need to do.");
                location[2][1].setDescription(">A large stone building can be seen to the"
                + "\n>West. Warning signs about electrical current"
                + "\n>can be seen posted everywhere. A door to the"
                + "\n>building is West.");
                location[2][2].setDescription("");
                location[2][3].setDescription("");
                location[2][4].setDescription("");
                location[3][0].setDescription(">A large stone building can be seen to the"
                + "\n>North. Warning signs about electical current"
                + "\n>can be seen posted everywhere. A door to the"
                        + "\n>building is North");
                location[3][1].setDescription("");
                location[3][2].setDescription("");
                location[3][3].setDescription("");
                location[3][4].setDescription("");
                location[4][0].setDescription("");
                location[4][1].setDescription("");
                location[4][2].setDescription("");
                location[4][3].setDescription("");
                location[4][4].setDescription("");
    }

    public String getMapString() {

        String rtn = "";

        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                
                
                rtn += "\t";
            }
            rtn += "\n";
        }

        return rtn;
    }
    
}
