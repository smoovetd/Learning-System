package learning.system.app.menu;

import learning.system.app.commands.Command;
import learning.system.app.menu.menulevel.MenuLevel;

public interface Menu {

    public void getMenuItems(MenuLevel level);
    
    public MenuLevel updateMenuLevel(MenuLevel currentLevel,Command command);

}
