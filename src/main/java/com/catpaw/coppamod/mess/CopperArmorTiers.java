package com.catpaw.coppamod.mess;

import com.catpaw.coppamod.CoppaMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public record CopperArmorTiers(String name, int durability, int[] protection, int enchant, SoundEvent equipSound, float toughness, float knockbackresistance, Supplier<Ingredient> repair) implements ArmorMaterial {

    private static final int[] durability_per_slot = new int[]{13,15,16,19};
    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return 0;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.protection[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchant;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repair.get();
    }

    @Override
    public String getName() {
        return CoppaMod.MODID+":"+this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackresistance;
    }
}
