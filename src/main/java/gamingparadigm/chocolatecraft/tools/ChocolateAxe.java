package gamingparadigm.chocolatecraft.tools;

import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.main.Main;
import gamingparadigm.chocolatecraft.main.Reference;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ChocolateAxe extends ItemAxe
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        ChocolateAxe = new ChocolateAxe();
        ChocolateAxe.setUnlocalizedName("chocolate_axe");
        ChocolateAxe.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerItem(ChocolateAxe, ChocolateAxe.getUnlocalizedName());
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(ChocolateAxe), new Object[]{"CC ", "CS ", " S ", 'C', ItemChocolate.ItemChocolate, 'S', Items.stick});
    }

    public static Item ChocolateAxe;

    public ChocolateAxe()
    {
        super(Reference.ChocolateTM);
    }
}
