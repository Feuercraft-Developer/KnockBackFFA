package com.feuercraft.developers.knockbackffa.scoreboard;

import com.feuercraft.developers.knockbackffa.utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener  {

    @EventHandler
    public void  onPlayerJoin (PlayerJoinEvent event) {
        new ScoreboardHandler().setSideScoreboard(event.getPlayer());
        Utils.sendConsole("The Player " + event.getPlayer().getName() + " has joined the Game!");

    }

}