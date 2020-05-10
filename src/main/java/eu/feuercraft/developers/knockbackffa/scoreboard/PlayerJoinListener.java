package eu.feuercraft.developers.knockbackffa.scoreboard;

import eu.feuercraft.developers.knockbackffa.utils.Utils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener  {

    @EventHandler
    public void  onPlayerJoin (PlayerJoinEvent event) {
        new ScoreboardHandler().setSideScoreboard(event.getPlayer());

    }

}