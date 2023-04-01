package fr.lykiooo.hudplus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HudPlus implements ModInitializer {
	public static final String MOD_ID = "hudplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initialisation du mod en cours..");
	}
}
