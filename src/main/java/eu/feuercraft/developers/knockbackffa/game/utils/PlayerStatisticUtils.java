package eu.feuercraft.developers.knockbackffa.game.utils;

import com.sun.applet2.preloader.event.AppletInitEvent;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class PlayerStatisticUtils {
    private final Player player;
    private final String playerUUID;
    private File file;
    private File folder;
    private YamlConfiguration cfg;


    public PlayerStatisticUtils(Player player) {
        this.player = player;
        this.playerUUID = player.getPlayer().getUniqueId().toString();


        this.folder = new File("plugins/KnockBackFFA/Game/Data/");
        this.file = new File("plugins/KnockBackFFA/Game/Data/" + playerUUID + ".yml");
        this.cfg = YamlConfiguration.loadConfiguration(file);
    }

    public void saveFiles(){
        try {
            this.cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setupFiles(){
        if(!this.folder.exists()){
            this.folder.mkdir();


        }
        if(!this.file.exists()){
            try{
                this.file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        this.cfg.addDefault("Player.Name", this.player.getName());
        this.cfg.addDefault("Player.Stats.Kills", 0);
        this.cfg.addDefault("Player.Stats.Deaths", 0);
        this.cfg.addDefault("Player.Stats.MinutesPlayed", 0);
        this.cfg.options().copyDefaults(true);
        saveFiles();
    }

    public String getConfigString(String path){
        return this.cfg.getString(path).replace("&", "§");
    }
}
