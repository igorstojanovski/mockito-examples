package org.igorski.junit5.mockito.mockito;

public class ChatEngine {
    private final MessageSender messageSender;

    public ChatEngine(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void say(String message) {
        messageSender.send(message);
    }
}
