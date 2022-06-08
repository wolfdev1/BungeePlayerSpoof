package me.sebasorovaa.BungeePlayerSpoof;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import static me.sebasorovaa.BungeePlayerSpoof.Main.fakepla;

public class setPlayers extends Command {
    public setPlayers() {
        super("setplayers");
    }
    public void execute(CommandSender sender, String[] args) {
        if (args.length == 0){
            sender.sendMessage(ChatColor.RED + "[BungeePlayerSpoof] " + ChatColor.RED + "Correct usage: /setplayers <number>");
            ;
        } else {
            try {
                fakepla = Integer.parseInt(args[0]);
                sender.sendMessage(ChatColor.RED + "[BungeePlayerSpoof] " + ChatColor.GREEN + "Successfully set the playercount to " + args[0] + " Players");
            } catch (NumberFormatException e) {
                e.printStackTrace();
                sender.sendMessage(ChatColor.RED + "[BungeePlayerSpoof] " + ChatColor.RED + "You need to type a number");
            }
        }
    }
}
