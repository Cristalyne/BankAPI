package org.cristalyneplugin.bankAPI;

import org.bukkit.plugin.java.JavaPlugin;
import org.cristalyneplugin.bankAPI.admin.BankAPI;


public final class Main extends JavaPlugin {

    public static String plugin_name = "§8[§9BankAPI§8] §b";

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getConsoleSender().sendMessage(plugin_name + "Plugin §aStart");

        //Admin commands
        getCommand("bankapi").setExecutor(new BankAPI()); //fini

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        getServer().getConsoleSender().sendMessage(plugin_name + "Plugin §cStop");

    }
}
