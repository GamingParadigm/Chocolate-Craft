package gamingparadigm.chocolatecraft.tools;

import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.main.Main;
import gamingparadigm.chocolatecraft.main.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ChocolateSword extends ItemSword
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ChocolateSword = new ChocolateSword();
        ChocolateSword.setUnlocalizedName("chocolate_sword");
        ChocolateSword.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ChocolateSword, ChocolateSword.getUnlocalizedName());
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(ChocolateSword), new Object[]{" C ", " C ", " S ", 'C', ItemChocolate.ItemChocolate, 'S', Items.stick});
    }

    public static Item ChocolateSword;

    public ChocolateSword()
    {
        super(Reference.ChocolateTM);
    }
}
