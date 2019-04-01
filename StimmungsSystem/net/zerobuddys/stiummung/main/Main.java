package net.zerobuddys.stiummung.main;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.event.Listener;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

public class Main extends PluginBase implements Listener {

    private static String SystemPrefix = "§8[§eStimmungs§8] §7> ";
    private static String NoPlayer = "§8[§eNoPlayer§8] §7> ";
    private static String Developer = "§8[§bDeveloper§8] §7> ";
    private static String ServerPrefix = "§8[§6Unkreative§bMC§8] §7> ";
    private static String CommandListe = "§8[§a§l+§r§8] §7| ";


    @Override
    public void onEnable() {
        getLogger().info(TextFormat.BLUE + SystemPrefix + "Das System wird grade geladen");

        getLogger().info(TextFormat.GRAY + "--------------------------------");
        getLogger().info(TextFormat.AQUA + "Die Infos Für Diese Tolle System");
        getLogger().info("");
        getLogger().info(TextFormat.GREEN + "Der Server : UnkreativeMC - NET");
        getLogger().info(TextFormat.GREEN + "Das Plugin : StimmungsCoreV2");
        getLogger().info(TextFormat.GREEN + "Der Developer : ZeroBuddysYT");
        getLogger().info(TextFormat.GREEN + "Die Plugin-Version : v2.0");
        getLogger().info("");
        getLogger().info(TextFormat.AQUA + "Die Infos Für Diese Tolle System");
        getLogger().info(TextFormat.GRAY + "--------------------------------");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        switch (command.getName().toLowerCase()){
            case "pldev":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + TextFormat.RED + "Du Musst Ein Player Sein Um Diesen Command Zu Nutzen!");
                    break;
                }
                sender.sendMessage(Developer + TextFormat.GOLD + "Der Developer Vom Diesem System Ist ZeroBuddysYT");
                break;
            case "happy":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + TextFormat.RED + "Du Musst Ein Player Sein Um Diesen Command Zu Nutzen!");
                    break;
                }
                sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                getServer().broadcastMessage(TextFormat.GREEN + sender.getName() + TextFormat.AQUA + "Er Ist Grade Froh drauf!");
                break;

            case "angry":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + TextFormat.AQUA + "Du Musst Ein Player Sein, Um diesen Command Zu Nutzen!");
                    break;
                }
                sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                getServer().broadcastMessage(TextFormat.RED + sender.getName() + TextFormat.AQUA + "Er Ist Grade Sauer auf etwas!");
                break;

            case "alone":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + TextFormat.AQUA + "Du Musst Ein Player Sein, Um diesen Command Zu Nutzen!");
                    break;
                }
                sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                getServer().broadcastMessage(TextFormat.GRAY + sender.getName() + TextFormat.YELLOW + "Er Ist Grade Alleine!");
                break;

            case "amazed":
                if (!(sender instanceof Player)){
                    sender.sendMessage(NoPlayer + TextFormat.AQUA + "Du Musst Ein Player Sein, Um diesen Command Zu Nutzen!");
                    break;
                }
                sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + "Er Ist grade Erstaunt!");
                break;

            case "annoyed":
                if (!(sender instanceof Player)){
                    sender.sendMessage(SystemPrefix + TextFormat.AQUA + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                    break;
                }
                sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + "Er Ist grade Verärgert!");
                break;

            case "sad":
                if (!(sender instanceof Player)){
                    sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                    break;
                }
                sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + "Er Ist grade Traurig!");
                break;

            case "disappointed":
                if (!(sender instanceof Player)){
                    sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                    break;
                }
                sender.sendMessage(SystemPrefix + TextFormat.GREEN + "Deine Nachricht Wurde An den Ganzen Server Gesendet!");
                getServer().broadcastMessage(TextFormat.YELLOW + sender.getName() + TextFormat.BLUE + "Er Ist grade Enttäuscht!");
                break;

            case "systeminfo":
                if (!(sender instanceof Player)){
                    sender.sendMessage(SystemPrefix + TextFormat.AQUA + "Du Musst Ein Spieler Sein Um Diesen Command Zu Nutzen!");
                    break;
                }
                sender.sendMessage(Developer + TextFormat.AQUA + "Der Developer Von deisem System Ist ZeroBuddysYT");
                sender.sendMessage(Developer + TextFormat.AQUA + "Die Version Des Plugins Ist Grade Auf der 2.0!");
                break;

            case "corehelp":
                if (!(sender instanceof Player)){
                    sender.sendMessage(ServerPrefix + TextFormat.GREEN + "Du musst Ein Player Sein um diesen Command Zu Nutzen");
                    break;
                }
                sender.sendMessage(ServerPrefix + TextFormat.AQUA + "Command Liste");
                sender.sendMessage(CommandListe + TextFormat.YELLOW + "/pldev" + TextFormat.GRAY + " Seigt Dir wer der, Developer von diesem, plugin ist!");
                sender.sendMessage(CommandListe + TextFormat.YELLOW + "/happy" + TextFormat.GRAY + " Sendet Den server, eine nachricht das du gut drauf bist!");
                sender.sendMessage(CommandListe + TextFormat.YELLOW + "/alone" + TextFormat.GRAY + " Sendet Den server, eine nachricht das du Alleine bist!");
                sender.sendMessage(CommandListe + TextFormat.YELLOW + "/amazed" + TextFormat.GRAY + " Sendet Den server, eine nachricht das du Verärgert bist!");
                sender.sendMessage(CommandListe + TextFormat.YELLOW + "/sad" + TextFormat.GRAY + " Sendet Den server, eine nachricht das du gut drauf bist!");
                sender.sendMessage(CommandListe + TextFormat.YELLOW + "/disappointed" + TextFormat.GRAY + " Sendet Den server, eine nachricht das du Enttäuscht bist!");
                sender.sendMessage(CommandListe + TextFormat.YELLOW + "/systeminfo" + TextFormat.GRAY + " Sendet Dir, Auf welcher version das Plugin Ist!");
                sender.sendMessage(ServerPrefix + TextFormat.AQUA + "Command Liste");
                break;
        }
        return true;
    }

    @Override
    public void onDisable() {
        getLogger().info(SystemPrefix + TextFormat.RED + "Das System Wird Grade Runtegefahren!");
    }
}
