package ru.endlesscode.markitem.misc;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;

/**
 * Created by OsipXD on 22.08.2015.
 * It is part of the MarkItem.
 * Copyright © 2015 «EndlessCode Group»
 */
public class Config {
    private static FileConfiguration config;

    public static void loadConfig(Plugin plugin) {
        File configFile = new File(plugin.getDataFolder(), "config.yml");
        if (!configFile.exists()) {
            plugin.saveDefaultConfig();
        }

        Config.config = YamlConfiguration.loadConfiguration(configFile);
    }

    public static FileConfiguration getConfig() {
        return Config.config;
    }
}
