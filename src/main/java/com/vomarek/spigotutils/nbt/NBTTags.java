package com.vomarek.spigotutils.nbt;

import com.vomarek.spigotutils.reflection.Reflection;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;

@SuppressWarnings("ConstantConditions")
public class NBTTags {

    /**
     * With this method you can add NBT Tag data to item. Written with reflection so it should work on all versions.
     *
     * @param item Item you want to add
     * @param key Key under which your data will be added
     * @param value Value you want to add
     * @return Your ItemStack with NBT data added
     */
    @NotNull
    public static ItemStack addNBTTag(@NotNull ItemStack item, @NotNull final String key, @NotNull final String value) {

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
    public static ItemStack addNBTTag(@NotNull ItemStack item, @NotNull final String key, @NotNull final Integer value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setInt = nbtTagCompoundClass.getMethod("setInt", String.class, Integer.class);

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
    public static ItemStack addNBTTag(@NotNull ItemStack item, @NotNull final String key, @NotNull final Double value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setDouble = nbtTagCompoundClass.getMethod("setDouble", String.class, Double.class);

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
    public static ItemStack addNBTTag(@NotNull ItemStack item, @NotNull final String key, @NotNull final Float value) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method asBukkitCopy = craftItemStackClass.getMethod("asBukkitCopy", itemStackClass);

            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");
            final Method setTag = itemStackClass.getMethod("setTag", nbtTagCompoundClass);

            final Method setFloat = nbtTagCompoundClass.getMethod("setFloat", String.class, Float.class);

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
    public static ItemStack addNBTTag(@NotNull ItemStack item, @NotNull final String key, @NotNull final boolean value) {

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
    public static Integer getInteger(@NotNull ItemStack item, @NotNull final String key) {

        try {
            final Class<?> itemStackClass = Reflection.getNMSClass("ItemStack");
            final Class<?> craftItemStackClass = Reflection.getCraftbukkitClass("inventory.CraftItemStack");
            final Class<?> nbtTagCompoundClass = Reflection.getNMSClass("NBTTagCompound");

            final Method asNMSCopy = craftItemStackClass.getMethod("asNMSCopy", ItemStack.class);
            final Method hasTag = itemStackClass.getMethod("hasTag");
            final Method getTag = itemStackClass.getMethod("getTag");

            final Method getInteger = nbtTagCompoundClass.getMethod("getIngeger", String.class);

            final Object nmsItem = asNMSCopy.invoke(null, item);

            if ((boolean) hasTag.invoke(nmsItem)) {
                final Object compound = getTag.invoke(nmsItem);


                return (Integer) getInteger.invoke(compound, key);
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
    public static Double getDouble(@NotNull ItemStack item, @NotNull final String key) {

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


                return (Double) getDouble.invoke(compound, key);
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
    public static Float getFloat(@NotNull ItemStack item, @NotNull final String key) {

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


                return (Float) getFloat.invoke(compound, key);
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
}
