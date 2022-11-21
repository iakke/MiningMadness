package net.chamoisest.miningmadness.item;

import net.chamoisest.miningmadness.MiningMadness;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MININGMADNESS = FabricItemGroupBuilder.build(
            new Identifier(MiningMadness.MOD_ID, "miningmadness"), () -> new ItemStack(ModItems.SPEED_AUGMENT));
}
