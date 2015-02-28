package gamingparadigm.chocolatecraft.items;

import gamingparadigm.chocolatecraft.blocks.BlockCompressedObsidian;
import gamingparadigm.chocolatecraft.main.ChocolateCraft;
import gamingparadigm.chocolatecraft.main.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemDarkChocolate extends ItemFood
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ItemDarkChocolate = new ItemDarkChocolate();
        ItemDarkChocolate.setUnlocalizedName("item_dark_chocolate");
        ItemDarkChocolate.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ItemDarkChocolate, ItemDarkChocolate.getUnlocalizedName());
        ChocolateCraft.ItemList.add(ItemDarkChocolate);
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(ItemDarkChocolate), new Object[]{"CCC", "C C", "CCC", 'C', BlockCompressedObsidian.BlockCompressedObsidian});
    }

    public static Item ItemDarkChocolate;

    public ItemDarkChocolate()
    {
        super(20, 1.0F, true);
    }
}

