package com.catpaw.coppamod.mess;

import com.catpaw.coppamod.CoppaMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    //Register
    public static final DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, CoppaMod.MODID);
    //Items
    public static final RegistryObject<Item> templatedCopperIngot = itemRegister.register("templated_copper_ingot",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item> compactCopperball = itemRegister.register("compact_copper_ball",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    //Armas
    public static final RegistryObject<SwordItem> copperSword = itemRegister.register("copper_sword",()->new SwordItem(CoppaModTiers.COPPER_SWORD,0,0,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //Herramientas
    public static final RegistryObject<PickaxeItem> copperPickaxe = itemRegister.register("copper_pickaxe",()->new PickaxeItem(CoppaModTiers.COPPER_PICKAXE,0,0,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<AxeItem> copperAxe = itemRegister.register("copper_axe",()->new AxeItem(CoppaModTiers.COPPER_PICKAXE,0,0,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<HoeItem> copperHoe = itemRegister.register("copper_hoe",()->new HoeItem(CoppaModTiers.COPPER_PICKAXE,0,0,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<ShovelItem> copperShovel = itemRegister.register("copper_shovel",()->new ShovelItem(CoppaModTiers.COPPER_PICKAXE,0,0,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    //Armadura
    public static final RegistryObject<ArmorItem> copperHelmet = itemRegister.register("copper_helmet",()->new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.HEAD,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> copperChestplate = itemRegister.register("copper_chestplate",()->new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.CHEST,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> copperLeggins = itemRegister.register("copper_leggins",()->new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.LEGS,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> copperBoots = itemRegister.register("copper_boots",()->new ArmorItem(ArmorTiers.COPPER, EquipmentSlot.FEET,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //MISC
    //public static final RegistryObject<HorseArmorItem> copper_horse_armor = itemRegister.register("copper_horse_armor",()->new HorseArmorItem());
    //public static final RegistryObject<Item> ex_items = items.register("example",()->new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
