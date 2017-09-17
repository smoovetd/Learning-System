package learning.system.app.wellcomescreen;

import learning.system.app.exceptions.NullFieldException;
import learning.system.app.utils.GitInformation;
import learning.system.app.utils.GitInformationImplementation;

public class WellcomeImplementation implements Wellcome {

    private GitInformation gitInformation;
    
    private String wellcomeMessage;
    
    public WellcomeImplementation(){
        gitInformation = new GitInformationImplementation();
        this.setWellcomeMessage(WELLCOME_MESSAGE_COMMON_TEXT);
    }
    
        public String getWellcomeMessage(){
        return this.wellcomeMessage;
    }
    
    private void setWellcomeMessage(String message) throws NullFieldException{
        if (message == null){
            throw new NullFieldException("WellcomeImplementation.setWellcomeMessage wellcome message cannot be empty");
        }
        
        this.wellcomeMessage = message;
    }

    
    
    @Override
    public void printWellcomeMessage() {
        
    }

    @Override
    public void getWellcomeScreen(){
        throw new UnsupportedOperationException("WellcomeImplementation.getWellcomeScreen() is not implemented");
    } 
}
