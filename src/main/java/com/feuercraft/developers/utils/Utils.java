package com.feuercraft.developers.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utils {

    public static String prefix;

    public static void sendConsole(String msg){
        Bukkit.getConsoleSender().sendMessage(msg.replace("&","$"));
    }


}
