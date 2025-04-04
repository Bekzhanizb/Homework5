package FlyWeightPattern;

public class Marker {
    private final MarkerStyle markerStyle;
    private final String name;
    private final String position;

    public Marker(MarkerStyle markerStyle, String name, String position) {
        this.markerStyle = markerStyle;
        this.name = name;
        this.position = position;
    }
    public void display() {
        System.out.println("Displaying: " + name + ", in map: " + position+"\n");
        markerStyle.display();
    }
}
