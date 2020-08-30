package xyz.n7mn.dev.dpcplugin.api;

import jdk.nashorn.internal.ir.Block;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockColor {
    Material BlockType;
    int Red;
    int Green;
    int Blue;

    public BlockColor(Material blockType, int red, int green, int blue) {
        this.BlockType = blockType;
        this.Red = red;
        this.Green = green;
        this.Blue = blue;
    }

    public static List<BlockColor> getBlockColorList(){

        List<BlockColor> blockColorList = new ArrayList<>();

        blockColorList.add(new BlockColor(Material.OAK_PLANKS,156,126,75));
        blockColorList.add(new BlockColor(Material.SPRUCE_PLANKS,110,81,46));
        blockColorList.add(new BlockColor(Material.BIRCH_PLANKS,183,167,115));
        blockColorList.add(new BlockColor(Material.JUNGLE_PLANKS,154,111,77));
        blockColorList.add(new BlockColor(Material.ACACIA_PLANKS,160,86,47));
        blockColorList.add(new BlockColor(Material.DARK_OAK_PLANKS,64,41,19));
        blockColorList.add(new BlockColor(Material.CRIMSON_PLANKS,97,46,67));
        blockColorList.add(new BlockColor(Material.WARPED_PLANKS,41,101,96));
        blockColorList.add(new BlockColor(Material.STRIPPED_OAK_WOOD,175,142,85));
        blockColorList.add(new BlockColor(Material.STRIPPED_SPRUCE_WOOD,114,87,51));
        blockColorList.add(new BlockColor(Material.STRIPPED_BIRCH_WOOD,192,172,116));
        blockColorList.add(new BlockColor(Material.STRIPPED_JUNGLE_WOOD,166,128,82));
        blockColorList.add(new BlockColor(Material.STRIPPED_ACACIA_WOOD,171,90,58));
        blockColorList.add(new BlockColor(Material.STRIPPED_DARK_OAK_WOOD,95,74,48));
        blockColorList.add(new BlockColor(Material.STRIPPED_CRIMSON_HYPHAE,133,55,88));
        blockColorList.add(new BlockColor(Material.STRIPPED_WARPED_HYPHAE,56,147,144));
        blockColorList.add(new BlockColor(Material.OAK_WOOD,104,81,48));
        blockColorList.add(new BlockColor(Material.SPRUCE_WOOD,56,36,16));
        blockColorList.add(new BlockColor(Material.BIRCH_WOOD,210,208,204));
        blockColorList.add(new BlockColor(Material.JUNGLE_WOOD,82,65,24));
        blockColorList.add(new BlockColor(Material.ACACIA_WOOD,99,93,83));
        blockColorList.add(new BlockColor(Material.DARK_OAK_WOOD,57,44,25));
        blockColorList.add(new BlockColor(Material.CRIMSON_HYPHAE,89,24,28));
        blockColorList.add(new BlockColor(Material.WARPED_HYPHAE,55,56,74));
        blockColorList.add(new BlockColor(Material.WHITE_WOOL,228,225,226));
        blockColorList.add(new BlockColor(Material.ORANGE_WOOL,229,113,18));
        blockColorList.add(new BlockColor(Material.MAGENTA_WOOL,181,65,172));
        blockColorList.add(new BlockColor(Material.LIGHT_BLUE_WOOL,55,167,207));
        blockColorList.add(new BlockColor(Material.YELLOW_WOOL,287,189,37));
        blockColorList.add(new BlockColor(Material.LIME_WOOL,107,177,24));
        blockColorList.add(new BlockColor(Material.PINK_WOOL,227,135,164));
        blockColorList.add(new BlockColor(Material.GRAY_WOOL,59,65,68));
        blockColorList.add(new BlockColor(Material.LIGHT_GRAY_WOOL, 135,135,128));
        blockColorList.add(new BlockColor(Material.CYAN_WOOL,20,131,138));
        blockColorList.add(new BlockColor(Material.PURPLE_WOOL,116,40,164));
        blockColorList.add(new BlockColor(Material.BLUE_WOOL,50,54,150));
        blockColorList.add(new BlockColor(Material.BROWN_WOOL,109,68,38));
        blockColorList.add(new BlockColor(Material.GREEN_WOOL,81,105,26));
        blockColorList.add(new BlockColor(Material.RED_WOOL,158,37,33));
        blockColorList.add(new BlockColor(Material.BLACK_WOOL,20,20,24));
        blockColorList.add(new BlockColor(Material.WHITE_TERRACOTTA,200,170,154));
        blockColorList.add(new BlockColor(Material.ORANGE_TERRACOTTA,154,80,36));
        blockColorList.add(new BlockColor(Material.MAGENTA_TERRACOTTA,142,84,104));
        blockColorList.add(new BlockColor(Material.LIGHT_BLUE_TERRACOTTA,108,104,131));
        blockColorList.add(new BlockColor(Material.YELLOW_TERRACOTTA,178,126,34));
        blockColorList.add(new BlockColor(Material.LIME_TERRACOTTA,99,112,50));
        blockColorList.add(new BlockColor(Material.PINK_TERRACOTTA,154,74,75));
        blockColorList.add(new BlockColor(Material.GRAY_TERRACOTTA,54,40,34));
        blockColorList.add(new BlockColor(Material.LIGHT_GRAY_TERRACOTTA, 128,102,93));
        blockColorList.add(new BlockColor(Material.CYAN_TERRACOTTA,82,87,87));
        blockColorList.add(new BlockColor(Material.PURPLE_TERRACOTTA,113,66,82));
        blockColorList.add(new BlockColor(Material.BLUE_TERRACOTTA,70,56,87));
        blockColorList.add(new BlockColor(Material.BROWN_TERRACOTTA,73,48,34));
        blockColorList.add(new BlockColor(Material.GREEN_TERRACOTTA,72,79,39));
        blockColorList.add(new BlockColor(Material.RED_TERRACOTTA,136,58,44));
        blockColorList.add(new BlockColor(Material.BLACK_TERRACOTTA,35,22,15));
        blockColorList.add(new BlockColor(Material.TERRACOTTA,145,89,64));
        blockColorList.add(new BlockColor(Material.WHITE_CONCRETE,198,203,204));
        blockColorList.add(new BlockColor(Material.ORANGE_CONCRETE,214,93,0));
        blockColorList.add(new BlockColor(Material.MAGENTA_TERRACOTTA,161,45,152));
        blockColorList.add(new BlockColor(Material.LIGHT_BLUE_CONCRETE,34,130,190));
        blockColorList.add(new BlockColor(Material.YELLOW_CONCRETE,230,167,20));
        blockColorList.add(new BlockColor(Material.LIME_CONCRETE,90,161,23));
        blockColorList.add(new BlockColor(Material.PINK_CONCRETE,203,96,136));
        blockColorList.add(new BlockColor(Material.GRAY_CONCRETE,51,54,58));
        blockColorList.add(new BlockColor(Material.LIGHT_GRAY_CONCRETE, 120,120,110));
        blockColorList.add(new BlockColor(Material.CYAN_CONCRETE,20,114,129));
        blockColorList.add(new BlockColor(Material.PURPLE_CONCRETE,96,30,149));
        blockColorList.add(new BlockColor(Material.BLUE_CONCRETE,42,44,136));
        blockColorList.add(new BlockColor(Material.BROWN_CONCRETE,92,56,30));
        blockColorList.add(new BlockColor(Material.GREEN_CONCRETE,70,87,35));
        blockColorList.add(new BlockColor(Material.RED_CONCRETE,135,31,31));
        blockColorList.add(new BlockColor(Material.BLACK_CONCRETE,8,10,14));

        return blockColorList;

    }
}
