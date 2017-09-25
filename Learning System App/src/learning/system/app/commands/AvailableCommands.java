package learning.system.app.commands;

/**
 *
 * @author blagiev
 * Enum for available commands supported by the application
 */
public enum AvailableCommands {
    HELP    ("HELP"),
    LIST    ("LIST"),
    CREATE  ("CREATE"),
    UPDATE  ("UPDATE"),
    DELETE  ("DELETE"),
    SHOW    ("SHOW"),
    CLOSE   ("CLOSE"),
    SUSPEND ("SUSPEND"),
    OPEN    ("OPEN"),
    ADD     ("ADD");
    
    private final String commandName;
    
    private AvailableCommands(String command){
        commandName = command;
    }
    
    public boolean compareCommandName(String name){
        return this.commandName.equals(name);
    }
    
    public String toString(){
        return this.commandName;
    }
}
