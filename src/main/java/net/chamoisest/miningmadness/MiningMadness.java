package net.chamoisest.miningmadness;

import net.chamoisest.miningmadness.block.ModBlocks;
import net.chamoisest.miningmadness.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiningMadness implements ModInitializer {
	public static final String MOD_ID = "miningmadness";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
