/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import byui.cit260.jurassicpark.enums.LocationType;
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
                + "\n>puts you and your tourists on edge.");
                
                location[0][1].setDescription(">There is a mix of tall grass and tropical"
                + "\n>foliage. There is an electrical fense to the"
                + "\n>south with a hole. The Dinosaurs probably"
                + "\n>broke out through there");
                
                location[0][2].setDescription(">A beautiful waterfall cascades down the"
                + "\n>cliffside to the south. The mist in the air"
                + "\n>makes the humidity that much more unbearable.");
                
                location[0][3].setDescription(">The car depot has been abandoned. Tools can"
                        + "\n>be seen scattered throughout the shop."
                + "\n>You can see a gas can sitting in the corner.");
                location[0][3].setType(LocationType.CarDepot);
                
                location[0][4].setDescription(">Dense jungle makes it difficult to move.");
                
                location[1][0].setDescription(">A large stone building can be seen to the"
                + "\n>South. Warning signs about electical current"
                + "\n>can be seen posted everywhere. A door to the"
                + "\n>building is South");
                
                location[1][1].setDescription(">An electrical fence to the North has a hole"
                + "\n>in it. Some dinosaurs may have escaped.");
                location[1][2].setDescription(">You hear a T-Rex roar nearby"
                + "\n>and stumble across a fresh footprint in the mud."
                + "\n> You need to get out of here, quick!");
                location[1][3].setDescription(">What an amazing creature!"
                + "\n>Although he's an herbivore, you can still get crushed"
                + "\n>so don't admire him too much!");
                location[1][4].setDescription(">You found a sign that says the Operations Center"
                + "\n>is just south of here.");
                location[2][0].setDescription(">You find yourself inside of the Power Station."
                + "\n> There must be something that we need to do.");
                location[2][0].setType(LocationType.PowerStation);
                
                location[2][1].setDescription(">A large stone building can be seen to the"
                + "\n>West. Warning signs about electrical current"
                + "\n>can be seen posted everywhere. A door to the"
                + "\n>building is West.");
                location[2][2].setDescription(">You have encountered a T-Rex!"
                        + "\n>Now you need to rely on your speed"
                        + "\n>to get out of this one! RUN!");
                location[2][3].setDescription(">A pack of raptors is nearby, looking for food."
                        + "\n>They seem to be blocking the Operation Center's north entrance.");
                location[2][4].setDescription(">Raptors everywhere!"
                        + "\n>>You will need to find another entrance!");
                location[3][0].setDescription(">A large stone building can be seen to the"
                + "\n>North. Warning signs about electical current"
                + "\n>can be seen posted everywhere. A door to the"
                        + "\n>building is North from here");
                location[3][1].setDescription(">A brontosaurus ran through here"
                        + "\n>leveling some large trees in its path."
                        + "\n>You found some shattered pieces of a tree trunk.");
                location[3][2].setDescription(">The bloody remains from a dinosaur fight are all"
                        + "\n>that's left around here. Stay out of sight if you can.");
                location[3][3].setDescription(">You found a sign that says the Operation Center"
                        + "\n>is just east of here."
                        + "\n>Watch out for raptors!");
                location[3][4].setDescription("Operations Center. We found it");
                location[3][4].setType(LocationType.ControlCenter);
                location[4][0].setDescription(">It looks like someone fled by ATV but never"
                        + "\n>made it out alive."
                        + "\n>There's a quarter tank of fuel left.");
                location[4][1].setDescription(">It may be tempting, but you can't run away yet!"
                        + "\n>The world is counting on you to complete your tasks!");
                location[4][2].setDescription(">You reached the shore and all you can see for miles"
                        + "\n>is the vastness of the blue ocean."
                        + "\n>You may be safe here for now, but it's only a matter of time"
                        + "\n>before they find you.");
                location[4][3].setDescription(">That Operation Center should be around here somewhere!"
                        + "\n>You also just found some tourists hiding in the bushes."
                        + "\n>One is badly injured, so you will need to get help fast!");
                location[4][4].setDescription(">You just lost your injured tourist."
                        + "\n>What a tragedy!"
                        + "\n>Get out of here quick before you lose anyone else!");
    }

    public String getMapString() {

        String rtn = "Jurassic Park Island Map\r\n,1,2,3,4,5\r\n";

        for (int row = 0; row < NUM_ROWS; row++) {
            rtn += Integer.toString(row + 1) + ",";
            for (int col = 0; col < NUM_COLS; col++) {
                
                
                rtn += location[row][col].getType() + ",";
            }
            rtn += "\r\n";
        }

        return rtn;
    }
    
}
