package me.drvzs.how2NotUseMoveEvent.listener;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Don't be dumb because once your server hits 100 players its gonna get knocked out (assuming you have good hardware or else its gonna give up at 60 ish) because this gets fired ~4-5 times when you move a single pixel
 * Instead just have a runnable that runs every 20 ticks which provides you with far better performance
 */
public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        Location location = player.getLocation();

        if (player.isGliding() && player.getPitch() < 30)
            player.setVelocity(location.getDirection().multiply(2));


        System.out.println("fired");
    }
}
