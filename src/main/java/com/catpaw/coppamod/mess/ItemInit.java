package com.catpaw.coppamod.mess;

import com.catpaw.coppamod.CoppaMod;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    //Register
    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, CoppaMod.MODID);
    //Items
    public static final RegistryObject<Item> refinedCopperItem = itemRegister.register("refined_copper_item",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> compactCopperItem = itemRegister.register("compact_copper_item",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //Armas
    public static final RegistryObject<SwordItem> copperSword = itemRegister.register("copper_sword",()->new SwordItem(CoppaModTiers.COPPER_SWORD,0,0,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //Herramientas
    public static final RegistryObject<PickaxeItem> copperPickaxe = itemRegister.register("copper_pickaxe",()->new PickaxeItem(CoppaModTiers.COPPER_PICKAXE,0,0,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    //public static final RegistryObject<Item> ex_items = items.register("example",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
