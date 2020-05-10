package eu.feuercraft.developers.knockbackffa;

import eu.feuercraft.developers.knockbackffa.game.utils.GameFileUtils;
import eu.feuercraft.developers.knockbackffa.scoreboard.PlayerJoinListener;
import eu.feuercraft.developers.knockbackffa.scoreboard.ScoreboardHandler;
import eu.feuercraft.developers.knockbackffa.utils.FileUtils;
import eu.feuercraft.developers.knockbackffa.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //TODO Plugin start-logic
        registerCommands();
        registerEventListeners();
        FileUtils.setupFiles();
        GameFileUtils.setupFiles();
        Utils.sendConsole("Plugin successfully loaded!");
        new ScoreboardHandler().startAnimation();

    }

    @Override
    public void onDisable() {
        //TODO Plugin stop-logic
    }
    public static void registerCommands(){
        //TODO Commands setup
        Utils.sendConsole("Plugin loaded Commands!");
    }
    public void registerEventListeners(){
        getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);
        Utils.sendConsole("Plugin loaded Events!");
    }
}
