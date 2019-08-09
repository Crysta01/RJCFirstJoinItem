package me.rjc367.RJCFirstJoinItem;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    public void onEnable() {

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "RJC FirstJoinItem has been Enabled");

        Bukkit.getPluginManager().registerEvents(new Event(), this);

    }

    public void onDisable() {

        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Disabling RJC FirstJoinItem");

    }
}
