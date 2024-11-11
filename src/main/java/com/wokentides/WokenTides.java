package com.wokentides;

import com.wokentides.init.BlockInit;
import com.wokentides.init.ItemInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WokenTides implements ModInitializer {
	public static final String MOD_ID = "wokentides";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ItemInit.load();
		BlockInit.load();
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}