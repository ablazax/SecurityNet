package me.menexia.securitynet;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import net.milkbowl.vault.economy.Economy;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.conversations.ConversationFactory;
import org.bukkit.plugin.RegisteredServiceProvider;

public class SecurityNet extends JavaPlugin {
//	https://docs.google.com/document/d/1qLrUS7m5oYMSvTRG7FzaZI8GX35fz5KAsDRwQBpBNdM/edit
//	§
	public Logger logger;
	ConversationFactory factory;
	public List<String> effectList = new ArrayList<String>();
	public static Economy economy = null;
	
	public void onDisable() {
		this.logger.info("Version " + this.getDescription().getVersion() + " disabled!");
	}
	
	public void onEnable() {
		setupEconomy();
		logger = this.getLogger();
		factory = new ConversationFactory(this);
		
		checkConfig();
		
		new SNListener(this);
		this.logger.info("Version " + this.getDescription().getVersion() + " enabled!");
	}
	
	public void checkConfig() {
		String name = "config.yml";
		File actual = new File(getDataFolder(), name);
		if (!actual.exists()) {
			getDataFolder().mkdir();
			InputStream input = getClass().getResourceAsStream("/defaults/config.yml");
			if (input != null) {
				FileOutputStream output = null;

				try {
					output = new FileOutputStream(actual);
					byte[] buf = new byte[4096]; //[8192]?
					int length = 0;
					while ((length = input.read(buf)) > 0) {
						output.write(buf, 0, length);
					}
					this.logger.info("Default configuration file written: " + name);
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						if (input != null)
							input.close();
					} catch (IOException e) {}

					try {
						if (output != null)
							output.close();
					} catch (IOException e) {}
				}
			}
		}
	}
	
	 private boolean setupEconomy() {
	        RegisteredServiceProvider<Economy> economyProvider = getServer().getServicesManager().getRegistration(net.milkbowl.vault.economy.Economy.class);
	        if (economyProvider != null) {
	            economy = economyProvider.getProvider();
	        }
	        return (economy != null);
	}

}
