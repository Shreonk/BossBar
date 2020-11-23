package me.Shreonk.BossBar;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Set;

public class SetCommand implements CommandExecutor {

    public main plugin;

    public SetCommand(main plugin) {
        this.plugin = plugin;
    }

    public SetCommand() {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage("not enough args silly billy");
                if (args[0].equalsIgnoreCase("set")) {
                }
                player.sendMessage(ChatColor.GREEN + "Your bossbar has been set");
                StringBuilder sb = new StringBuilder();
                for (int i = 1; i < args.length; i++) {
                    sb.append(args[i] + " ");
                }

                String title = sb.toString().trim();
                Bar bar = new Bar(plugin);
                bar.createBar(title);
                bar.addPlayer(player);
            }

        }
        return false;
    }
}
