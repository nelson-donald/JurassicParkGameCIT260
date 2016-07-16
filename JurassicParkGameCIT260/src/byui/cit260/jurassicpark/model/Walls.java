/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author igadg
 */
public class Walls extends Drawable {
    
    //This is the array which is used for mapping the drawable walls and such
    public int[][] VisibleWalls = new int[3][3];
    
    public void ResetVisibleWalls(){
        for(int i = 0;i<3;i++)
        {
            VisibleWalls[i][0]=0;
            VisibleWalls[i][1]=0;
            VisibleWalls[i][2]=0;
        }
    }
    
    public void Process(Player p, int[][] gameMap)
    {
        
        ResetVisibleWalls();
        switch(p.getDirection())
        {
            case 1:
                VisibleWalls[0][0] = gameMap[p.getDungeonLocation()[0][0]-2][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[0][1] = gameMap[p.getDungeonLocation()[0][0]-2][p.getDungeonLocation()[0][1]];
                VisibleWalls[0][2] = gameMap[p.getDungeonLocation()[0][0]-2][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[1][0] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[1][1] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]];
                VisibleWalls[1][2] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[2][0] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[2][2] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]+1];
                
                break;
            case 2:
                
                VisibleWalls[0][0] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]+2];
                VisibleWalls[0][1] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]+2];
                VisibleWalls[0][2] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]+2];
                VisibleWalls[1][0] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[1][1] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[1][2] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[2][0] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]];
                VisibleWalls[2][2] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]];
                break;
            case 3:
                
                VisibleWalls[0][0] = gameMap[p.getDungeonLocation()[0][0]+2][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[0][1] = gameMap[p.getDungeonLocation()[0][0]+2][p.getDungeonLocation()[0][1]];
                VisibleWalls[0][2] = gameMap[p.getDungeonLocation()[0][0]+2][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[1][0] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[1][1] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]];
                VisibleWalls[1][2] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[2][0] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]+1];
                VisibleWalls[2][2] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]-1];
                break;
            case 4:
                
                VisibleWalls[0][0] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]-2];
                VisibleWalls[0][1] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]-2];
                VisibleWalls[0][2] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]-2];
                VisibleWalls[1][0] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[1][1] = gameMap[p.getDungeonLocation()[0][0]][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[1][2] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]-1];
                VisibleWalls[2][0] = gameMap[p.getDungeonLocation()[0][0]+1][p.getDungeonLocation()[0][1]];
                VisibleWalls[2][2] = gameMap[p.getDungeonLocation()[0][0]-1][p.getDungeonLocation()[0][1]];
                break;
        }
        
        //First check that the space in front of us is a wall
        if(VisibleWalls[1][1] == 1){
            System.out.println("middle closed");
            SetView2(1);
            SetView3(1);
            SetView4(1);
            SetView5(1);
            SetView6(1);
            if(VisibleWalls[2][0]==1)
            {
                SetView1(1);
            }
            else
            {
                SetView1(0);
            }
            
            if(VisibleWalls[2][2] == 1){
                SetView7(1);
            }
            else
            {
                SetView7(0);
            }
        }
        else if(VisibleWalls[0][1] == 1){
            System.out.println("middle kind of closed");
            SetView3(2);
            SetView4(2);
            SetView5(2);
            if(VisibleWalls[2][0]==1)
            {
                SetView1(1);
            }
            else
            {
                SetView1(0);
            }
            if(VisibleWalls[1][0]==1)
            {
                SetView2(3);
            }
            else
            {
                SetView2(0);
            }
            if(VisibleWalls[1][2] == 1){
                SetView6(3);
            }
            else
            {
                SetView6(0);
            }
            if(VisibleWalls[2][2] == 1){
                SetView7(1);
            }
            else
            {
                SetView7(0);
            }
        }else{
            System.out.println("middle open");
            SetView4(0);
            if(VisibleWalls[2][0]==1)
            {
                SetView1(1);
            }
            else
            {
                SetView1(0);
            }
            if(VisibleWalls[1][0]==1)
            {
                SetView2(3);
            }
            else
            {
                SetView2(0);
            }if(VisibleWalls[0][0]==1)
            {
                SetView3(3);
            }
            else
            {
                SetView3(0);
            }
            if(VisibleWalls[0][2] == 1){
                SetView5(3);
            }
            else
            {
                SetView5(0);
            }
            if(VisibleWalls[1][2] == 1){
                SetView6(3);
            }
            else
            {
                SetView6(0);
            }
            if(VisibleWalls[2][2] == 1){
                SetView7(1);
            }
            else
            {
                SetView7(0);
            }
        }
        
        
    }
    
    private static String[] split1(String string)
    {
        char[] chars = string.toCharArray();
        String[] strings = new String[chars.length];
        for (int i = 0; i < chars.length; i++)
        {
            strings[i] = String.valueOf(chars[i]);
        }
        return strings;
    }
    
    
    
       
    
    public void SetView1(int texture)
    {
        String f = "";
        switch(texture)
        {
            case 0:
                f="1open.txt";
                break;
            case 1:
                f = "1wall.txt";
                break;
        }
        
        try
        {
            // Open the file
            FileInputStream fstream = new FileInputStream( f);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
int x = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // overwrite the this.texture
            String[] s =split1( strLine);
            this.texture[x][0] = s[0];
            this.texture[x][1] = s[1];
            this.texture[x][2] = s[2];
            this.texture[x][3] = s[3];
            x++;
            }
        
  


//Close the input stream
br.close();
        }
        catch(Exception ex)
        {
        }
        
    }
    
    public void SetView2(int texture)
    {
        String f = "";
        switch(texture)
        {
            case 0:
                f="2open.txt";
                break;
            case 1:
                f = "2wall1.txt";
                break;
            case 2:
                f="2wall2.txt";
                break;
            case 3:
                f="2wall.txt";
                break;
                    }
        
        try
        {
            // Open the file
            FileInputStream fstream = new FileInputStream( f);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
int d = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // overwrite the this.texture
            String[] s =split1( strLine);
            //logit("[" + strLine + "]");
            
            this.texture[d][4] = s[4];
            this.texture[d][5] = s[5];
            this.texture[d][6] = s[6];
            this.texture[d][7] = s[7];
            //System.out.println(d);
            d++;
            }
        
  


//Close the input stream
br.close();
        }
        catch(Exception ex)
        {
            
            //this.texture[1][0]=ex.getMessage();
        }
        
    }
    
    public void SetView3(int texture)
    {
        String f = "";
        switch(texture)
        {
            case 0:
                f="3open.txt";
                break;
            case 1:
                f = "3wall1.txt";
                break;
            case 2:
                f="3wall2.txt";
                break;
            case 3:
                f="3wall.txt";
                break;
        }
        
        try
        {
            // Open the file
            FileInputStream fstream = new FileInputStream( f);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
int d = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // overwrite the this.texture
            String[] s =split1( strLine);
            //logit("[" + strLine + "]");
            this.texture[d][8] = s[8];
            this.texture[d][9] = s[9];
            this.texture[d][10] = s[10];
            this.texture[d][11] = s[11];
            //System.out.println(d);
            d++;
            }
        
  


//Close the input stream
br.close();
        }
        catch(Exception ex)
        {
            
            //this.texture[1][0]=ex.getMessage();
        }
        
    }
    public void SetView4(int texture)
    {
        String f = "";
        switch(texture)
        {
            case 0:
                f="4open.txt";
                break;
            case 1:
                f = "4wall1.txt";
                break;
            case 2:
                f="4wall2.txt";
                break;
            case 4:
                break;
        }
        
        try
        {
            // Open the file
            FileInputStream fstream = new FileInputStream( f);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
int d = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // overwrite the this.texture
            String[] s =split1( strLine);
            //logit("[" + strLine + "]");
            this.texture[d][12] = s[12];
            this.texture[d][13] = s[13];
            this.texture[d][14] = s[14];
            //System.out.println(d);
            d++;
            }
        
//Close the input stream
br.close();
        }
        catch(Exception ex)
        {
            
            //this.texture[1][0]=ex.getMessage();
        }
        
    }
    
    public void SetView5(int texture)
    {
        String f = "";
        switch(texture)
        {
            case 0:
                f="5open.txt";
                break;
            case 1:
                f = "5wall1.txt";
                break;
            case 2:
                f = "5wall2.txt";
                break;
            case 3:
                f="5wall.txt";
                break;
        }
        
        try
        {
            // Open the file
            FileInputStream fstream = new FileInputStream( f);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
int d = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // overwrite the this.texture
            String[] s =split1( strLine);
            //logit("[" + strLine + "]");
            this.texture[d][15] = s[15];
            this.texture[d][16] = s[16];
            this.texture[d][17] = s[17];
            this.texture[d][18] = s[18];
            //System.out.println(d);
            d++;
            }
        
  


//Close the input stream
br.close();
        }
        catch(Exception ex)
        {
            
            //this.texture[1][0]=ex.getMessage();
        }
        
    }
    
    public void SetView6(int texture)
    {
        String f = "";
        switch(texture)
        {
            case 0:
                f="6open.txt";
                break;
            case 1:
                f = "6wall1.txt";
                break;
            case 2:
                f = "6wall2.txt";
                break;
            case 3:
                f="6wall.txt";
                break;
        }
        
        try
        {
            // Open the file
            FileInputStream fstream = new FileInputStream( f);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
int d = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // overwrite the this.texture
            String[] s =split1( strLine);
            //logit("[" + strLine + "]");
            this.texture[d][19] = s[19];
            this.texture[d][20] = s[20];
            this.texture[d][21] = s[21];
            this.texture[d][22] = s[22];
            //System.out.println(d);
            d++;
            }
        
  


//Close the input stream
br.close();
        }
        catch(Exception ex)
        {
            
            //this.texture[1][0]=ex.getMessage();
        }
        
    }
    
    public void SetView7(int texture)
    {
        String f = "";
        switch(texture)
        {
            case 1:
                f = "7wall.txt";
                break;
            case 0:
                f="7open.txt";
                break;
            case 3:
                break;
            case 4:
                break;
        }
        
        try
        {
            // Open the file
            FileInputStream fstream = new FileInputStream( f);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;
int d = 0;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null)   {
            // overwrite the this.texture
            String[] s =split1( strLine);
            //logit("[" + strLine + "]");
            this.texture[d][23] = s[23];
            this.texture[d][24] = s[24];
            this.texture[d][25] = s[25];
            this.texture[d][26] = s[26];
            //System.out.println(d);
            d++;
            }
        
  


//Close the input stream
br.close();
        }
        catch(Exception ex)
        {
            
            //this.texture[1][0]=ex.getMessage();
        }
        
    }
}
