package me.badboy123101.AnvilFall.Events;

import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

public class BlockHit implements Listener{
	
	@EventHandler
	public void onBlockHit(EntityDamageByBlockEvent event) {
	Block b = event.getDamager();
	Entity entity = event.getEntity();
	 
	if(!(b instanceof FallingBlock)) return;
	if(!(entity instanceof Player)) return;
	 
	Player player = (Player) event.getEntity();
	 
	player.damage(5.0D);
	}
	
}
