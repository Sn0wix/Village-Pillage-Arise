package net.sn0wix_.villageAndPillage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.ArmorItem;
import net.sn0wix_.villageAndPillage.VillageAndPillageMain;
import net.sn0wix_.villageAndPillage.block.ModBlocks;
import net.sn0wix_.villageAndPillage.item.custom.ModBattleAxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sn0wix_.villageAndPillage.item.custom.ModMusicDiscItem;
import net.sn0wix_.villageAndPillage.sounds.ModSounds;

public class ModItems {

    public static final Item CITRINE_SHARD = registerItem("citrine_shard",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item SWEET_BERRIES_COOKIE = registerItem("sweet_berries_cookie",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SWEET_BERRIES_COOKIE)));

    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CORN)));

    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_BLOCK ,new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CORN_SEEDS)));

    public static final Item CORN_CHOWDER = registerItem("corn_chowder",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CORN_CHOWDER).maxCount(1)));



    public static final Item WOODEN_BATTLE_AXE = registerItem("wooden_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.BATTLE_AXE_WOOD,11F,-3.5F,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item STONE_BATTLE_AXE = registerItem("stone_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.BATTLE_AXE_STONE,11.5F,-3.5F,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GOLD_BATTLE_AXE = registerItem("golden_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.BATTLE_AXE_GOLD,11F,-3.3F,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item IRON_BATTLE_AXE = registerItem("iron_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.BATTLE_AXE_IRON,13F,-3.4F,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item DIAMOND_BATTLE_AXE = registerItem("diamond_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.BATTLE_AXE_DIAMOND,13.5F,-3.3F,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item NETHERITE_BATTLE_AXE = registerItem("netherite_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.BATTLE_AXE_NETHERITE,14F,-3.3F,new FabricItemSettings().group(ItemGroup.COMBAT).fireproof()));



    public static final Item GOLDEN_CHAINMAIL_HELMET = registerItem("golden_chainmail_helmet",
            new ArmorItem(ModArmorMaterials.GOLDEN_CHAINMAIL, EquipmentSlot.HEAD,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GOLDEN_CHAINMAIL_CHESTPLATE = registerItem("golden_chainmail_chestplate",
            new ArmorItem(ModArmorMaterials.GOLDEN_CHAINMAIL, EquipmentSlot.CHEST,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GOLDEN_CHAINMAIL_LEGGINGS = registerItem("golden_chainmail_leggings",
            new ArmorItem(ModArmorMaterials.GOLDEN_CHAINMAIL, EquipmentSlot.LEGS,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item GOLDEN_CHAINMAIL_BOOTS = registerItem("golden_chainmail_boots",
            new ArmorItem(ModArmorMaterials.GOLDEN_CHAINMAIL, EquipmentSlot.FEET,new FabricItemSettings().group(ItemGroup.COMBAT)));



    public static final Item SHULKER_HELMET = registerItem("shulker_helmet",
            new ArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.HEAD,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item SHULKER_CHESTPLATE = registerItem("shulker_chestplate",
            new ArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.CHEST,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item SHULKER_LEGGINGS = registerItem("shulker_leggings",
            new ArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.LEGS,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item SHULKER_BOOTS = registerItem("shulker_boots",
            new ArmorItem(ModArmorMaterials.SHULKER, EquipmentSlot.FEET,new FabricItemSettings().group(ItemGroup.COMBAT)));




    public static final Item MUSIC_DISC_REVENGE = registerItem("music_disc_revenge",
            new ModMusicDiscItem(15 , ModSounds.REVENGE, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MUSIC_DISC_GILDED = registerItem("music_disc_gilded",
            new ModMusicDiscItem(13 , ModSounds.GILDED, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MUSIC_DISC_GUARDIAN = registerItem("music_disc_guardian",
            new ModMusicDiscItem(12 , ModSounds.GUARDIAN, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MUSIC_DISC_HUSK = registerItem("music_disc_husk",
            new ModMusicDiscItem(11 , ModSounds.HUSK, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MUSIC_DISC_RAIDERS = registerItem("music_disc_raiders",
            new ModMusicDiscItem(10 , ModSounds.RAIDERS, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MUSIC_DISC_SHULKER = registerItem("music_disc_shulker",
            new ModMusicDiscItem(9 , ModSounds.SHULKER, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MUSIC_DISC_THE_ENDER_DRAGON = registerItem("music_disc_the_ender_dragon",
            new ModMusicDiscItem(8 , ModSounds.THE_ENDER_DRAGON, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    public static final Item MUSIC_DISC_THE_WITHER = registerItem("music_disc_the_wither",
            new ModMusicDiscItem(7 , ModSounds.THE_WITHER, new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));




    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VillageAndPillageMain.MOD_ID, name),item);
    }

    public static void registerModItems(){
        VillageAndPillageMain.LOGGER.info("Registering Mod items for " + VillageAndPillageMain.MOD_ID);
    }
}
