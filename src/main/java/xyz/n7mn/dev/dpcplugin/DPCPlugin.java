package xyz.n7mn.dev.dpcplugin;

import org.bukkit.plugin.java.JavaPlugin;


public final class DPCPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();

        DPCCommand command = new DPCCommand();
        getCommand("dpc-vertical").setExecutor(command);
        getCommand("dpc-side").setExecutor(command);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
