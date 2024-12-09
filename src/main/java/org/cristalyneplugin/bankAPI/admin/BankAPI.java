package org.cristalyneplugin.bankAPI.admin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.cristalyneplugin.bankAPI.Main;
import org.cristalyneplugin.bankAPI.settings.Settings;

public class BankAPI implements CommandExecutor {

    public static Settings plugin_enable = Settings.DISABLE;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (sender instanceof Player player) {

            if (args[0].equalsIgnoreCase("start")) {
                if (plugin_enable == Settings.DISABLE) {

                    plugin_enable = Settings.ENABLE;
                    player.sendMessage(Main.plugin_name + "Plugin §a§lEnable");

                } else {

                    player.sendMessage(Main.plugin_name + "This plugin is already §a§lEnable");

                }
            } else if (args[0].equalsIgnoreCase("stop")) {
                if (plugin_enable == Settings.ENABLE) {

                    plugin_enable = Settings.DISABLE;
                    player.sendMessage(Main.plugin_name + "Plugin §4§lDisable");

                } else {

                    player.sendMessage(Main.plugin_name + "This plugin is already §4§lDisable");

                }
            } else if (args[0].equalsIgnoreCase("info")) {

                player.sendMessage("§7-------- " + Main.plugin_name + "§7 --------\n§7Plugin made by: §bCristalyne\n§7Version: §bv1.0.1\n§7----------------------------");

            } else {
                player.sendMessage(Main.plugin_name + "§cThe correct usage of this command is : §6/bankapi §a§ltrue§6/§4§lfalse");
            }

        } else {

            if (args[0].equalsIgnoreCase("start")) {
                if (plugin_enable == Settings.DISABLE) {

                    plugin_enable = Settings.ENABLE;
                    Bukkit.getConsoleSender().sendMessage(Main.plugin_name + "Plugin §a§lEnable");

                } else {

                    Bukkit.getConsoleSender().sendMessage(Main.plugin_name + "This plugin is already §a§lEnable");

                }
            } else if (args[0].equalsIgnoreCase("stop")) {
                if (plugin_enable == Settings.ENABLE) {

                    plugin_enable = Settings.DISABLE;
                    Bukkit.getConsoleSender().sendMessage(Main.plugin_name + "Plugin §4§lDisable");

                } else {

                    Bukkit.getConsoleSender().sendMessage(Main.plugin_name + "This plugin is already §4§lDisable");

                }
            } else if (args[0].equalsIgnoreCase("info")) {

                Bukkit.getConsoleSender().sendMessage("§7-------- " + Main.plugin_name + "§7 --------\n§7Plugin made by: §bCristalyne\n§7Version: §bv1.0.1\n§7----------------------------");

            } else {
                Bukkit.getConsoleSender().sendMessage(Main.plugin_name + "§cThe correct usage of this command is : §6/bankapi §a§ltrue§6/§4§lfalse");
            }

        }

        return false;
    }
}
