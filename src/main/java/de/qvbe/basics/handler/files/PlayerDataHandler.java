package de.qvbe.basics.handler.files;

/**
 * Created by luca on 15.09.17.
 */
public class PlayerDataHandler {

    private static PlayerDataHandler playerDataHandler;

    public PlayerDataHandler() {
        playerDataHandler = this;
    }

    public static PlayerDataHandler get() {
        return playerDataHandler;
    }

}
