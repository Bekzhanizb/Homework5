package proxyPattern;

public class ProxyDemo {
    public static void main(String[] args) {
        Agent agent = new Agent(true);
        Image image = new ProtectedProxyImage("new_property.jpg", agent);
        image.display();
    }
}