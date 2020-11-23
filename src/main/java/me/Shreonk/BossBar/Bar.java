package me.Shreonk.BossBar;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class Bar {

    private int taskID = -1;
    private final main plugin;
    private BossBar bar;
    private Object Bar;

    public Bar(main plugin) {
        this.plugin = plugin;
    }

    public void addPlayer(Player player) {
        bar.addPlayer(player);
    }

    public BossBar getBar() {
        return bar;
    }

    public void createBar(String title) {
        bar = Bukkit.createBossBar(format("&ePOOP"), BarColor.PURPLE, BarStyle.SOLID);
        bar.setVisible(true); //sets the bossbar to visible
    }

    private String format(String msg) {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}