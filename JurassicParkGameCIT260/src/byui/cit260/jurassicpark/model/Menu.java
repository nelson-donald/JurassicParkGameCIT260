/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igadg
 */
public class Menu extends Drawable {
    
    List<MenuItem> items = new ArrayList<MenuItem>();
    public Menu()
    {
        items.add(new MenuItem("You need to make"));
        items.add(new MenuItem("it to the end"));
        items.add(new MenuItem("of the maze."));
        items.add(new MenuItem(""));
        items.add( new MenuItem("W - Move Forward"));
        items.add(new MenuItem("A - Turn Left"));
        items.add(new MenuItem("D - Turn Right"));
        items.add(new MenuItem("Q - Quit"));
        
        initializeAsDrawable(10, 18);
            
    }
    
    public void Process(){
        resetTexture();
        for(int x = 0; x < items.size();x++){
            items.get(x).Process();
            this.setTexture(items.get(x).draw(this.texture, x+1, 1));
        }
    }
}
