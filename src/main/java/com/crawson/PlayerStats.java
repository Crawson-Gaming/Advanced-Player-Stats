package com.crawson;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = PlayerStats.MODID, version = PlayerStats.VERSION)
public class PlayerStats
{
    private static Logger modLogger;

    public static final String MODID = "playerstats";
    public static final String VERSION = "1.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        modLogger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        getModLogger().info("Player Stats is actually initialized!");
    }

    public static Logger getModLogger()
    {
        return modLogger;
    }
}
