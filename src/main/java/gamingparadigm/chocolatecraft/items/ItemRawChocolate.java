package gamingparadigm.chocolatecraft.items;

import gamingparadigm.chocolatecraft.main.ChocolateCraft;
import gamingparadigm.chocolatecraft.main.Main;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemRawChocolate extends Item
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ItemRawChocolate = new ItemRawChocolate();
        ItemRawChocolate.setUnlocalizedName("item_raw_chocolate");
        ItemRawChocolate.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ItemRawChocolate, ItemRawChocolate.getUnlocalizedName());
        ChocolateCraft.ItemList.add(ItemRawChocolate);
    }

    public static void Recipe()
    {
        // Nothing Goes Here! Yay!
    }

    public static Item ItemRawChocolate;
}
