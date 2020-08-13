# SpigotUtils  

SpigotUtils is library for spigotmc developers by **1vomarek1**.
This library can be used without servers having to add a special plugin.

## Installation

If you wish to use SpigotUtils you can import them with maven.
```xml
<project>
    <repositories>
        <repository>
            <id>1vomarek1</id>
            <url>https://repo.vomarek.com/repository/release/</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>com.vomarek</groupId>
            <artifactId>spigotutils</artifactId>
            <version>1.0.0</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>
</project>
```

## Usage

Titles
```java
Titles.sendTitle(player, "title", "subtitle");
Titles.sendTitle(player, "title", "subtitle", 10, 70, 20);
```
NBT Tags (Supports String, Integer, Double, Float, boolean)
```java
// Setting data
ItemStack itemWithTag = NBTTags.addNBTTag(item, "key", "string");
ItemStack itemWithTag = NBTTags.addNBTTag(item, "key", 1);
ItemStack itemWithTag = NBTTags.addNBTTag(item, "key", true);

// Getting data
String string = NBTTags.getString(item, "key");
Integer integer = NBTTags.getInteger(item, "key");
Boolean bool = NBTTags.getBoolean(item, "key");

```