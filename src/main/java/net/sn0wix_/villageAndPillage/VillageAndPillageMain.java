package net.sn0wix_.villageAndPillage;

import net.fabricmc.api.ModInitializer;
import net.sn0wix_.villageAndPillage.block.ModBlocks;
import net.sn0wix_.villageAndPillage.item.ModItems;
import net.sn0wix_.villageAndPillage.util.ModRegisteries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VillageAndPillageMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger(VillageAndPillageMain.MODID);
	public static final String MODID = "villageandpillage";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModRegisteries.registerModStuffs();
		ModBlocks.registerModBlocks();
	}
}
