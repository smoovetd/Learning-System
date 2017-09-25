package learning.system.app.commands;

import java.util.List;
import learning.system.app.menu.menulevel.MenuLevel;

public interface Command {

    public void validateCommand(String command);
    
    public void dispatchCommand(String command);

    public boolean executeComand(String command);
    
    public List<Command> getApplicableCommands(MenuLevel level);
}
