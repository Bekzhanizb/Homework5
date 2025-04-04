package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class MarkerFactory {
    private final static Map<String, MarkerStyle> markers = new HashMap<>();

    public static MarkerStyle getMarkerStyle(String icon, String color) {
        String key = icon + ":" + color;
        if (!markers.containsKey(key)) {
            markers.put(key, new MarkerStyle(icon, color));
            System.out.println("Created new icon: " + icon + ", color:" + color);
        }
        return markers.get(key);
    }

    public static int getUniqueStylesCount() {
        return markers.size();
    }
}
