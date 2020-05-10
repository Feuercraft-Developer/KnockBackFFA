package eu.feuercraft.developers.knockbackffa.utils;

import org.bukkit.Bukkit;

public class Utils {

    public static String prefix = "§8§b[Knock-Back FFA] §6";

    public static void sendConsole(String msg){
        Bukkit.getConsoleSender().sendMessage(prefix + msg);
    }





}
