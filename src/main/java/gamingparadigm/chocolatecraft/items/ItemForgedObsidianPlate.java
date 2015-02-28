package gamingparadigm.chocolatecraft.items;

import gamingparadigm.chocolatecraft.main.ChocolateCraft;
import gamingparadigm.chocolatecraft.main.Main;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemForgedObsidianPlate extends Item
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ItemForgedObsidianPlate = new ItemForgedObsidianPlate();
        ItemForgedObsidianPlate.setUnlocalizedName("item_forged_obsidian_plate");
        ItemForgedObsidianPlate.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ItemForgedObsidianPlate, ItemForgedObsidianPlate.getUnlocalizedName());
        ChocolateCraft.ItemList.add(ItemForgedObsidianPlate);
    }

    public static void Recipe()
    {
        GameRegistry.addSmelting(Blocks.obsidian, new ItemStack(ItemForgedObsidianPlate), 0.25F);
    }

    public static Item ItemForgedObsidianPlate;
}
