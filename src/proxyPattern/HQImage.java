package proxyPattern;

public class HQImage implements Image {
    private final String fileName;

    public HQImage(String fileName) {
        this.fileName = fileName;
        loadImage();
    }
    public void loadImage(){
        System.out.println("Loading image " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + fileName);
    }

}
