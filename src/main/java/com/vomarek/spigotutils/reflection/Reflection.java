package com.vomarek.spigotutils.reflection;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Reflection {

    /**
     * Get NMS class
     * @param name Name of the class
     * @return Class
     */
    @Nullable
    public static Class<?> getNMSClass(@NotNull final String name) {
        try {
            return Class.forName("net.minecraft.server." + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get Craftbukkit class
     * @param name Name of the class
     * @return Class
     */
    @Nullable
    public static Class<?> getCraftbukkitClass(@NotNull final String name) {
        try {
            return Class.forName("org.bukkit.craftbukkit." + Bukkit.getServer().getClass().getPackage().getName().split("\\.")[3] + "." + name);
        }
        catch(ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Send packet to player
     * @param player Player you want to send packet to
     * @param packet Packet that will be sent to player
     */
    public static void sendPacket(@NotNull final Player player, @NotNull final Object packet) {
        try {
            final Object handle = player.getClass().getMethod("getHandle").invoke(player);
            final Object playerConnection = handle.getClass().getField("playerConnection").get(handle);
            playerConnection.getClass().getMethod("sendPacket", getNMSClass("Packet")).invoke(playerConnection, packet);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
