package eu.feuercraft.developers.knockbackffa.game.utils;

import eu.feuercraft.developers.knockbackffa.utils.Utils;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class GameFileUtils {
    public static File folder = new File("plugins/KnockBackFFA/Game/");
    public static File file = new File("plugins/KnockBackFFA/Game/config.yml");
    public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);

    public static void saveFiles(){
        try {
            cfg.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void setupFiles(){
        if(!folder.exists()){
            folder.mkdir();


        }
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        cfg.options().copyDefaults(true);
        saveFiles();
    }

    public static String getConfigString(String path){
        return cfg.getString(path).replace("&", "§");
    }
}
