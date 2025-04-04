package FlyWeightPattern;

public class MarkerStyle {
    private final String icon;
    private final String color;
    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }
    public void display() {
        System.out.println("Icon: " + icon+" Color: " + color);
    }
}
