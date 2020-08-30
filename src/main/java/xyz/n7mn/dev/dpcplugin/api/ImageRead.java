package xyz.n7mn.dev.dpcplugin.api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static xyz.n7mn.dev.dpcplugin.api.BlockColor.getBlockColorList;

public class ImageRead {

    private String url = "";


    public ImageRead(String url){
        this.url = url;
    }

    public ImageRead(){

    }

    public List<ImageBlockData> getBlockData(){
        return this.getBlockData(this.url);
    }

    public List<ImageBlockData> getBlockData(String url){

        OkHttpClient client = new OkHttpClient();
        InputStream stream = null;

        try {
            Request build = new Request.Builder().url(url).build();
            Response response = client.newCall(build).execute();
            stream = response.body().byteStream();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return getBlockData(stream);
    }


    public List<ImageBlockData> getBlockData(InputStream stream){

        List<ImageBlockData> data = new ArrayList<>();

        try {
            final BufferedImage img = ImageIO.read(stream);

            final int width = img.getData().getWidth();
            final int height = img.getData().getHeight();
            final List<BlockColor> colorList = getBlockColorList();


            for (int x = 0; x < width; x++){
                for (int z = 0; z < height; z++){
                    Color color = new Color(img.getRGB(x, z));

                    Material mate = null;
                    int red_sa = 999;
                    int green_sa = 999;
                    int blue_sa = 999;
                    for (BlockColor blockColor : colorList){
                        if (blockColor.Red == color.getRed() && blockColor.Green == color.getGreen() && blockColor.Blue == color.getBlue()){
                            data.add(new ImageBlockData(x, z, blockColor.BlockType));
                            break;
                        }

                        if (Math.abs(color.getRed() - blockColor.Red) < red_sa && Math.abs(color.getGreen() - blockColor.Green) < green_sa && Math.abs(color.getBlue() - blockColor.Blue) < blue_sa){
                            mate = blockColor.BlockType;
                            red_sa = Math.abs(color.getRed() - blockColor.Red);
                            green_sa = Math.abs(color.getGreen() - blockColor.Green);
                            blue_sa = Math.abs(color.getBlue() - blockColor.Blue);
                        }
                    }

                    if (mate != null){
                        data.add(new ImageBlockData(x, z, mate));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return data;
    }
}
