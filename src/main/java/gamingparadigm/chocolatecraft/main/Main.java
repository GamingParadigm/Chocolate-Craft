package gamingparadigm.chocolatecraft.main;

import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Reference.ModID, name = Reference.Name, version = Reference.Version)

public class Main
{
    @Mod.EventHandler
    public static void Initialize(FMLInitializationEvent event)
    {
        Base.Initialize();
    }

    @SidedProxy(modId = Reference.ModID, clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
    public static CommonProxy proxy;

    public static final CreativeTabs tabCC = new CreativeTabs("tabCC")
    {
        @Override
        public Item getTabIconItem()
        {
            return ItemChocolate.ItemChocolate;
        }
    };
}

