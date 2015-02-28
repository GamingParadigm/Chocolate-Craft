package gamingparadigm.chocolatecraft.main;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class Base
{
    public static void registerRender(Item item)
    {
        ItemModelMesher mesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();
        ModelResourceLocation location = new ModelResourceLocation(item.getUnlocalizedName(), "inventory");
        mesher.register(item, 0, location);
    }

    public static void Initialize()
    {
        ChocolateCraft.PreInitialize();
        ChocolateCraft.Initialize();
        ChocolateCraft.PostInitialize();
    }
}
