package gamingparadigm.chocolatecraft.tools;

import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.main.Main;
import gamingparadigm.chocolatecraft.main.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolateHoe extends ItemHoe
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ChocolateHoe = new ChocolateHoe();
        ChocolateHoe.setUnlocalizedName("chocolate_hoe");
        ChocolateHoe.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ChocolateHoe, ChocolateHoe.getUnlocalizedName());
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(ChocolateHoe), new Object[]{"CC ", " S ", " S ", 'C', ItemChocolate.ItemChocolate, 'S', Items.stick});
    }

    public static Item ChocolateHoe;

    public ChocolateHoe()
    {
        super(Reference.ChocolateTM);
    }
}
