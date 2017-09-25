package learning.system.app.menu;

import java.util.ArrayList;
import java.util.List;
import learning.system.app.commands.AvailableCommands;
import learning.system.app.io.output.Output;
import learning.system.app.menu.menulevel.MenuLevel;
import learning.system.app.utils.Const;

public class MenuImplementation implements Menu {

    public static final Menu menuInstance = new MenuImplementation();
    
    private Output output;
    
    private MenuImplementation(){
        
    }
    
    public void initMenu(Output output){
        this.setOutput(output);
    }
    
    private void setOutput(Output output){
        this.output = output;
    }
    
    public Output getOutput(){
        return this.output;
    }
    
    public Menu getMenuImplementation(){
        return menuInstance;
    }
    
    @Override
    public void getMenuItems(MenuLevel level) {
            
        List<AvailableCommands> commands = new ArrayList();
        
        switch (level){
            case MAIN_MENU : 
                commands.add(AvailableCommands.HELP);
                commands.add(AvailableCommands.CREATE);
                commands.add(AvailableCommands.SHOW);
                commands.add(AvailableCommands.DELETE);
                break;
            
            case SUBJECT_MENU:
                commands.add(AvailableCommands.HELP);
                commands.add(AvailableCommands.CREATE);
                commands.add(AvailableCommands.SHOW);
                commands.add(AvailableCommands.DELETE);
                commands.add(AvailableCommands.UPDATE);
                break;
                
            case TOPIC_MENU:
                commands.add(AvailableCommands.HELP);
                commands.add(AvailableCommands.CREATE);
                commands.add(AvailableCommands.SHOW);
                commands.add(AvailableCommands.DELETE);
                commands.add(AvailableCommands.UPDATE);
                commands.add(AvailableCommands.LIST);
                
                break;
            case TASK_MENU:
                commands.add(AvailableCommands.HELP);
                commands.add(AvailableCommands.OPEN);
                commands.add(AvailableCommands.SHOW);
                commands.add(AvailableCommands.DELETE);
                commands.add(AvailableCommands.UPDATE);
                commands.add(AvailableCommands.SUSPEND);
                commands.add(AvailableCommands.CLOSE);

                break;
            default:     
                this.getOutput().printError("MenuImplemetation.getMenuItems() " + Const.UNKOWN_MENU_LEVEL + ": " + level);
                break;
        }
        
    }
    
}
