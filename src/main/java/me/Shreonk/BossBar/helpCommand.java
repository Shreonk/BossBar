package me.Shreonk.BossBar;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class helpCommand implements CommandExecutor {

    public main plugin;

    public helpCommand(main plugin) {
        this.plugin = plugin;
    }

    public helpCommand() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                player.sendMessage("try putting enough args");
                if (args[0].equalsIgnoreCase("help")) {
                    player.sendMessage(ChatColor.YELLOW + "Use these commands to help with the BossBar plugin!");
                    player.sendMessage(ChatColor.YELLOW + "-/bossbar help-Displays list of commands");
                    player.sendMessage(ChatColor.YELLOW + "-/bossbar set <title> Sets a new " +
                            "bossbar");
                    player.sendMessage(ChatColor.YELLOW + "-/bossbar remove-Removes a bossbar");


                }
            }
        }
        return true;
    }
}