package FlyWeightPattern;

public class Marker {
    private final MarkerStyle markerStyle;
    private final String position;

    public Marker(MarkerStyle markerStyle, String position) {
        this.markerStyle = markerStyle;
        this.position = position;
    }
    public void display() {
        System.out.println("Displaying marker in map: " + position);
        markerStyle.display();
    }
}
