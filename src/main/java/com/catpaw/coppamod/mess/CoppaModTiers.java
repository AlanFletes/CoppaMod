package com.catpaw.coppamod.mess;
import com.catpaw.coppamod.CoppaMod;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum CoppaModTiers implements Tier {
    COPPER_PICKAXE(2,25,20.0F,0.0F,22,()->{
        return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
    }),
    COPPER_SWORD(2,25,20.0F,6,22,()->{
        return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
    })
    ,
    REINFORCEDCOPPER(2,500,6.0F,2.0F,14,()->{
        return Ingredient.of(new ItemStack(ItemInit.templatedCopperIngot.get()));
    }),
    REINFORCEDCOPPER_SWORD(2,500,6.0F,10.0F,14,()->{
        return Ingredient.of(new ItemStack(ItemInit.templatedCopperIngot.get()));
    });
    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;
    private CoppaModTiers(int p_43332_, int p_43333_, float p_43334_, float p_43335_, int p_43336_, Supplier<Ingredient> p_43337_) {
        this.level = p_43332_;
        this.uses = p_43333_;
        this.speed = p_43334_;
        this.damage = p_43335_;
        this.enchantmentValue = p_43336_;
        this.repairIngredient = new LazyLoadedValue<>(p_43337_);
    }
    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
