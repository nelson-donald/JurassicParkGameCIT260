/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import byui.cit260.jurassicpark.enums.ItemType;
import byui.cit260.jurassicpark.model.Item;

/**
 *
 * @author Donald Nelson
 */
public class Compass extends Drawable {
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    
    
    
    
    public void Process(Player p)
    {
        resetTextureWithBorder();
        
        switch(p.getDirection())
        {
            case 1:
                texture[getTextureHeight()-5][5] = "N";
                break;
            case 2:
                texture[getTextureHeight()-4][7] = "E";
                break;
            case 3:
                texture[getTextureHeight()-3][5] = "S";
                break;
            case 4:
                texture[getTextureHeight()-4][3] = "W";
                break;
        }
        
        texture[getTextureHeight()-2][2] = "C";
        texture[getTextureHeight()-2][3] = "O";
        texture[getTextureHeight()-2][4] = "M";
        texture[getTextureHeight()-2][5] = "P";
        texture[getTextureHeight()-2][6] = "A";
        texture[getTextureHeight()-2][7] = "S";
        texture[getTextureHeight()-2][8] = "S";
    }
    
    
    
}
