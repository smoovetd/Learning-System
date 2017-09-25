package learning.system.app.io.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import learning.system.app.io.output.Output;
import learning.system.app.io.output.OutputConsole;

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
        this.setOutput(OutputConsole.getOutputInstance());
    }
    
    private void setOutput(Output output){
        this.output = output;
    }
    
    private Output getOutput(){
        return this.output;
    }
    
    public static InputConsole getInputInstance(){
        return inputInstance;
    }
    
    public String readLine(){
        String readingOutput = "";
        
        try {
           readingOutput = buffReader.readLine();
        }catch(IOException ioEx){
            this.getOutput().printLine("InputConsole.readline(): text cannot be null:" + ioEx.getMessage());
        }
        
        return readingOutput;
    }
}
