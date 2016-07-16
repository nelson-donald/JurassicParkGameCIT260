/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public class DungeonMap extends Drawable {
    
    Compass compass = new Compass();
    Walls walls = new Walls();
    Menu menu = new Menu();
    
    private int[][] gameMap = new int[1][1];
    
    public DungeonMap()
    {
        //Initialize my drawable objects and set their size
        this.initializeAsDrawable(29,50);
        compass.initializeAsDrawable(6,11);
        walls.initializeAsDrawable(27,27);
        
        gameMap = new int[][]{
        {1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1},
        {1,1,0,0,0,0,0,0,0,1,1},
        {1,1,0,1,1,1,1,1,0,1,1},
        {1,1,0,1,0,2,0,1,0,1,1},
        {1,1,0,1,0,1,1,0,0,1,1},
        {1,1,0,1,0,1,1,1,0,1,1},
        {1,1,0,0,0,0,1,0,0,1,1},
        {1,1,1,1,1,1,1,1,1,1,1},
        {1,1,1,1,1,1,1,1,1,1,1}
    };
        
    }
    
    public void process()
    {
        resetTexture();
        for(int i = 0;i < this.getTextureHeight(); i++)  {
        for(int j = 0;j < this.getTextureWidth(); j++) 
            {
                texture[i][j] = " ";
                
                if(j==0 || j==28){
                texture[i][j] = "║";
                }
                if(i==0 ){
                texture[i][j] = "=";
                }
            }
        }
        
        Player p = JurassicParkGameCIT260.getGame().getPlayer();
                
        //Draw the Compass
        compass.Process(p);
        this.setTexture(compass.draw(this.getTexture(),5,30));
        
        //Draw the 3d Dungeon
        walls.Process(p,gameMap);
        this.setTexture(walls.draw(this.getTexture(),1,1));
        
        menu.Process();
        this.setTexture(menu.draw(this.getTexture(), 15, 30));
    }
    
    public int[][] getGameMap(){
        return this.gameMap;
    }
    
   
}
