package gamingparadigm.chocolatecraft.main;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Reference
{
    public static final String ModID = "chocolatecraft";
    public static final String Name = "Chocolate Craft";
    public static final String Version = "1.0";

    public static final String ClientProxyClass = "gamingparadigm.chocolatecraft.proxy.ClientProxy";
    public static final String ServerProxyClass = "gamingparadigm.chocolatecraft.proxy.CommonProxy";

    public static final Item.ToolMaterial ChocolateTM = EnumHelper.addToolMaterial("ChocolateTM", 2, 512, 6.0F, 2.0F, 7);
    public static final Item.ToolMaterial DChocolateTM = EnumHelper.addToolMaterial("DChocolateTM", 200, 51200, 600, 200, 7);

    public static final int[] CAMRA = new int[]{2, 5, 7, 3};

    public static final ItemArmor.ArmorMaterial ChocolateAM = EnumHelper.addArmorMaterial("ChocolateAM", "", 2, CAMRA, 7);
}
