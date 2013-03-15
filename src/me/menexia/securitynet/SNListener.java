package me.menexia.securitynet;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class SNListener implements Listener {
	private final SecurityNet plugin;
	public SNListener(SecurityNet plugin) {
		this.plugin = plugin;
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void debugGreetingMessage(final PlayerJoinEvent event) {
		Player p = event.getPlayer();
		p.sendMessage(ChatColor.BLUE + "Welcome to SecurityNet, " + ChatColor.WHITE +  p.getName() + ChatColor.BLUE + ".");
		p.sendMessage(ChatColor.YELLOW + "You are now playing on SecurityNet Version: " + plugin.getDescription().getVersion());
	}
	
	@EventHandler
	public void kjd(final BlockPlaceEvent event) {
		event.getBlock().
	}

}
