package eda095.project.server.lobby.messages;

import eda095.project.server.lobby.LobbyConnection;

public class Message {
    protected String message;

    private LobbyConnection connection;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() { 
        return message;
    }
    public String messageToString() {
        return message;
    }
    public String toString() {
        return messageToString(); 
    }

    public LobbyConnection getConnection() {
        return connection;
    }

    public void setConnection(LobbyConnection connection) {
        this.connection = connection;
    }
}
