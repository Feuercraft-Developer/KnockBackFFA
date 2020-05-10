package eu.feuercraft.developers.knockbackffa.scoreboard;

import eu.feuercraft.developers.knockbackffa.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardHandler {

    private static Integer animationCount;

    private final String [] animation = new String[] {
        "§6HALLO", "§eHALLO", "§fHALLO", "§eHALLO", "§6HALLO"
    };

    ScoreboardManager manager = Bukkit.getScoreboardManager();
    Scoreboard scoreboard = manager.getNewScoreboard();
    Objective animatedObjective = scoreboard.registerNewObjective("main-content", "dummy");

    public void setSideScoreboard (final Player player) {

        animatedObjective.setDisplaySlot(DisplaySlot.SIDEBAR);
        animatedObjective.setDisplayName(animation[0]);

        animatedObjective.getScore("§6Hallo").setScore(5);
        animatedObjective.getScore("§4Ich").setScore(4);
        animatedObjective.getScore("§abin").setScore(3);
        animatedObjective.getScore("§cein").setScore(2);
        animatedObjective.getScore("§6Scoreboard").setScore(1);

        player.setScoreboard(scoreboard);

    }

    public void startAnimation() {
        animationCount = 0;
        Bukkit.getScheduler().runTaskTimer(Main.getPlugin(Main.class), () -> {

            Bukkit.getOnlinePlayers().forEach( current -> {
                if(current.getScoreboard() == null) {
                    setSideScoreboard(current);
                }

                current.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName(animation[animationCount]);

            });

            animationCount ++;
            if(animationCount == animation.length){
                animationCount = 0;
            }

        },0,5);

    }


}