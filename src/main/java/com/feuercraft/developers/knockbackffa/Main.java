package com.feuercraft.developers.knockbackffa;

import com.feuercraft.developers.utils.FileUtils;
import com.feuercraft.developers.utils.Utils;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        //TODO Plugin start-logic
        Utils.sendConsole("Plugin successfully loaded!");

    }

    @Override
    public void onDisable() {
        //TODO Plugin stop-logic
        FileUtils.saveFiles();
    }
}
