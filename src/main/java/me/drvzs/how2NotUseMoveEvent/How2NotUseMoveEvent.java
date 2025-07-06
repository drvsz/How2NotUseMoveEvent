package me.drvzs.how2NotUseMoveEvent;

import me.drvzs.how2NotUseMoveEvent.task.MoveTask;
import org.bukkit.plugin.java.JavaPlugin;

public final class How2NotUseMoveEvent extends JavaPlugin {

    private MoveTask moveTask;

    @Override
    public void onEnable() {
        //getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        moveTask = new MoveTask();
        moveTask.runTaskTimerAsynchronously(this, 1L, 20L); // run async to save performance even more and the period can be increased if you have higher player counts
    }
}
