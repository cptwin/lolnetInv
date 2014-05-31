package nz.co.lolnet.lolnetinv;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 *
 * @author cptwin
 */
public class EventListener implements Listener {
    
    @EventHandler
    private void playerJoin(PlayerJoinEvent event)
    {
        //clear players inventory and then load it from the api
    }
    
    @EventHandler
    private void playerPickupItem(PlayerPickupItemEvent event)
    {
        //
    }
    
    @EventHandler
    private void playerItemConsume(PlayerItemConsumeEvent event)
    {
        //
    }
    
    @EventHandler
    private void playerItemBreak(PlayerItemBreakEvent event)
    {
        //
    }
    
    @EventHandler
    private void playerDropItem(PlayerDropItemEvent event)
    {
        //
    }
    
    
}
