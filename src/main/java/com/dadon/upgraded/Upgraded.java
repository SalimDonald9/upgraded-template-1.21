package com.dadon.upgraded;

import com.dadon.upgraded.block.ModBlocks;
import com.dadon.upgraded.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Upgraded implements ModInitializer {
	public static final String MOD_ID = "upgraded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}