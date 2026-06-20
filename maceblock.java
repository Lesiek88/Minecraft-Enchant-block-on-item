package me.lesiek.kit;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;


public class Maceblock implements Listener {
    @EventHandler
    public void onAnvilPrepare(PrepareAnvilEvent event){
        ItemStack first = event.getInventory().getItem(0);

        if (first != null && first.getType() == Material.MACE){
            event.setResult(null);
        }
    }
}
