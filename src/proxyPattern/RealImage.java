package proxyPattern;

public class RealImage implements Image {
    private final String fileName;
    private HQImage hqImage;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    public void loadImage() {
        if(hqImage == null) {
            hqImage = new HQImage(fileName);
        }
    }
    @Override
    public void display() {
        if(hqImage == null) {
            loadImage();
        }
        hqImage.display();
    }
}
