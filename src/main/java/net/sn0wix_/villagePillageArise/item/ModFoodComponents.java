package net.sn0wix_.villagePillageArise.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent SWEET_BERRIES_COOKIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.1F).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.6F).build();
    public static final FoodComponent CORN_CHOWDER = new FoodComponent.Builder().hunger(8).saturationModifier(0.6F).build();
    public static final FoodComponent CORN_SEEDS = new FoodComponent.Builder().hunger(1).saturationModifier(0.1F).snack().build();
}
