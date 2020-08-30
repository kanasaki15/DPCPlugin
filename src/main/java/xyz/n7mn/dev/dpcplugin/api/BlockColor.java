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

        blockColorList.add(new BlockColor(Material.GOLD_BLOCK,241,205,60));
        blockColorList.add(new BlockColor(Material.IRON_BLOCK,212,213,212));
        blockColorList.add(new BlockColor(Material.BEDROCK,82,82,82));
        blockColorList.add(new BlockColor(Material.GRANITE,144,100,83));
        blockColorList.add(new BlockColor(Material.POLISHED_GRANITE,149,103,86));
        blockColorList.add(new BlockColor(Material.DIORITE,182,182,183));
        blockColorList.add(new BlockColor(Material.POLISHED_DIORITE,192,192,194));
        blockColorList.add(new BlockColor(Material.ANDESITE,131,131,131));
        blockColorList.add(new BlockColor(Material.POLISHED_ANDESITE,127,130,129));
        blockColorList.add(new BlockColor(Material.STONE,121,121,121));
        blockColorList.add(new BlockColor(Material.SPONGE,189,186,72));
        blockColorList.add(new BlockColor(Material.CUT_SANDSTONE,217,207,165));
        blockColorList.add(new BlockColor(Material.LAPIS_BLOCK,29,65,135));
        blockColorList.add(new BlockColor(Material.SMOOTH_QUARTZ,228,222,215));
        blockColorList.add(new BlockColor(Material.SMOOTH_RED_SANDSTONE,174,94,30));
        blockColorList.add(new BlockColor(Material.SMOOTH_STONE,154,154,154));
        blockColorList.add(new BlockColor(Material.OBSIDIAN,14,10,24));
        blockColorList.add(new BlockColor(Material.PURPUR_BLOCK,165,122,164));
        blockColorList.add(new BlockColor(Material.DIAMOND_BLOCK,97,230,221));
        blockColorList.add(new BlockColor(Material.SNOW_BLOCK,241,246,246));
        blockColorList.add(new BlockColor(Material.CLAY,155,161,173));
        blockColorList.add(new BlockColor(Material.PUMPKIN,192,115,24));
        blockColorList.add(new BlockColor(Material.NETHERRACK,94,37,37));
        blockColorList.add(new BlockColor(Material.SOUL_SAND,78,60,48));
        blockColorList.add(new BlockColor(Material.SOUL_SOIL,73,55,45));
        blockColorList.add(new BlockColor(Material.POLISHED_BASALT,96,96,98));
        blockColorList.add(new BlockColor(Material.NETHER_BRICK,43,21,25));
        blockColorList.add(new BlockColor(Material.END_STONE_BRICKS,212,217,157));
        blockColorList.add(new BlockColor(Material.NETHER_QUARTZ_ORE,115,65,62));
        blockColorList.add(new BlockColor(Material.HAY_BLOCK,161,135,12));
        blockColorList.add(new BlockColor(Material.PRISMARINE,92,154,143));
        blockColorList.add(new BlockColor(Material.PRISMARINE_BRICKS,96,167,154));
        blockColorList.add(new BlockColor(Material.DARK_PRISMARINE,50,89,74));
        blockColorList.add(new BlockColor(Material.CUT_RED_SANDSTONE,176,95,30));
        blockColorList.add(new BlockColor(Material.WARPED_WART_BLOCK,22,116,117));
        blockColorList.add(new BlockColor(Material.BONE_BLOCK,203,199,173));
        blockColorList.add(new BlockColor(Material.BLUE_ICE,113,163,246));
        blockColorList.add(new BlockColor(Material.DRIED_KELP_BLOCK,49,56,38));
        blockColorList.add(new BlockColor(Material.NETHERITE_BLOCK,66,61,64));
        blockColorList.add(new BlockColor(Material.ANCIENT_DEBRIS,91,64,56));
        blockColorList.add(new BlockColor(Material.CRYING_OBSIDIAN,32,10,60));
        blockColorList.add(new BlockColor(Material.BLACKSTONE,41,35,40));
        blockColorList.add(new BlockColor(Material.BROWN_MUSHROOM_BLOCK,145,109,79));
        blockColorList.add(new BlockColor(Material.RED_MUSHROOM_BLOCK,195,45,44));
        blockColorList.add(new BlockColor(Material.MUSHROOM_STEM,197,191,180));
        blockColorList.add(new BlockColor(Material.SLIME_BLOCK,107,170,90));
        blockColorList.add(new BlockColor(Material.SHULKER_BOX,110,75,107));
        blockColorList.add(new BlockColor(Material.WHITE_SHULKER_BOX,169,172,170));
        blockColorList.add(new BlockColor(Material.ORANGE_SHULKER_BOX,190,84,7));
        blockColorList.add(new BlockColor(Material.MAGENTA_SHULKER_BOX,137,42,126));
        blockColorList.add(new BlockColor(Material.LIGHT_BLUE_SHULKER_BOX,39,128,163));
        blockColorList.add(new BlockColor(Material.YELLOW_SHULKER_BOX,201,150,23));
        blockColorList.add(new BlockColor(Material.LIME_SHULKER_BOX,79,135,17));
        blockColorList.add(new BlockColor(Material.PINK_SHULKER_BOX,181,95,122));
        blockColorList.add(new BlockColor(Material.GRAY_SHULKER_BOX,45,47,49));
        blockColorList.add(new BlockColor(Material.LIGHT_GRAY_SHULKER_BOX,99,98,90));
        blockColorList.add(new BlockColor(Material.CYAN_SHULKER_BOX,16,95,105));
        blockColorList.add(new BlockColor(Material.PURPLE_SHULKER_BOX,84,26,123));
        blockColorList.add(new BlockColor(Material.BLUE_SHULKER_BOX,35,36,108));
        blockColorList.add(new BlockColor(Material.BROWN_SHULKER_BOX,81,50,27));
        blockColorList.add(new BlockColor(Material.GREEN_SHULKER_BOX,62,78,24));
        blockColorList.add(new BlockColor(Material.RED_SHULKER_BOX,113,24,23));
        blockColorList.add(new BlockColor(Material.PINK_SHULKER_BOX,180,94,121));

        return blockColorList;

    }
}
