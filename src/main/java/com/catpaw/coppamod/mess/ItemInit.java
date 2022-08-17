package com.catpaw.coppamod.mess;

import com.catpaw.coppamod.CoppaMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> items = DeferredRegister.create(ForgeRegistries.ITEMS, CoppaMod.MODID);
    public static final RegistryObject<Item> ex_items = items.register("example",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
