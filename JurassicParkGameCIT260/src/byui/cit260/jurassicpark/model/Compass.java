/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import byui.cit260.jurassicpark.model.Item;

/**
 *test
 * @author Donald Nelson
 */
public class Compass extends Item {
    
    public Compass(){
        //This will initialize the item as drawable
        initializeAsDrawable(6, 11);
        resetTextureWithBorder();
    }
}
