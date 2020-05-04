package com.feuercraft.developers.knockbackffa.scoreboard;

import com.feuercraft.developers.knockbackffa.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreboardHandler {

    private static int animationCount;

    private String [] animation = new String[] {
        "§6HALLO", "§eHALLO", "§fHALLO", "§eHALLO", "§6HALLO"
    };

    @SuppressWarnings("deprecation")
    public void setSideScoreboard (final Player player) {
        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = manager.getNewScoreboard();
        Objective objective = scoreboard.registerNewObjective("maincontent", "dummy");

        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName("Animation");

        objective.getScore("§6Hallo").setScore(5);
        objective.getScore("§4Ich").setScore(4);
        objective.getScore("§abin").setScore(3);
        objective.getScore("§cein").setScore(2);
        objective.getScore("§6Scoreboard").setScore(1);

        player.setScoreboard(scoreboard);

    }

    public void startAnimation() {
        animationCount = 0;
        Bukkit.getScheduler().runTaskTimer(Main.getPlugin(Main.class), new Runnable() {
            @Override
            public void run() {
                Bukkit.getOnlinePlayers().forEach(current -> {

                    if (current.getScoreboard() == null)
                        setSideScoreboard(current);

                    current.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName(animation[animationCount]);

                });

                animationCount++;

                if (animationCount == animation.length)
                    animationCount = 0;


            }
        },0, 5);

    }


}