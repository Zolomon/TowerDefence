package eda095.project.lobby;

/**
 * Created by zol on 01/04/15.
 */
public class LobbyClientState {
    public boolean isLoggedIn;
    public String username;
    private boolean isRunning;

    public LobbyClientState() {
    }

    public synchronized boolean isRunning() {
        return isRunning;
    }

    public synchronized void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
}