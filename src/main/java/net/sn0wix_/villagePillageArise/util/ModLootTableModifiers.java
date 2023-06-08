package net.sn0wix_.villagePillageArise.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.loot.condition.EntityPropertiesLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.entity.EntityPredicate;
import net.minecraft.util.Identifier;
import net.sn0wix_.villagePillageArise.item.ModItems;

public class ModLootTableModifiers {
    private static final Identifier CREEPER_ID = new Identifier("minecraft", "entities/creeper");
    private static final Identifier PIGLIN_BRUTE_ID = new Identifier("minecraft", "entities/piglin_brute");
    private static final Identifier ELDER_GUARDIAN_ID = new Identifier("minecraft", "entities/elder_guardian");
    private static final Identifier HUSK_ID = new Identifier("minecraft", "entities/husk");
    private static final Identifier WITHER_ID = new Identifier("minecraft", "entities/wither");
    private static final Identifier PILLAGER_OUTPOST_ID = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier END_CITY_TREASURE_ID = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier VILLAGE_SAVANNA_HOUSE_ID = new Identifier("minecraft", "chests/village/village_savanna_house");
    private static final Identifier VILLAGE_PLAINS_HOUSE_ID = new Identifier("minecraft", "chests/village/village_plains_house");
    private static final Identifier WOODLAND_MANSION_ID = new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier SHIPWRECK_SUPPLY_ID = new Identifier("minecraft", "chests/shipwreck_supply");
    private static final Identifier ABANDONED_MINESHAFT_ID = new Identifier("minecraft", "chests/abandoned_mineshaft");


    public static void modifyLootTables(){
        LootTableLoadingCallback.EVENT.register((((resourceManager, manager, id, supplier, setter) -> {
            if (PIGLIN_BRUTE_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.1f, ModItems.MUSIC_DISC_GILDED).build());
            }

            if (ELDER_GUARDIAN_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.15f, ModItems.MUSIC_DISC_GUARDIAN).build());
            }

            if (HUSK_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.05f, ModItems.MUSIC_DISC_HUSK).build());
            }

            if (WITHER_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(1f, ModItems.MUSIC_DISC_THE_WITHER).build());
            }

            if (PILLAGER_OUTPOST_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.5f, ModItems.MUSIC_DISC_RAIDERS).build());
            }

            if (END_CITY_TREASURE_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.07f, ModItems.MUSIC_DISC_SHULKER).build());
                supplier.withPool(createLootPoolBuilder(0.01f, ModItems.MUSIC_DISC_THE_ENDER_DRAGON).build());
            }

            if (CREEPER_ID.equals(id)){
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(EntityPropertiesLootCondition.builder(LootContext.EntityTarget.KILLER, new EntityPredicate.Builder().type(EntityType.CREEPER)))
                        .with(ItemEntry.builder(ModItems.MUSIC_DISC_REVENGE));
                supplier.withPool(poolBuilder.build());
            }

            if (VILLAGE_PLAINS_HOUSE_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.20f, ModItems.CORN).build());
                supplier.withPool(createLootPoolBuilder(0.15f, ModItems.CORN_SEEDS).build());
            }

            if (VILLAGE_SAVANNA_HOUSE_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.1f, ModItems.CORN).build());
                supplier.withPool(createLootPoolBuilder(0.08f, ModItems.CORN_SEEDS).build());
            }

            if (SHIPWRECK_SUPPLY_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.4f, ModItems.CORN).build());
            }

            if (VILLAGE_PLAINS_HOUSE_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.3f, ModItems.CORN).build());
                supplier.withPool(createLootPoolBuilder(0.1f, ModItems.CORN_SEEDS).build());
            }

            if (WOODLAND_MANSION_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.15f, ModItems.CORN).build());
                supplier.withPool(createLootPoolBuilder(0.1f, ModItems.CORN_SEEDS).build());
            }

            if (ABANDONED_MINESHAFT_ID.equals(id)){
                supplier.withPool(createLootPoolBuilder(0.17f, ModItems.CORN).build());
                supplier.withPool(createLootPoolBuilder(0.20f, ModItems.CORN_SEEDS).build());
            }
        })));
    }

    private static FabricLootPoolBuilder createLootPoolBuilder(float chance, Item item){
        FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                .rolls(ConstantLootNumberProvider.create(1))
                .conditionally(RandomChanceLootCondition.builder(chance))
                .with(ItemEntry.builder(item));
        return poolBuilder;
    }
}
