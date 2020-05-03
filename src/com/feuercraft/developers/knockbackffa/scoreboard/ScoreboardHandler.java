package com.feuercraft.developers.knockbackffa.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreboardHandler {

    private static Integer animationCount;

    private String [] animatinon = new String[] {
        "§6HALLO", "§eHALLO", "§fHALLO", "§eHALLO", "§6HALLO"
    };

    public void setScorboard (final Player player) {
        final Scoreboard scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        final Object objective = scoreboard.registerNewObjective("main-content", "dummy");

           objective.setDisplaySlot(DisplaySlot.SIDEBAR);
           objective.setDispalayName(animationCount)

           objective.getScore("§7Hallo").setScore(5);
           objective.getScore("§7Hallo").setScore(4);
           objective.getScore("§7Hallo").setScore(3);
           objective.getScore("§7Hallo").setScore(2);
           objective.getScore("§7Hallo").setScore(1);

           player.setScoreboard(scoreboard);

    }

    public void startAnimation() {
        animationCount = 0;
        Bukkit.getScheduler().runTaskTimer(Knockback.getPlugin(Knockback.class), new Runnable() {
            @Override
            public void run() {
                Bukkit.getOnlinePlayers().forEach(current -> {

                    if (current.getScoreboard() == null)
                        setScorboard(current);

                    current.getScoreboard().getObjective(DisplaySlot.SIDEBAR).setDisplayName(animatinon[animationCount]);

                });

                animationCount++;

                if (animationCount == animatinon.length)
                    animationCount = 0;


            }
        },0, 5);

    }


}