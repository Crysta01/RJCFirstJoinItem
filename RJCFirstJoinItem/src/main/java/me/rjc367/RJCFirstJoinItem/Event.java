package me.rjc367.RJCFirstJoinItem;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class Event implements Listener {

    @EventHandler
    public void join(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPlayedBefore()) {

            Bukkit.getServer().broadcastMessage(ChatColor.LIGHT_PURPLE + "Welcome " + player.getName() + " to the server!");

            ItemStack axe = new ItemStack(Material.STONE_AXE, 1);
            player.getInventory().addItem(axe);
            //Give player a stone axe

            ItemStack shovel = new ItemStack(Material.STONE_SHOVEL, 1);
            player.getInventory().addItem(shovel);
            //Give player a stone shovel

            ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
            player.getInventory().addItem(sword);
            //Give player a stone sword

            ItemStack pick = new ItemStack(Material.STONE_PICKAXE, 1);
            player.getInventory().addItem(pick);
            //Give player a stone pickaxe


        }

    }
}
