package gamingparadigm.chocolatecraft.armor;

import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.main.ChocolateCraft;
import gamingparadigm.chocolatecraft.main.Main;
import gamingparadigm.chocolatecraft.main.Reference;
import gamingparadigm.chocolatecraft.utilities.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolateHelmet extends ItemArmor
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ChocolateHelmet = new ChocolateHelmet();
        ChocolateHelmet.setUnlocalizedName("chocolate_helmet");
        ChocolateHelmet.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ChocolateHelmet, ChocolateHelmet.getUnlocalizedName());
        ChocolateCraft.ItemList.add(ChocolateHelmet);
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(ChocolateHelmet), new Object[]{"C C", "CCC", 'C', ItemChocolate.ItemChocolate});
    }

    public static Item ChocolateHelmet;

    public ChocolateHelmet()
    {
        super(Reference.ChocolateAM, 0);
    }
}
