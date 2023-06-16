package net.sn0wix_.villagePillageArise.mixin;

import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.EnchantmentScreenHandler;
import net.sn0wix_.villagePillageArise.item.ModItems;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentScreenHandler.class)
public abstract class LapisArmorEnchantMixin {

    @Shadow @Final private Inventory inventory;

    @Inject(method = "*onButtonClick", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;decrement(I)V"))
    private void injectOnButtonClicked(PlayerEntity player, int id, CallbackInfoReturnable<Boolean> cir){
        ItemStack lapis_equipment = this.inventory.getStack(0);
        ItemStack lapis_lazuli = this.inventory.getStack(1);

        if (isValidItem(lapis_equipment)){
            lapis_lazuli.increment(id + 1);
            int mendingChance = (int) (Math.random() * 100);

            if (mendingChance <= 30 && !lapis_equipment.getEnchantments().contains(Enchantments.MENDING)){
                lapis_equipment.addEnchantment(Enchantments.MENDING, 1);
            }
        }
    }

    public boolean isValidItem(ItemStack itemStack){
        Item item = itemStack.getItem();
        return item == ModItems.LAPIS_LAZULI_HELMET || item == ModItems.LAPIS_LAZULI_CHESTPLATE || item == ModItems.LAPIS_LAZULI_LEGGINGS || item == ModItems.LAPIS_LAZULI_BOOTS
                || item == ModItems.LAPIS_LAZULI_SWORD || item == ModItems.LAPIS_LAZULI_AXE || item == ModItems.LAPIS_LAZULI_BATTLE_AXE || item == ModItems.LAPIS_LAZULI_PICKAXE
                || item == ModItems.LAPIS_LAZULI_HOE || item == ModItems.LAPIS_LAZULI_SHOVEL;
    }
}
