package net.sn0wix_.villageAndPillage.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.sn0wix_.villageAndPillage.VillageAndPillageMain;
import net.sn0wix_.villageAndPillage.item.custom.ModBattleAxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SWEET_BERRIES_COOKIE = registerItem("sweet_berries_cookie",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SWEET_BERRIES_COOKIE)));

    public static final Item CITRINE_SHARD = registerItem("citrine_shard",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



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


    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VillageAndPillageMain.MODID, name),item);
    }

    public static void registerModItems(){
        VillageAndPillageMain.LOGGER.info("Registering Mod items for " + VillageAndPillageMain.MODID);
    }
}
