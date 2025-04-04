package proxyPattern;

class Agent {
    private final boolean loggedIn;

    public Agent(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
}