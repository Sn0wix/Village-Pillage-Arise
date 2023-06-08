package net.sn0wix_.villagePillageArise.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.sn0wix_.villagePillageArise.item.ModItems;

public class RedstoneArmorItem extends ArmorItem {
    public RedstoneArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient)return;

        BlockPos blockPos = new BlockPos(entity.getPos().getX(), entity.getPos().getY() - 1f, entity.getZ());

        if (isValidBlock(world.getBlockState(blockPos).getBlock()) && hasValidArmorOn(entity)){
//works
        }
    }

    public boolean hasValidArmorOn(Entity entity){
        if (!(entity instanceof LivingEntity))return false;
        boolean passed = true;

        entity.getArmorItems().forEach(itemStack -> {
            Item item = itemStack.getItem();
            if (!isValidArmorItem(item)){
                boolean passed2 = false;
                passed2 = passed;
            }
        });
        return passed;
    }

    private boolean isValidArmorItem(Item item){
        return  item == ModItems.REDSTONE_HELMET || item == ModItems.REDSTONE_CHESTPLATE || item == ModItems.REDSTONE_LEGGINGS || item == ModItems.REDSTONE_BOOTS;
    }

    private boolean isValidBlock(Block block){
        return block == Blocks.REDSTONE_BLOCK || block == Blocks.REDSTONE_ORE || block == Blocks.DEEPSLATE_REDSTONE_ORE;
    }
}
