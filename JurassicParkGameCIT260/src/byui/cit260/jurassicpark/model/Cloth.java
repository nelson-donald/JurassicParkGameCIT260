/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

/**
 *
 * @author joeyhendrix, Donald Nelson
 */
public class Cloth extends Item {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public Cloth(){
        //This will initialize the item as drawable
        initializeAsDrawable(1, 11);
        
        //This will reset the texture with a border
        resetTexture();
        
        //Setup the item information
        initialize(ItemType.Cloth, 1);
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
}
