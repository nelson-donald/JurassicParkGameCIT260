/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.control;

import byui.cit260.jurassicpark.model.DungeonMap;
import byui.cit260.jurassicpark.model.Player;

/**
 *
 * @author igadg
 */
public class MazeControl {
    
    DungeonMap dm = new DungeonMap();

    public String process() {
        String result = "";
        dm.process();
            for(int y = 0; y < dm.getTextureHeight(); y ++)
        
            {
                for(int x = 0; x < dm.getTextureWidth(); x ++)
                {
                    result += dm.getTexture()[y][x];
                }
                result += "\r\n";
            }
            return result;
    }
    
    
    public boolean moveForward()
    {
        Player p = jurassicparkgamecit260.JurassicParkGameCIT260.getPlayer();
        int[][] i = p.getDungeonLocation();
        switch(p.getDirection())
        {
            case 1:
                if(dm.getGameMap()[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]] == 0){
                    
                    p.setDungeonLocation(0,0,i[0][0] - 1);
                }
                break;
            case 2:
                if(dm.getGameMap()[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]+1] == 2)
                {
                    return true;
                }
                if(dm.getGameMap()[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]+1] == 0){
                    p.setDungeonLocation(0,1, i[0][1] + 1);
                }
                
                break;
            case 3:
                if(dm.getGameMap()[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]] == 0){
                    p.setDungeonLocation(0,0, i[0][0]+1);
                }
                break;
            case 4:
                if(dm.getGameMap()[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]-1] == 0){
                    p.setDungeonLocation(0,1, i[0][1]-1);
                }
                break;
        }
        return false;
    }
    
    public void turnLeft(){
        Player p = jurassicparkgamecit260.JurassicParkGameCIT260.getPlayer();
        p.setDirection(p.getDirection()-1);
        if(p.getDirection()<1)
        {
            p.setDirection(4);
        }
    }
    
    public void turnRight(){
        Player p = jurassicparkgamecit260.JurassicParkGameCIT260.getPlayer();
        p.setDirection(p.getDirection()+1);
        if(p.getDirection()>4)
        {
            p.setDirection(1);
        }
    }
}
