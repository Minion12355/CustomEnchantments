package entropis.customenchantments;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomEnchantments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info(ChatColor.DARK_GRAY+"["+ChatColor.DARK_PURPLE+"Entropis"+ChatColor.DARK_GRAY+"]["+ChatColor.AQUA+"CustomEnchants"+ChatColor.DARK_GRAY+"]"+ChatColor.WHITE+" Custom Enchantments has been enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
