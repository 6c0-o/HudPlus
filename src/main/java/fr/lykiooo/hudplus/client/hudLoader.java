package fr.lykiooo.hudplus.client;

import fr.lykiooo.hudplus.client.overlay.Coordinates;
import fr.lykiooo.hudplus.client.overlay.GameInformations;
import fr.lykiooo.hudplus.client.overlay.IrlInformations;
import fr.lykiooo.hudplus.utils.renderText;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;

import static fr.lykiooo.hudplus.HudPlus.client;

public class hudLoader implements HudRenderCallback {
    private int i = 0;
    @Override
    public void onHudRender(MatrixStack matrixStack, float tickDelta) {
        i = 0;
        TextRenderer renderer = client.textRenderer;
        int textHeight = renderer.fontHeight;
        int screenWidth = client.getWindow().getScaledWidth(), screenHeight = client.getWindow().getScaledHeight(), padding = 5;
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(client.player == null) return;
            Change();
        });
        renderText.render(matrixStack, Coordinates.main(), padding + 1, (screenHeight - textHeight * (i++ + 1) - padding - 1), -1);
        renderText.render(matrixStack, GameInformations.main(), padding + 1, (screenHeight - textHeight * (i++ + 1) - padding - 1), -1);
        renderText.render(matrixStack, IrlInformations.main(), padding + 1, (screenHeight - textHeight * (i++ + 1) - padding - 1), -1);
    }

    private void Change(){
        Coordinates.main();
        GameInformations.main();
        IrlInformations.main();
    }
}
