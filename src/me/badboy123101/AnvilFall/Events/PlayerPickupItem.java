package me.badboy123101.AnvilFall.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PlayerPickupItem implements Listener{
	
	@EventHandler
	public void onPickUpItem(PlayerPickupItemEvent e){
		e.setCancelled(true);
	}
	
}
