package net.sn0wix_.villageAndPillage.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.util.Identifier;
import net.sn0wix_.villageAndPillage.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier CREEPER_ID = new Identifier("minecraft", "entities/creeper");
    private static final Identifier PIGLIN_BRUTE_ID = new Identifier("minecraft", "entities/piglin_brute");
    private static final Identifier ELDER_GUARDIAN_ID = new Identifier("minecraft", "entities/elder_guardian");
    private static final Identifier HUSK_ID = new Identifier("minecraft", "entities/husk");
    private static final Identifier WITHER_ID = new Identifier("minecraft", "entities/wither");
    private static final Identifier PILLAGER_OUTPOST_ID = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier END_CITY_TREASURE_ID = new Identifier("minecraft", "chests/end_city_treasure");


    public static void modifyLootTables(){
        LootTableLoadingCallback.EVENT.register((((resourceManager, manager, id, supplier, setter) -> {
            if (PIGLIN_BRUTE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_GILDED));
                supplier.withPool(poolBuilder.build());
            }

            if (ELDER_GUARDIAN_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_GUARDIAN));
                supplier.withPool(poolBuilder.build());
            }

            if (HUSK_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_HUSK));
                supplier.withPool(poolBuilder.build());
            }

            if (WITHER_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_THE_WITHER));
                supplier.withPool(poolBuilder.build());
            }

            if (PILLAGER_OUTPOST_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_RAIDERS));
                supplier.withPool(poolBuilder.build());
            }

            if (END_CITY_TREASURE_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.07f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_SHULKER));
                supplier.withPool(poolBuilder.build());

                FabricLootPoolBuilder poolBuilder1 = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_THE_ENDER_DRAGON));
                supplier.withPool(poolBuilder1.build());
            }

            if (CREEPER_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.KILLER, new EntityPredicate.Builder().type(EntityType.CREEPER)))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_REVENGE));
                supplier.withPool(poolBuilder.build());
            }
        })));
    }
}
