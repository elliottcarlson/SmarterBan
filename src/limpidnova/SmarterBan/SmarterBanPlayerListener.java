package limpidnova.SmarterBan;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Handle events for all Player related events
 *
 * @author limpidnova
 */
public class SmarterBanPlayerListener extends PlayerListener {
    private final SmarterBan plugin;

    public SmarterBanPlayerListener(SmarterBan instance) {
        plugin = instance;
    }

    //Insert Player related code here
}

