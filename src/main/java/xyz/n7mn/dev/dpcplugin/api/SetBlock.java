package xyz.n7mn.dev.dpcplugin.api;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

import java.util.List;

public class SetBlock {
    /*
    Location location = new Location(getServer().getWorld("world"), 0, 0, 0);
    location.getBlock().setType(Material.AIR);
     */

    public boolean setBlockByVertical(World world,int x, int y, int z, int yaw, List<ImageBlockData> dataList){

        try {
            // System.out.println("yaw : "+yaw);
            if (yaw <= -45 && yaw > -135){
                // System.out.println("east");
                for (ImageBlockData data : dataList){
                    Location loc = new Location(world, x, y - data.z, z + data.x);
                    loc.getBlock().setType(data.block);
                }
            } else if (yaw >= 45 && yaw < 135){
                // System.out.println("west");
                for (ImageBlockData data : dataList){
                    Location loc = new Location(world, x, y - data.z, z - data.x);
                    loc.getBlock().setType(data.block);
                }
            } else if (yaw > -45 && yaw < 45){
                // System.out.println("south");
                for (ImageBlockData data : dataList){
                    Location loc = new Location(world, x - data.x, y - data.z, z);
                    loc.getBlock().setType(data.block);
                }
            } else {
                // System.out.println("north");
                for (ImageBlockData data : dataList){
                    Location loc = new Location(world, x + data.x, y - data.z, z);
                    loc.getBlock().setType(data.block);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }


        return true;
    }

    public boolean setBlockBySide(World world,int x, int y, int z, int yaw, List<ImageBlockData> dataList){
        try {
            for (ImageBlockData data : dataList){
                Location loc = new Location(world, x + data.x, y, z + data.z);
                loc.getBlock().setType(data.block);
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
