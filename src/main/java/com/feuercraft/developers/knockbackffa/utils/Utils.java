package com.feuercraft.developers.knockbackffa.utils;

import com.feuercraft.developers.knockbackffa.Main;
import com.feuercraft.developers.knockbackffa.scoreboard.PlayerJoinListener;
import org.bukkit.Bukkit;

public class Utils {

    public static String prefix;

    public static void sendConsole(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix + msg);
    }





}
