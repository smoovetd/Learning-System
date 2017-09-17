package learning.system.app.io.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import learning.system.app.io.output.Output;

/**
 *
 * @author blagiev
 * This class will take user input
 */
public class InputConsole {
    
    private static final InputConsole inputInstance = new InputConsole();
    
    private static BufferedReader buffReader;
    
    private Output output;
    
    private InputConsole(){
        buffReader = new BufferedReader(new InputStreamReader(System.in));    
    }
    
    public static InputConsole getInputInstance(){
        return inputInstance;
    }
    
    public String readLine(){
        String readingOutput = "";
        
        try {
           readingOutput = buffReader.readLine();
        }catch(IOException ioEx){
            
        }
    }
}
