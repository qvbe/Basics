package de.qvbe.basics.handler.files;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;

/**
 * Created by luca on 15.09.17.
 */
public class ConfigHandler {

    private static ConfigHandler configHandler;

    private File file = new File("plugins/qBasics", "config.yml");
    private FileConfiguration fileConfiguration = YamlConfiguration.loadConfiguration(file);

    public ConfigHandler() {
        configHandler = this;
    }

    /**
     * Method to get the config.yml file
     * @return config.yml file
     */
    public File getFile() {
        return file;
    }

    /**
     * Method to get the fileconfiguration of the file
     * @return fileconfiguration of config.yml
     */
    public FileConfiguration getFileConfiguration() {
        return fileConfiguration;
    }

    /**
     * Method to get the class instance
     * @return Class instance
     */
    public static ConfigHandler get() {
        return configHandler;
    }

}
