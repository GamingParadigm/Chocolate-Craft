package gamingparadigm.chocolatecraft.tools;

import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.main.Main;
import gamingparadigm.chocolatecraft.main.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolateShovel extends ItemSpade
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ChocolateShovel = new ChocolateShovel();
        ChocolateShovel.setUnlocalizedName("chocolate_shovel");
        ChocolateShovel.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ChocolateShovel, ChocolateShovel.getUnlocalizedName());
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(ChocolateShovel), new Object[]{" C ", " S ", " S ", 'C', ItemChocolate.ItemChocolate, 'S', Items.stick});
    }

    public static Item ChocolateShovel;

    public ChocolateShovel()
    {
        super(Reference.ChocolateTM);
    }
}
