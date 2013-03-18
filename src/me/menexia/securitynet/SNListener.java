package me.menexia.securitynet;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.metadata.MetadataValue;

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
	public void onMechanicPlace(final BlockPlaceEvent event) {
//		Player p = event.getPlayer();
//		Block b = event.getBlock();
//		Material mat = b.getType();
//		if (mat.equals(Material.CHEST)) {
//			if (b.hasMetadata("snchest")) {
//				List<MetadataValue> metadata = b.getMetadata("snchest");
//			}
//		} else if (mat.equals(Material.SIGN) || mat.equals(Material.SIGN_POST)) {
//			if (b.hasMetadata("snsign")) {
//				List<MetadataValue> metadata = b.getMetadata("snchest");
//			}
//		}
		
		
		getplayer
		getblock
		getblocktype
		getiteminhand
		
		if (blocktype is chest) {
			if iteminhand.getmeta.getDislayname.equals("Emerald Transporter")
				if event.getItemInHand().getItemMeta().hasLore()
		} else if (blocktype is sign or signpost) {
			getiteminhand.getMeta
		}
	}

}
