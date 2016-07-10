/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.jurassicpark.view;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import jurassicparkgamecit260.JurassicParkGameCIT260;

/**
 *
 * @author igadg
 */
public class WriteMapView extends View {
    ////////////////////////////////////////////////////////////////////////////
    //Properties
    FileWriter outputStream = null;
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Constructor
    public WriteMapView(String fileName) {
        super("");
    }

    WriteMapView() {
        super("");
                
    }
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    //Functions
    

    public boolean doAction(String selection) {

        String fileName = selection.toUpperCase().toString();
        try {
        
        
            } catch(Exception e) {
                ErrorView.display(this.getClass().getName(), "Unknown Exception");
            }
        return false;
    }


    

    boolean writeToFile(String selection)throws IOException {
        try {
        String mapText = JurassicParkGameCIT260.getGame().getMap().getMapString();
       String fileName = selection + ".csv";
        File file = new File(fileName);
              // creates the file
      file.createNewFile();
        
            outputStream = new FileWriter(fileName);
        
            //for(int i = 0; i < .)
            outputStream.write(mapText);
        
            console.println("The file was successfully written.");
            } catch(Exception e) {
                ErrorView.display(this.getClass().getName(), "There was an error writing the file: " + e.getMessage());
                return false;
            }finally {
            
            if (outputStream != null) {
                outputStream.close();
            }
            
            return true;
        }
    }
    
    

            
}
