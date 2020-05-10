package eu.feuercraft.developers.knockbackffa.game.utils.events;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerLeaveAreaEvent implements Listener {

    @EventHandler
    public void onPlayerLeaveAreaEvent(PlayerMoveEvent e){
        Location playerLocation = e.getPlayer().getLocation();
    }

}
