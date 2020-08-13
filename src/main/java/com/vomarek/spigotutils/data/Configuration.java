package com.vomarek.spigotutils.data;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;

public class Configuration extends YamlConfiguration {
    private final JavaPlugin plugin;
    private final File file;
    private final String name;

    /**
     * This constructor creates a new configuration object
     * and if your plugin does have default version of your
     * configuration and if your configuration is empty it will create new one.
     *
     * @param name Name of your file without .yml
     * @param plugin Plugin in which's plugin folder your configuration will be saved
     */
    public Configuration(@NotNull final String name, @NotNull final JavaPlugin plugin) {
        this.name = name;
        this.plugin = plugin;

        this.file = new File(plugin.getDataFolder(), name+".yml");

        try {

            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }

            super.load(file);

            if (isEmpty()) {

                if (plugin.getResource(file.getName()) == null) return;

                plugin.saveResource(name+".yml", true);
                super.load(file);

            }

        } catch (final IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }

    }

    /**
     * Save data that has been set {@link Configuration#set(String, Object)}
     * or removed but hasn't been saved yet.
     */
    public void save() {
        try {
            super.save(file);
        } catch (IOException ignored) {}
    }

    /**
     * Save default version of configuration.
     *
     * @param replace Should current configuration be overwritten with default one?
     */
    public void saveDefault(final boolean replace) {
        try {

            plugin.saveResource(name + ".yml", true);
            super.load(file);

        } catch (final InvalidConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get whether configuration is empty or not. Comments are ignored.
     *
     * @return boolean whether configuration is empty or not
     */
    public boolean isEmpty() {
        return super.getConfigurationSection("").getKeys(true).isEmpty();
    }

    /**
     * Reload configuration
     */
    public void reload() {
        try {

            super.load(file);

        } catch (final InvalidConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }
}
