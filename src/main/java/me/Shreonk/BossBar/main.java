package me.Shreonk.BossBar;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class main extends JavaPlugin implements Listener {


    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(this, this);
        getCommand("bossbar").setExecutor(new helpCommand());
        getCommand("set").setExecutor(new SetCommand());
        getCommand("help").setExecutor(new helpCommand());


    }
    @Override
    public void onDisable() {

    }
}
