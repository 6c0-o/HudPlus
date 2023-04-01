package fr.lykiooo.hudplus.client.overlay;

import fr.lykiooo.hudplus.utils.format;
import net.minecraft.text.Text;
import net.minecraft.world.dimension.DimensionTypes;

import static fr.lykiooo.hudplus.HudPlus.client;

public class Coordinates {
    private static int x = 0, y = 0, z = 0;
    private static int xNether = x / 8, yNether = y, zNether = z / 8;
    public static Text main(){
        x = (int)client.player.getX();
        y = (int)client.player.getY();
        z = (int)client.player.getZ();
        xNether = x / 8;
        yNether = y;
        zNether = z / 8;
        Text text = null;
        if (client.world.getDimensionKey() == DimensionTypes.OVERWORLD) {
            text = format.StringToText("§6XYZ:§f %d %d %d (§c%d %d %d§f)", x, y, z, xNether, yNether, zNether);
        } else if (client.world.getDimensionKey() == DimensionTypes.THE_NETHER) {
            text = format.StringToText("§6XYZ:§f %d %d %d (§a%d %d %d§f)", x, y, z, x * 8, y, z * 8);
        } else if (client.world.getDimensionKey() == DimensionTypes.THE_END){
            text = format.StringToText("§6XYZ:§f %d %d %d", x, y, z);
        }
        return text;
    }

    public void update() {
        x = (int)client.player.getX();
        y = (int)client.player.getY();
        z = (int)client.player.getZ();
    }
}
