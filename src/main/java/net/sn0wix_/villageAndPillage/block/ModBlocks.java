package net.sn0wix_.villageAndPillage.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.sn0wix_.villageAndPillage.VillageAndPillageMain;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.sn0wix_.villageAndPillage.block.custom.*;

public class ModBlocks {
    public static final Block CITRINE_BLOCK = registerBlock("citrine_block",
            new CitrineBlock(FabricBlockSettings.of(Material.AMETHYST).sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.7F).requiresTool()),
            ItemGroup.BUILDING_BLOCKS);


    public static final Block BUDDING_CITRINE = registerBlock("budding_citrine",
            new BuddingCitrineBlock(FabricBlockSettings.of(Material.AMETHYST)
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK).strength(1.7F).requiresTool().ticksRandomly()), ItemGroup.BUILDING_BLOCKS);


    public static final Block CITRINE_CLUSTER = registerBlock("citrine_cluster", new CitrineClusterBlock(7, 3,
            AbstractBlock.Settings.of(Material.AMETHYST).requiresTool().nonOpaque().ticksRandomly()
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER).strength(1.7F).luminance((state) -> 5)), ItemGroup.DECORATIONS);


    public static final Block LARGE_CITRINE_BUD = registerBlock("large_citrine_bud",
            new CitrineClusterBlock(5, 3, AbstractBlock.Settings.copy(CITRINE_CLUSTER)
                    .sounds(BlockSoundGroup.LARGE_AMETHYST_BUD).requiresTool().luminance((state) -> 4)), ItemGroup.DECORATIONS);


    public static final Block MEDIUM_CITRINE_BUD = registerBlock("medium_citrine_bud",
            new CitrineClusterBlock(4, 3, AbstractBlock.Settings.copy(CITRINE_CLUSTER)
                    .sounds(BlockSoundGroup.MEDIUM_AMETHYST_BUD).requiresTool().luminance((blockStatex) -> 2)), ItemGroup.DECORATIONS);


    public static final Block SMALL_CITRINE_BUD = registerBlock("small_citrine_bud",
            new CitrineClusterBlock(3, 4, AbstractBlock.Settings.copy(CITRINE_CLUSTER)
                    .sounds(BlockSoundGroup.SMALL_AMETHYST_BUD).requiresTool().luminance((blockStatex) -> 1)), ItemGroup.DECORATIONS);


    public static final Block GOLDEN_CHAIN_BLOCK = registerBlock("golden_chain",
            new GoldenChainBlock(FabricBlockSettings.of(Material.METAL).requiresTool().nonOpaque()
                    .strength(4.8F, 5.8F).sounds(BlockSoundGroup.CHAIN)), ItemGroup.BUILDING_BLOCKS);

    public static final Block CORN_BLOCK = registerBlockWithoutBlockItem("corn_block",
            new CornBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque().noCollision().breakInstantly()));



    private static Block registerBlock(String name, Block block, ItemGroup group){
        registerBlockItem(name,block,group);
        return Registry.register(Registry.BLOCK, new Identifier(VillageAndPillageMain.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(VillageAndPillageMain.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(VillageAndPillageMain.MOD_ID, name), block);
    }

    public static void registerModBlocks(){
        VillageAndPillageMain.LOGGER.info("Registering Mod blocks for " + VillageAndPillageMain.MOD_ID);
    }
}
