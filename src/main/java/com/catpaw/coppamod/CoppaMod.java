package com.catpaw.coppamod;

import com.catpaw.coppamod.mess.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CoppaMod.MODID)
public class CoppaMod {
    public static final String MODID="coppamod";
    public CoppaMod(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.items.register(bus);
    }
}
