package xyz.n7mn.dev.dpcplugin.api;

import org.bukkit.Material;

public class ImageBlockData {
    public int x;
    public int z;
    public Material block;

    public ImageBlockData(int x, int z, Material block){
        this.x = x;
        this.z = z;
        this.block = block;
    }
}
