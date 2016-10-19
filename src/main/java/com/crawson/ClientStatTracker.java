package com.crawson;

import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Falken on 10/19/2016.
 */
public class ClientStatTracker extends StatTracker{
    @Override
    public void jumpEventListen(LivingEvent.LivingJumpEvent event) {
        if(FMLCommonHandler.instance().getEffectiveSide()==Side.CLIENT) countJump(event);
    }
}
