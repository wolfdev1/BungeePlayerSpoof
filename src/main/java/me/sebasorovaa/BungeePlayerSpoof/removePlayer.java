package me.sebasorovaa.BungeePlayerSpoof;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import static me.sebasorovaa.BungeePlayerSpoof.Main.fakepla;

public class removePlayer extends Command {
    public removePlayer() {
        super("removeplayer");
    }
    public void execute(CommandSender sender, String[] args) {
        fakepla--;
        sender.sendMessage(ChatColor.RED + "[BungeePlayerSpoof] " + ChatColor.RED + "Removed 1 Player");
    }
}
