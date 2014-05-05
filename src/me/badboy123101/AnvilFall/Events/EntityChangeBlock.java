package me.badboy123101.AnvilFall.Events;

import org.bukkit.Material;
import org.bukkit.entity.FallingBlock;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityChangeBlockEvent;

public class EntityChangeBlock implements Listener {
	
	@EventHandler
	public void onEntityChangeBlock(EntityChangeBlockEvent event)
	{
	    if (event.getEntity() instanceof FallingBlock)
	    {
	        event.getBlock().getLocation().getWorld().getBlockAt(event.getBlock().getLocation()).setType(Material.AIR);
	        event.getBlock().setType(Material.AIR);
	        event.getEntity().remove();
	    }
	}
	
}
