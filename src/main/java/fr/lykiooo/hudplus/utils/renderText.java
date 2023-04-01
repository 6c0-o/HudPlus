package fr.lykiooo.hudplus.utils;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;

import static fr.lykiooo.hudplus.HudPlus.client;

public class renderText {
    public static void render(MatrixStack matrixStack, Text text, int x, int y, int color) {
        TextRenderer renderer = client.textRenderer;
        renderer.draw(matrixStack, text, x, y, color);
    }
}

