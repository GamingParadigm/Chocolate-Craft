package gamingparadigm.chocolatecraft.tools;

import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.main.Main;
import gamingparadigm.chocolatecraft.main.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolatePickaxe extends ItemPickaxe
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ChocolatePickaxe = new ChocolatePickaxe();
        ChocolatePickaxe.setUnlocalizedName("chocolate_pickaxe");
        ChocolatePickaxe.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ChocolatePickaxe, ChocolatePickaxe.getUnlocalizedName());
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(ChocolatePickaxe), new Object[]{"CCC", " S ", " S ", 'C', ItemChocolate.ItemChocolate, 'S', Items.stick});
    }

    public static Item ChocolatePickaxe;

    public ChocolatePickaxe()
    {
        super(Reference.ChocolateTM);
    }
}
