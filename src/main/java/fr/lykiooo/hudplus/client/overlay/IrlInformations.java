package fr.lykiooo.hudplus.client.overlay;

import fr.lykiooo.hudplus.utils.format;
import net.minecraft.text.Text;

import java.time.LocalTime;

public class IrlInformations {
    private static LocalTime timeIrl = LocalTime.now();
    private static String hourIrl = format.Time(timeIrl.getHour()), minuteIrl = format.Time(timeIrl.getMinute());
    public static Text main(){
        timeIrl = LocalTime.now();

        hourIrl = format.Time(timeIrl.getHour());
        minuteIrl = format.Time(timeIrl.getMinute());

        return format.StringToText("§eIrl:§f %s:%s", hourIrl, minuteIrl);
    }

    public void update() {
        timeIrl = LocalTime.now();

        hourIrl = format.Time(timeIrl.getHour());
        minuteIrl = format.Time(timeIrl.getMinute());
    }
}
