package gamingparadigm.chocolatecraft.items;

import gamingparadigm.chocolatecraft.main.ChocolateCraft;
import gamingparadigm.chocolatecraft.main.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemChocolate extends ItemFood
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ItemChocolate = new ItemChocolate();
        ItemChocolate.setUnlocalizedName("item_chocolate");
        ItemChocolate.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ItemChocolate, ItemChocolate.getUnlocalizedName());
        ChocolateCraft.ItemList.add(ItemChocolate);
    }

    public static void Recipe()
    {
        GameRegistry.addSmelting(ItemRawChocolate.ItemRawChocolate, new ItemStack(ItemChocolate), 0.25F);
    }

    public static Item ItemChocolate;

    public ItemChocolate()
    {
        super(6, 0.5F, false);
    }
}
