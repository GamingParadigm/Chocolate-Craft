package gamingparadigm.chocolatecraft.utilities;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemArmor extends net.minecraft.item.ItemArmor
{
    public ItemArmor(ItemArmor.ArmorMaterial material, int index)
    {
        super(material, 0, index);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
        if(this.armorType == 2)
        {
            return "chocolatecraft:textures/models/armor/chocolate_layer_2.png";
        }
        return "chocolatecraft:textures/models/armor/chocolate_layer_1.png";
    }
}
