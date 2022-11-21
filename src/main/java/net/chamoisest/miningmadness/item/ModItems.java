package net.chamoisest.miningmadness.item;

import net.chamoisest.miningmadness.MiningMadness;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item SPEED_AUGMENT = registerItem("speed_augment",
            new Item(new FabricItemSettings().group(ModItemGroup.MININGMADNESS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MiningMadness.MOD_ID, name), item);
    }
    public static void registerModItems(){
        MiningMadness.LOGGER.debug("Registering Items for " + MiningMadness.MOD_ID);
    }
}
