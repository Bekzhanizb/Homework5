package FlyWeightPattern;

public class FlyWeightDemo {
    public static void main(String[] args) {
        MarkerStyle hospitalStyle = MarkerFactory.getMarkerStyle("hospital_icon", "red");
        MarkerStyle restaurantStyle = MarkerFactory.getMarkerStyle("restaurant_icon", "blue");
        MarkerStyle uniStyle = MarkerFactory.getMarkerStyle("university_icon", "green");

        System.out.println();

        Marker marker1 = new Marker(hospitalStyle,"EmirMed", "8-microdistrict, 58a");
        Marker marker2 = new Marker(restaurantStyle, "I'm Restaurant","Aksay-2 microdistrict, 8a");
        Marker marker3 = new Marker(hospitalStyle, "On Clinic","Gabdullin street, 94a");
        Marker marker4 = new Marker(uniStyle, "Narxoz University", "Zhandosov street, 55");

        marker1.display();
        marker2.display();
        marker3.display();
        marker4.display();

        System.out.println("Unique marker styles: " + MarkerFactory.getUniqueStylesCount());
    }
}
