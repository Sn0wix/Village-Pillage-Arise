package net.sn0wix_.villageAndPillage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.sn0wix_.villageAndPillage.VillageAndPillageMain;
import net.sn0wix_.villageAndPillage.block.ModBlocks;
import net.sn0wix_.villageAndPillage.item.custom.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
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



    public static final Item LAPIS_LAZULI_HELMET = registerItem("lapis_lazuli_helmet",
            new LapisLazuliArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.HEAD ,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item LAPIS_LAZULI_CHESTPLATE = registerItem("lapis_lazuli_chestplate",
            new LapisLazuliArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.CHEST ,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item LAPIS_LAZULI_LEGGINGS = registerItem("lapis_lazuli_leggings",
            new LapisLazuliArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.LEGS ,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item LAPIS_LAZULI_BOOTS = registerItem("lapis_lazuli_boots",
            new LapisLazuliArmorItem(ModArmorMaterials.LAPIS_LAZULI, EquipmentSlot.FEET ,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item LAPIS_LAZULI_SWORD = registerItem("lapis_lazuli_sword",
            new SwordItem(ModToolMaterials.LAPIS_LAZULI,3,-2.4f,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item LAPIS_LAZULI_BATTLE_AXE = registerItem("lapis_lazuli_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.LAPIS_LAZULI_BATTLE_AXE,14f,-3.3f,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item LAPIS_LAZULI_AXE = registerItem("lapis_lazuli_axe",
            new RedstoneAxeItem(ModToolMaterials.LAPIS_LAZULI,5.0f,-3.0f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));

    public static final Item LAPIS_LAZULI_PICKAXE = registerItem("lapis_lazuli_pickaxe",
            new RedstonePickaxeItem(ModToolMaterials.LAPIS_LAZULI,1,-2.8f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));

    public static final Item LAPIS_LAZULI_SHOVEL = registerItem("lapis_lazuli_shovel",
            new ShovelItem(ModToolMaterials.LAPIS_LAZULI,1,-2.8f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));

    public static final Item LAPIS_LAZULI_HOE = registerItem("lapis_lazuli_hoe",
            new RedstoneHoeItem(ModToolMaterials.LAPIS_LAZULI,-4,0.0f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));



    public static final Item REDSTONE_HELMET = registerItem("redstone_helmet",
            new RedstoneArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.HEAD,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item REDSTONE_CHESTPLATE = registerItem("redstone_chestplate",
            new RedstoneArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.CHEST,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item REDSTONE_LEGGINGS = registerItem("redstone_leggings",
            new RedstoneArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.LEGS,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item REDSTONE_BOOTS = registerItem("redstone_boots",
            new RedstoneArmorItem(ModArmorMaterials.REDSTONE, EquipmentSlot.FEET,new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item REDSTONE_SWORD = registerItem("redstone_sword",
            new SwordItem(ModToolMaterials.REDSTONE,3,-2.4f,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item REDSTONE_BATTLE_AXE = registerItem("redstone_battle_axe",
            new ModBattleAxeItem(ModToolMaterials.REDSTONE_BATTLE_AXE,14f,-3.3f,new FabricItemSettings().fireproof().group(ItemGroup.COMBAT)));

    public static final Item REDSTONE_AXE = registerItem("redstone_axe",
            new RedstoneAxeItem(ModToolMaterials.REDSTONE,5.0f,-3.0f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));

    public static final Item REDSTONE_PICKAXE = registerItem("redstone_pickaxe",
            new RedstonePickaxeItem(ModToolMaterials.REDSTONE,1,-2.8f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));

    public static final Item REDSTONE_SHOVEL = registerItem("redstone_shovel",
            new ShovelItem(ModToolMaterials.REDSTONE,1,-2.8f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));

    public static final Item REDSTONE_HOE = registerItem("redstone_hoe",
            new RedstoneHoeItem(ModToolMaterials.REDSTONE,-4,0.0f,new FabricItemSettings().fireproof().group(ItemGroup.TOOLS)));



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
