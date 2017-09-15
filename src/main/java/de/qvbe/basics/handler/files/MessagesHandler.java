package de.qvbe.basics.handler.files;

/**
 * Created by luca on 15.09.17.
 */
public class MessagesHandler {

    private static MessagesHandler messagesHandler;

    public MessagesHandler() {
        messagesHandler = this;
    }

    public static MessagesHandler get() {
        return messagesHandler;
    }

}
