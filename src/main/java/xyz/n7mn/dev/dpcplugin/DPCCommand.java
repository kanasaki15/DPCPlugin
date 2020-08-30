package xyz.n7mn.dev.dpcplugin;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import xyz.n7mn.dev.dpcplugin.api.ImageBlockData;
import xyz.n7mn.dev.dpcplugin.api.ImageRead;
import xyz.n7mn.dev.dpcplugin.api.SetBlock;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DPCCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = null;
        if (sender instanceof Player){
            player = (Player) sender;
        }

        if (label.startsWith("dpc-vertical") && args.length == 1){
            if (player != null){
                sender.sendMessage(ChatColor.YELLOW + "画像取得中...");
                OkHttpClient client = new OkHttpClient();
                InputStream stream = null;

                try {
                    Request build = new Request.Builder().url(args[0]).build();
                    Response response = client.newCall(build).execute();
                    stream = response.body().byteStream();
                    sender.sendMessage(ChatColor.YELLOW + "画像取得完了。 画像解析中...");
                    List<ImageBlockData> data = new ImageRead().getBlockData(stream);
                    sender.sendMessage(ChatColor.YELLOW + "画像解析完了。組み立てます...");
                    new SetBlock().setBlockByVertical(player.getWorld(), player.getLocation().getBlockX(), player.getLocation().getBlockY(), player.getLocation().getBlockZ(), data);
                    sender.sendMessage(ChatColor.YELLOW + "組み立て完了しました。");

                } catch (IOException e) {
                    e.printStackTrace();
                    sender.sendMessage(ChatColor.RED + "画像取得に失敗しました。");
                }
            }
        }

        return true;
    }
}
