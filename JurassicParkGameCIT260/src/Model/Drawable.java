/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Donald Nelson
 */
public class Drawable {
    
    //Properties
    
    //The texture array is used to set the drawable characters
    String[][] texture = new String[1][1];
    
    //the textureWidth variable is used to store the width of the texture
    int textureWidth = 1;
    
    //the textureHeight variable is used to store the height of the texture
    int textureHeight = 1;
    
    //The bEnabled variable lets the functions know that the drawbale item
    //has been set up
    Boolean bDrawableEnabled = false;
    
    
    //Functions
        
    /**
     * This function will initialize the variables of the drawable class and set the Enabled variable to true to let us know that we can use the other functions
     * 05/10/2016 - Donald Nelson - initial Coding
     * @param height the height in rows for the texture
     * @param width the  width in columns for the texture
     */
    public void initializeAsDrawable(int height, int width )
    {
        textureWidth = width;
        textureHeight = height;
        texture = new String[textureWidth][textureHeight];
        bDrawableEnabled = true;
    }
    
    /**
     * This function will reset the texture back to the original state
     * 05/10/2016 - Donald Nelson - initial Coding
     */
    public void resetTexture()
    {
        //Clear the memory
        texture = null;
        
        //Reinstantiate the array
        texture = new String[textureWidth][textureHeight];
        
    }
    
    /**
     * This function will reset the texture back to the original state and put a nice ascii border around it
     * 05/10/2016 - Donald Nelson - initial Coding
     */
    public void resetTextureWithBorder()
    {
        //Make sure to reset the array texture before setting the border
        resetTexture();
                
        //Put the border into the correct locations in the array
        texture[0][0] = "╔";
        texture[0][textureWidth-1] = "╗";
        texture[textureHeight-1][0] = "╚";
        texture[textureHeight-1][textureWidth-1] = "╝";
    }
}
