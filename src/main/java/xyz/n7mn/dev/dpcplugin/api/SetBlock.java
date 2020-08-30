package xyz.n7mn.dev.dpcplugin.api;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class SetBlock {
    /*
    Location location = new Location(getServer().getWorld("world"), 0, 0, 0);
    location.getBlock().setType(Material.AIR);
     */

    public boolean setBlockByVertical(World world, int x, int y, int z, float yaw, List<ImageBlockData> dataList){

        try {
            Plugin plugin = Bukkit.getPluginManager().getPlugin("DPCPlugin");
            for (ImageBlockData data : dataList){
                new BukkitRunnable() {
                    @Override
                    public void run() {
                        // System.out.println("yaw : "+yaw);
                        if (yaw < -45.0 && yaw >= -135.0) {
                            // System.out.println("east");
                            Location loc = new Location(world, x, y - data.z, z + data.x);
                            loc.getBlock().setType(data.block);
                        } else if (yaw >= 45.0 && yaw < 135.0) {
                            // System.out.println("west");
                            Location loc = new Location(world, x, y - data.z, z - data.x);
                            loc.getBlock().setType(data.block);
                        } else if (yaw > -45.0 && yaw < 45.0) {
                            // System.out.println("south");
                            Location loc = new Location(world, x - data.x, y - data.z, z);
                            loc.getBlock().setType(data.block);
                        } else {
                            // System.out.println("north");
                            Location loc = new Location(world, x + data.x, y - data.z, z);
                            loc.getBlock().setType(data.block);
                        }
                    }
                }.runTaskLater(plugin, 2L);
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }


        return true;
    }

    public boolean setBlockBySide(World world,int x, int y, int z, float yaw, List<ImageBlockData> dataList){
        Plugin plugin = Bukkit.getPluginManager().getPlugin("DPCPlugin");
        try {

            // System.out.println("yaw : " + yaw);
            // return true;

            for (ImageBlockData data : dataList){
                // System.out.println("yaw : " + yaw);
                if (yaw < -45.0 && yaw >= -135.0) {
                    System.out.println("east");
                    new BukkitRunnable(){
                        @Override
                        public void run() {
                            Location loc = new Location(world, x - data.z, y, z + data.x);
                            loc.getBlock().setType(data.block);
                        }
                    }.runTaskLater(plugin, 2L);
                } else if (yaw >= 45.0 && yaw < 135.0){
                    // System.out.println("west");
                    new BukkitRunnable(){
                        @Override
                        public void run() {
                            Location loc = new Location(world, x + data.z, y, z - data.x);
                            loc.getBlock().setType(data.block);
                        }
                    }.runTaskLater(plugin, 2L);
                } else if (yaw > -45.0 && yaw < 45.0) {
                    // System.out.println("south");
                    new BukkitRunnable(){
                        @Override
                        public void run() {
                            Location loc = new Location(world, x - data.x, y, z - data.z);
                            loc.getBlock().setType(data.block);
                        }
                    }.runTaskLater(plugin, 2L);
                } else {
                    // System.out.println("north");
                    new BukkitRunnable(){
                        @Override
                        public void run() {
                            Location loc = new Location(world, x + data.x, y, z + data.z);
                            loc.getBlock().setType(data.block);
                        }
                    }.runTaskLater(plugin, 2L);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
