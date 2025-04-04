package proxyPattern;

class ProtectedProxyImage extends RealImage {
    private final Agent agent;

    public ProtectedProxyImage(String filename, Agent agent) {
        super(filename);
        this.agent = agent;
    }

    @Override
    public void display() {
        if (agent.isLoggedIn()) {
            super.display();
        } else {
            System.out.println("Only authorized agents can upload images.");
        }
    }
}