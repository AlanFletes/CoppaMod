package com.catpaw.coppamod.mess;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.client.event.ScreenEvent;

public class ArmorTiers {
    public static final CopperArmorTiers COPPER = new CopperArmorTiers("COPPER",500,new int[]{20,14,15,10},20, SoundEvents.ARMOR_EQUIP_IRON,0,0, ()->Ingredient.of(new ItemStack(Items.COPPER_INGOT)));
}
