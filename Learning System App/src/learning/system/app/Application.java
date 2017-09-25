package learning.system.app;

import learning.system.app.io.input.Input;
import learning.system.app.io.output.Output;
import learning.system.app.io.output.OutputConsole;
import static learning.system.app.utils.Const.ASK_FOR_COMMAND;
import static learning.system.app.utils.Const.END_OF_INPUT;
import learning.system.app.wellcomescreen.Wellcome;
import learning.system.app.wellcomescreen.WellcomeImplementation;

public class Application {
    
    private Output output;
    private Input input;
    private Wellcome wellcomeMessage;
        
    public Application(){
        this.setOutput(OutputConsole.getOutputInstance());
        this.setWellcomeMessage(new WellcomeImplementation());
    }
    
    private void setOutput(Output output){
        this.output = output;
    }
    
    private Output getOutput(){
        return this.output;
    }
    
    private void setWellcomeMessage(Wellcome wellcome){
        this.wellcomeMessage = wellcome;
    }
    
    private Wellcome getWellcomeMessage(){
        return this.wellcomeMessage;
    }
    
    public void run(){
        // Wellcome screen
        String wellcomeText = this.getWellcomeMessage().getWellcomeText();
        this.output.printLine(wellcomeText);
        String enteredInput = "";
                   
        do{ 

           this.output.printLine(ASK_FOR_COMMAND);
           //Print menu options based on level     
      
           // get Command
           enteredInput = this.input.getInput();
           
           // validate command
           
           //update menu level
           
        }while(!(enteredInput.equals(END_OF_INPUT)));
        
    }
}
