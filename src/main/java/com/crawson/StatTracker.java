package com.crawson;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Falken on 10/19/2016.
 */
public class StatTracker {

    public static StatTracker INSTANCE = new StatTracker();

    private Map<EntityPlayer,Long> jumpCounter = new HashMap<>();

    private StatTracker(){}

    @SubscribeEvent
    public void countJump(LivingEvent.LivingJumpEvent event)
    {
        if(event.getEntityLiving() instanceof EntityPlayer)
        {
            EntityPlayer player = (EntityPlayer)event.getEntityLiving();
            long counter =0;
            if(jumpCounter.containsKey(player)) {
                counter = jumpCounter.get(player);
            }
            jumpCounter.put(player,++counter);
            PlayerStats.getModLogger().info("Player "+player.getDisplayNameString()+" jumped "+counter+" times.");
        }
    }
}
