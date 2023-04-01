package fr.lykiooo.hudplus;

import fr.lykiooo.hudplus.client.hudLoader;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class HudPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new hudLoader());
    }
}
