package com.feuercraft.developers.knockbackffa;

import com.feuercraft.developers.knockbackffa.scoreboard.PlayerJoinListener;
import com.feuercraft.developers.knockbackffa.utils.FileUtils;
import com.feuercraft.developers.knockbackffa.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //TODO Plugin start-logic
        registerCommands();
        registerEventListeners();
        FileUtils.setupFiles();
        Utils.sendConsole("Plugin successfully loaded!");

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
