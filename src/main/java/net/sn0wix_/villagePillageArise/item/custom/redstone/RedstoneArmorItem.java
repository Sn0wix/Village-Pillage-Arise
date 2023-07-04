package net.sn0wix_.villagePillageArise.item.custom.redstone;

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
        if (world.isClient) return;

        BlockPos blockPos = new BlockPos(entity.getPos().getX(), entity.getPos().getY() - 1f, entity.getZ());

        if (isValidBlock(world.getBlockState(blockPos).getBlock()) && hasCorrectArmorOn(entity)) {
            if (stack.getItem().equals(ModItems.REDSTONE_HELMET)){
                stack.getOrCreateNbt().putBoolean("charged", true);
            }
        }
        if (!hasCorrectArmorOn(entity) && stack.getItem().equals(ModItems.REDSTONE_HELMET)){
            stack.getOrCreateNbt().putBoolean("charged", false);
        }
    }


    public boolean hasCorrectArmorOn(Entity entity) {
        if (!(entity instanceof LivingEntity livingEntity)) return false;
        boolean passed = true;

        if (!isValidArmorItem(livingEntity.getEquippedStack(EquipmentSlot.HEAD).getItem())) {
            passed = false;
        } else if (!isValidArmorItem(livingEntity.getEquippedStack(EquipmentSlot.CHEST).getItem())) {
            passed = false;
        } else if (!isValidArmorItem(livingEntity.getEquippedStack(EquipmentSlot.LEGS).getItem())) {
            passed = false;
        } else if (!isValidArmorItem(livingEntity.getEquippedStack(EquipmentSlot.FEET).getItem())){
            passed = false;
        }

        return passed;
    }

    private boolean isValidArmorItem(Item item) {
        return item == ModItems.REDSTONE_HELMET || item == ModItems.REDSTONE_CHESTPLATE || item == ModItems.REDSTONE_LEGGINGS || item == ModItems.REDSTONE_BOOTS;
    }

    private boolean isValidBlock(Block block) {
        return block == Blocks.REDSTONE_BLOCK || block == Blocks.REDSTONE_ORE || block == Blocks.DEEPSLATE_REDSTONE_ORE;
    }
}
