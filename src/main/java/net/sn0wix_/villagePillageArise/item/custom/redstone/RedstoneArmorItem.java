package net.sn0wix_.villagePillageArise.item.custom.redstone;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.sn0wix_.villagePillageArise.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RedstoneArmorItem extends ArmorItem {
    public RedstoneArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient) return;
        if (!(entity instanceof LivingEntity livingEntity)) return;

        BlockPos blockPos = new BlockPos(entity.getPos().getX(), entity.getPos().getY() - 1f, entity.getZ());
        if (isValidBlock(world.getBlockState(blockPos).getBlock())) {

            if (isCorrectArmor(livingEntity, stack)) {
                stack.getOrCreateNbt().putInt("Charged", 1);
                spawnParticles(world, blockPos);
                spawnParticles(world, blockPos);
                spawnParticles(world, blockPos);
            }
        }
    }


    public boolean isCorrectArmor(LivingEntity entity, ItemStack itemStack) {
        boolean passed = false;

        if (!isValidArmorItem(itemStack.getItem())) {
            return false;
        }

        if (entity.getEquippedStack(EquipmentSlot.HEAD).equals(itemStack)) {
            passed = true;
        }
        if (entity.getEquippedStack(EquipmentSlot.CHEST).equals(itemStack)) {
            passed = true;
        }
        if (entity.getEquippedStack(EquipmentSlot.LEGS).equals(itemStack)) {
            passed = true;
        }
        if (entity.getEquippedStack(EquipmentSlot.FEET).equals(itemStack)) {
            passed = true;
        }

        return passed;
    }

    private boolean isValidArmorItem(Item item) {
        return item == ModItems.REDSTONE_HELMET || item == ModItems.REDSTONE_CHESTPLATE || item == ModItems.REDSTONE_LEGGINGS || item == ModItems.REDSTONE_BOOTS;
    }

    private boolean isValidBlock(Block block) {
        return block == Blocks.REDSTONE_BLOCK;
    }

    private static void spawnParticles(World world, BlockPos pos) {
        Random random = world.random;
        Direction[] var5 = Direction.values();

        for (Direction direction : var5) {
            BlockPos blockPos = pos.offset(direction);
            if (!world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos)) {
                Direction.Axis axis = direction.getAxis();
                double e = axis == Direction.Axis.X ? 0.5 + 0.5625 * (double) direction.getOffsetX() : (double) random.nextFloat();
                double f = axis == Direction.Axis.Y ? 0.5 + 0.5625 * (double) direction.getOffsetY() : (double) random.nextFloat();
                double g = axis == Direction.Axis.Z ? 0.5 + 0.5625 * (double) direction.getOffsetZ() : (double) random.nextFloat();
                world.addParticle(DustParticleEffect.DEFAULT, (double) pos.getX() + e, (double) pos.getY() + f, (double) pos.getZ() + g, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (stack.getOrCreateNbt().getInt("Charged") == 0) {
            tooltip.add(Text.translatable("item.villagepillagearise.redstone_equipment.tooltip.discharged"));
        } else {
            tooltip.add(Text.translatable("item.villagepillagearise.redstone_equipment.tooltip.charged"));
        }
    }
}
