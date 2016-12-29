package ru.endlesscode.markitem;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by OsipXD on 06.10.2015
 * It is part of the MarkItem.
 * All rights reserved 2014 - 2015 © «EndlessCode Group»
 */
class CommandExecutor {
    public static void giveMark(CommandSender sender) {
        if (sender instanceof Player) {
            giveMark((Player) sender);
        } else {
            sender.sendMessage("It is player side command");
        }
    }


    public static void giveMark(CommandSender sender, String name) {
        @SuppressWarnings("deprecation")
        Player player = MarkItem.getInstance().getServer().getPlayer(name);

        if (player == null) {
            sender.sendMessage("Player " + name + " not found.");
        } else {
            giveMark(player);
        }
    }

    private static void giveMark(Player player) {
        if (player.getInventory().firstEmpty() != -1) {
            player.getInventory().addItem(MarkItem.getItemMarker().getMark());
        }
    }
}
