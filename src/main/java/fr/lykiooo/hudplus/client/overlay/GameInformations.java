package fr.lykiooo.hudplus.client.overlay;

import fr.lykiooo.hudplus.utils.format;
import net.minecraft.text.Text;

import static fr.lykiooo.hudplus.HudPlus.client;

public class GameInformations {
    private static long timeOfDay = client.world.getTimeOfDay(), worldDay = timeOfDay / 24000L;
    private static String hourInGame = format.Time((int)((timeOfDay / 1000L + 6) % 24)), minuteInGame = format.Time((int)((timeOfDay % 1000L) * 60L / 1000L));
    public static Text main(){
        timeOfDay = client.world.getTimeOfDay();
        worldDay = timeOfDay / 24000L;

        hourInGame = format.Time((int)((timeOfDay / 1000L + 6) % 24));
        minuteInGame = format.Time((int)((timeOfDay % 1000L) * 60L / 1000L));
        return format.StringToText("§eJours:§f %d (%s:%s)", worldDay, hourInGame, minuteInGame);
    }
    public static void update() {
        timeOfDay = client.world.getTimeOfDay();
        worldDay = timeOfDay / 24000L;

        hourInGame = format.Time((int)((timeOfDay / 1000L + 6) % 24));
        minuteInGame = format.Time((int)((timeOfDay % 1000L) * 60L / 1000L));
    }
}
