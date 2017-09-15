package de.qvbe.basics;

import de.qvbe.basics.handler.files.ConfigHandler;
import de.qvbe.basics.handler.files.MessagesHandler;
import de.qvbe.basics.handler.files.PlayerDataHandler;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by luca on 15.09.17.
 */
public class Main extends JavaPlugin {

    private static Main main;

    @Override
    public void onEnable() {
        /* Register main instance */
        main = this;

        /* Register handler */
        new ConfigHandler();
        new MessagesHandler();
        new PlayerDataHandler();

        /* Register listener */

        /* Register commands */

    }

    public static Main get() {
        return main;
    }

}
