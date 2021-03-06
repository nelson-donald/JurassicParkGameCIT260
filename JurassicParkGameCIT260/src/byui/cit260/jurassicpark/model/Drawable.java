/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.Serializable;

/**
 *
 * @author Donald Nelson
 */
public abstract class Drawable implements Serializable {
    
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    
    //The texture array is used to set the drawable characters
    public String[][] texture = new String[1][1];
    
    //the textureWidth variable is used to store the width of the texture
    private int textureWidth = 1;
    
    //the textureHeight variable is used to store the height of the texture
    private int textureHeight = 1;
    
    //The bEnabled variable lets the functions know that the drawbale item
    //has been set up
    private boolean bDrawableEnabled = false;

    
    
    ////////////////////////////////////////////////////////////////////////////
    //Getter and Setter
    
    public String[][] getTexture( )
    {
        return texture;
    }

    public void setTexture(String[][] texture) {
        this.texture = texture;
    }

    public int getTextureWidth() {
        return textureWidth;
    }

    public void setTextureWidth(int textureWidth) {
        this.textureWidth = textureWidth;
    }

    public int getTextureHeight() {
        return textureHeight;
    }

    public void setTextureHeight(int textureHeight) {
        this.textureHeight = textureHeight;
    }

    public boolean isbDrawableEnabled() {
        return bDrawableEnabled;
    }

    public void setbDrawableEnabled(boolean bDrawableEnabled) {
        this.bDrawableEnabled = bDrawableEnabled;
    }
    

    ////////////////////////////////////////////////////////////////////////////
    //Functions
    
    /**
     * This function will initialize the variables of the drawable class and set the Enabled variable to true to let us know that we can use the other functions
     * 05/10/2016 - Donald Nelson - initial Coding
     * @param height the height in rows for the texture
     * @param width the  width in columns for the texture
     */
    public void initializeAsDrawable(int height, int width) {
        textureWidth = width;
        textureHeight = height;
        texture = new String[textureHeight][textureWidth];
        bDrawableEnabled = true;
    }
    
    /**
     * This function will reset the texture back to the original state
     * 05/10/2016 - Donald Nelson - initial Coding
     */
    public void resetTexture()
    {
        //Clear the memory
        //texture = null;
        
        //Reinstantiate the array
        //texture = new String[textureHeight][textureWidth];
        
        for(int i = 0;i < textureHeight;i++){
            for(int j = 0;j<textureWidth;j++){
                texture[i][j] = " ";
            }
        }
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
    
    /**
     * This function will draw the prepared texture to the main texture map
     * 05/10/2016 - Donald Nelson - initial Coding
     * @param s This is the variable that is the global texture map which is going to be drawn to the screen
     * @param r this is the location of the row on the global map where the item should be drawn
     * @param c this is the location of the col on the global map where the item should be drawn
     * @return 
     */
    public String[][] draw(String[][] s, int r, int c){
        
        for(int i = 0;i < textureHeight;i++){
            for(int j = 0;j<textureWidth;j++){
                s[i + r][j + c] = texture[i][j];
            }
        }
        return s;
    }
}
