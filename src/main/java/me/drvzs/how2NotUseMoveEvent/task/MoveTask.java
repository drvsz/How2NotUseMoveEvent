package me.drvzs.how2NotUseMoveEvent.task;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * This is what you should be doing
 */
public class MoveTask extends BukkitRunnable {

    @Override
    public void run() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            Location location = player.getLocation();

            if (player.isGliding() && player.getPitch() < 30)
                player.setVelocity(location.getDirection().multiply(2));
        }
    }
}
