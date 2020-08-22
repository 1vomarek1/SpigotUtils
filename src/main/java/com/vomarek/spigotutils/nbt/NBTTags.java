package com.vomarek.spigotutils.nbt;

import com.vomarek.spigotutils.reflection.Reflection;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

/**
 * With this class you can write data to items using NMS.
 */
@SuppressWarnings("ConstantConditions")
public class NBTTags {

    // region Setting Data

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setByte(@NotNull ItemStack item, @NotNull final String key, final byte value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setByte = nbtTagCompoundClass.getMethod("setByte", String.class, byte.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setByte.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | NullPointerException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setShort(@NotNull ItemStack item, @NotNull final String key, final short value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setShort = nbtTagCompoundClass.getMethod("setShort", String.class, short.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setShort.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | NullPointerException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setInt(@NotNull ItemStack item, @NotNull final String key, final int value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setInt = nbtTagCompoundClass.getMethod("setInt", String.class, int.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setInt.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setLong(@NotNull ItemStack item, @NotNull final String key, final long value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setLong = nbtTagCompoundClass.getMethod("setLong", String.class, long.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setLong.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setFloat(@NotNull ItemStack item, @NotNull final String key, final float value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setFloat = nbtTagCompoundClass.getMethod("setFloat", String.class, float.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setFloat.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setDouble(@NotNull ItemStack item, @NotNull final String key, final double value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setDouble = nbtTagCompoundClass.getMethod("setDouble", String.class, double.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setDouble.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setString(@NotNull ItemStack item, @NotNull final String key, @NotNull final String value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setString = nbtTagCompoundClass.getMethod("setString", String.class, String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setString.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | NullPointerException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setByteArray(@NotNull ItemStack item, @NotNull final String key, final byte[] value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setByteArray = nbtTagCompoundClass.getMethod("setByteArray", String.class, byte[].class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setByteArray.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | NullPointerException ignored) { }


        return item;
    }

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setIntArray(@NotNull ItemStack item, @NotNull final String key, final int[] value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setIntArray = nbtTagCompoundClass.getMethod("setIntArray", String.class, int[].class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setIntArray.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | NullPointerException ignored) { }


        return item;
    }


    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack setBoolean(@NotNull ItemStack item, @NotNull final String key, final boolean value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setBoolean = nbtTagCompoundClass.getMethod("setBoolean", String.class, boolean.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            Object compound;

            if ((boolean) hasTag.invoke(nmsItem)) {
                compound = getTag.invoke(nmsItem);
            } else {
                compound = nbtTagCompoundClass.newInstance();
            }

            setBoolean.invoke(compound, key, value);

            setTag.invoke(nmsItem, compound);

            item = (ItemStack) asBukkitCopy.invoke(null, nmsItem);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException ignored) { }


        return item;
    }

    // endregion
    // region Getting Data

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    public static byte getByte(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getByte = nbtTagCompoundClass.getMethod("getByte", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (byte) getByte.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return 0;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    public static short getShort(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getShort = nbtTagCompoundClass.getMethod("getShort", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (short) getShort.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return 0;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    public static int getInt(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getInt = nbtTagCompoundClass.getMethod("getInt", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (int) getInt.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return 0;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    public static long getLong(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getLong = nbtTagCompoundClass.getMethod("getLong", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (long) getLong.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return 0;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    public static float getFloat(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getFloat = nbtTagCompoundClass.getMethod("getFloat", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (float) getFloat.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return 0;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    public static double getDouble(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getDouble = nbtTagCompoundClass.getMethod("getDouble", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (double) getDouble.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return 0;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    @Nullable
    public static String getString(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getString = nbtTagCompoundClass.getMethod("getString", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (String) getString.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return null;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    @Nullable
    public static byte[] getByteArray(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getByteArray = nbtTagCompoundClass.getMethod("getByteArray", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (byte[]) getByteArray.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return null;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be null.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */
    @Nullable
    public static int[] getIntArray(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getIntArray = nbtTagCompoundClass.getMethod("getIntArray", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (int[]) getIntArray.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }


        return null;
    }

    /**
     * Get NBT data from Item. Written with reflection so it should work on all versions.
     * If there is no data saved under your key result will be false.
     *
     * @param item Item you want to get data from
     * @param key Key under which data you are trying to get is saved
     * @return NBT data from Item
     */

    public static boolean getBoolean(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getBoolean = nbtTagCompoundClass.getMethod("getBoolean", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (boolean) getBoolean.invoke(compound, key);
            }

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | ClassCastException ignored) { }

        return false;
    }

    // endregion

}
