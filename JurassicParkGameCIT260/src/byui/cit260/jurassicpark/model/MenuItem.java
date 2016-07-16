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
public class MenuItem extends Drawable {
    
    private String phrase;
    public MenuItem(String s)
    {
        phrase = s;
        
        initializeAsDrawable(1,phrase.length());
    }
    
    public void Process(){
        resetTexture();
        char[] c = phrase.toCharArray();
        
        for(int x = 0; x < c.length; x ++)
        {
            texture[0][x] = Character.toString(c[x]);
        }
    }
}
