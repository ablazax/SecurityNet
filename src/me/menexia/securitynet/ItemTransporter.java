package me.menexia.securitynet;

import org.bukkit.Location;

public abstract class ItemTransporter {
	public String owner;
	public String world;
	public Location loc;
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public void setWorld(String world) {
		this.world = world;
	}
	
	public void setLocation(Location loc) {
		this.loc = loc;
	}
	
}
