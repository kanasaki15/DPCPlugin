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

    public boolean setBlockByVertical(World world,int x, int y, int z, List<ImageBlockData> dataList){

        try {
            for (ImageBlockData data : dataList){
                Location loc = new Location(world, x, y - data.z, z + data.x);
                loc.getBlock().setType(data.block);
            }
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }


        return true;
    }

    public boolean setBlockBySide(World world,int x, int y, int z, List<ImageBlockData> dataList){
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
