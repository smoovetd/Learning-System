package learning.system.app.wellcomescreen;

import learning.system.app.exceptions.NullFieldException;
import learning.system.app.io.input.Input;
import learning.system.app.io.output.Output;
import learning.system.app.io.output.OutputConsole;
import learning.system.app.utils.GitInformation;
import learning.system.app.utils.GitInformationImplementation;
import learning.system.app.utils.Const;
import static learning.system.app.utils.Const.WELLCOME_MESSAGE_TEXT;

public class WellcomeImplementation implements Wellcome {

    private GitInformation gitInformation;
    
    private String wellcomeMessage;
    
    private static final String defaultWellcomeMessage = "Wellcome";
    
    public WellcomeImplementation(){
        gitInformation = new GitInformationImplementation();
        this.setWellcomeMessage(WELLCOME_MESSAGE_TEXT);
    }
     
    private void setWellcomeMessage(String message){
        if (message == null){
            message = defaultWellcomeMessage;
        }
        
        this.wellcomeMessage = message;
    }
    
        @Override
    public String getWellcomeText(){
        return this.wellcomeMessage;
    }
    
    @Override
    public void getWellcomeScreen(){
        throw new UnsupportedOperationException("WellcomeImplementation.getWellcomeScreen() is not implemented");
    } 
}
