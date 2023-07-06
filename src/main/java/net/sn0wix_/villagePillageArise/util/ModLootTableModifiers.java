package net.sn0wix_.villagePillageArise.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.condition.LootCondition;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;
import net.sn0wix_.villagePillageArise.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier CREEPER_ID = new Identifier("minecraft", "entities/creeper");
    private static final Identifier PIGLIN_BRUTE_ID = new Identifier("minecraft", "entities/piglin_brute");
    private static final Identifier ELDER_GUARDIAN_ID = new Identifier("minecraft", "entities/elder_guardian");
    private static final Identifier HUSK_ID = new Identifier("minecraft", "entities/husk");
    private static final Identifier WITHER_ID = new Identifier("minecraft", "entities/wither");
    private static final Identifier WARDEN_ID = new Identifier("minecraft", "entities/warden");
    private static final Identifier ANCIENT_CITY_ID = new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier BASTION_TREASURE_ID = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BASTION_OTHER_ID = new Identifier("minecraft", "chests/bastion_other");
    private static final Identifier PILLAGER_OUTPOST_ID = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier END_CITY_TREASURE_ID = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier VILLAGE_SAVANNA_HOUSE_ID = new Identifier("minecraft", "chests/village/village_savanna_house");
    private static final Identifier VILLAGE_PLAINS_HOUSE_ID = new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier WOODLAND_MANSION_ID = new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier SHIPWRECK_SUPPLY_ID = new Identifier("minecraft", "chests/shipwreck_supply");
    private static final Identifier ABANDONED_MINESHAFT_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier LAPIS_ORE_ID = new Identifier("minecraft", "blocks/lapis_ore");
    private static final Identifier DEEPSLATE_LAPIS_ORE_ID = new Identifier("minecraft", "blocks/deepslate_lapis_ore");
    private static final Identifier REDSTONE_ORE_ID = new Identifier("minecraft", "blocks/redstone_ore");
    private static final Identifier DEEPSLATE_REDSTONE_ORE_ID = new Identifier("minecraft", "blocks/deepslate_redstone_ore");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {

            if (CREEPER_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.KILLER, new EntityPredicate.Builder().type(EntityType.CREEPER)))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_REVENGE));
                tableBuilder.pool(poolBuilder.build());
            }

            if (PIGLIN_BRUTE_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.1f, ModItems.MUSIC_DISC_BRUTE).build());
            }

            if (ELDER_GUARDIAN_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.15f, ModItems.MUSIC_DISC_GUARDIAN).build());
            }

            if (HUSK_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.05f, ModItems.MUSIC_DISC_HUSK).build());
            }

            if (WITHER_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(1f, ModItems.MUSIC_DISC_THE_WITHER).build());
            }

            if (WARDEN_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.5f, ModItems.MUSIC_DISC_WARDEN_RUN).build());
            }


            if (ANCIENT_CITY_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.15f, ModItems.MUSIC_DISC_SHRIEKER).build());
            }

            if (BASTION_TREASURE_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.35f, ModItems.MUSIC_DISC_GILDED).build());
            }

            if (BASTION_OTHER_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.06f, ModItems.MUSIC_DISC_GILDED).build());
            }

            if (PILLAGER_OUTPOST_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.5f, ModItems.MUSIC_DISC_RAIDERS).build());
            }

            if (END_CITY_TREASURE_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.07f, ModItems.MUSIC_DISC_SHULKER).build());
                tableBuilder.pool(createLootPoolBuilder(0.01f, ModItems.MUSIC_DISC_THE_ENDER_DRAGON).build());
            }

            if (VILLAGE_PLAINS_HOUSE_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.20f, ModItems.CORN).build());
                tableBuilder.pool(createLootPoolBuilder(0.15f, ModItems.CORN_SEEDS).build());
            }

            if (VILLAGE_SAVANNA_HOUSE_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.1f, ModItems.CORN).build());
                tableBuilder.pool(createLootPoolBuilder(0.08f, ModItems.CORN_SEEDS).build());
            }

            if (SHIPWRECK_SUPPLY_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.4f, ModItems.CORN).build());
            }

            if (VILLAGE_PLAINS_HOUSE_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.3f, ModItems.CORN).build());
                tableBuilder.pool(createLootPoolBuilder(0.1f, ModItems.CORN_SEEDS).build());
            }

            if (WOODLAND_MANSION_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.15f, ModItems.CORN).build());
                tableBuilder.pool(createLootPoolBuilder(0.1f, ModItems.CORN_SEEDS).build());
                tableBuilder.pool(createLootPoolBuilder(0.08f, ModItems.MUSIC_DISC_RAIDERS).build());
            }

            if (ABANDONED_MINESHAFT_ID.equals(id)) {
                tableBuilder.pool(createLootPoolBuilder(0.17f, ModItems.CORN).build());
                tableBuilder.pool(createLootPoolBuilder(0.20f, ModItems.CORN_SEEDS).build());
            }

            if (LAPIS_ORE_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.005f))
                        .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.NETHERITE_PICKAXE)))
                        .with(ItemEntry.builder(ModItems.LAPIS_SHARD));
                tableBuilder.pool(poolBuilder).build();
            }

            if (DEEPSLATE_LAPIS_ORE_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.005f))
                        .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.NETHERITE_PICKAXE)))
                        .with(ItemEntry.builder(ModItems.LAPIS_SHARD));
                tableBuilder.pool(poolBuilder).build();
            }

            if (REDSTONE_ORE_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.005f))
                        .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.NETHERITE_PICKAXE)))
                        .with(ItemEntry.builder(ModItems.REDSTONE_SHARD));
                tableBuilder.pool(poolBuilder).build();
            }

            if (DEEPSLATE_REDSTONE_ORE_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.005f))
                        .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(Items.NETHERITE_PICKAXE)))
                        .with(ItemEntry.builder(ModItems.REDSTONE_SHARD));
                tableBuilder.pool(poolBuilder).build();
            }
        });
    }

    private static LootPool.Builder createLootPoolBuilder(float chance, Item item) {
        LootPool.Builder poolBuilder = LootPool.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .with(ItemEntry.builder(item));
        return poolBuilder;
    }
}
