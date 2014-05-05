package me.badboy123101.AnvilFall;

import java.io.File;

import me.badboy123101.AnvilFall.Events.BlockHit;
import me.badboy123101.AnvilFall.Events.EntityChangeBlock;
import me.badboy123101.AnvilFall.Events.FoodLevel;
import me.badboy123101.AnvilFall.Events.PlayerDropItem;
import me.badboy123101.AnvilFall.Events.PlayerPickupItem;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
public void onEnable(){
File config = new File(this.getDataFolder(), "config.yml");
if(!config.exists()){
this.saveDefaultConfig();
getLogger().info("---------------------------------------");
getLogger().info("<Plugin name here>");
getLogger().info("No config.yml found! Creating a new one!");
getLogger().info("---------------------------------------");
getCommand("basecommand").setExecutor(new Commands());
}
PluginManager pm = Bukkit.getPluginManager();
pm.registerEvents(new BlockHit(), this);
pm.registerEvents(new EntityChangeBlock(), this);
pm.registerEvents(new FoodLevel(), this);
pm.registerEvents(new PlayerDropItem(), this);
pm.registerEvents(new PlayerPickupItem(), this);
}

public void onDisable(){

}
}