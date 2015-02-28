package gamingparadigm.chocolatecraft.main;

import gamingparadigm.chocolatecraft.armor.ChocolateHelmet;
import gamingparadigm.chocolatecraft.blocks.BlockCompressedObsidian;
import gamingparadigm.chocolatecraft.items.ItemChocolate;
import gamingparadigm.chocolatecraft.items.ItemDarkChocolate;
import gamingparadigm.chocolatecraft.items.ItemForgedObsidianPlate;
import gamingparadigm.chocolatecraft.items.ItemRawChocolate;
import gamingparadigm.chocolatecraft.tools.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import java.util.ArrayList;

public class ChocolateCraft
{
    public static void PreInitialize()
    {
        // Items
        ItemRawChocolate.Main();
        ItemChocolate.Main();
        ItemForgedObsidianPlate.Main();
        ItemDarkChocolate.Main();

        // Blocks
        BlockCompressedObsidian.Main();

        // Tools
        ChocolateAxe.Main();
        ChocolateHoe.Main();
        ChocolatePickaxe.Main();
        ChocolateShovel.Main();
        ChocolateSword.Main();

        // Armor
        // ChocolateHelmet.Main(); TODO Released in Chocolate 1.5
    }
    public static void Initialize()
    {
        // Items
        ItemRawChocolate.Recipe();
        ItemChocolate.Recipe();
        ItemForgedObsidianPlate.Recipe();
        ItemDarkChocolate.Recipe();

        // Blocks
        BlockCompressedObsidian.Recipe();

        // Tools
        ChocolateAxe.Recipe();
        ChocolateHoe.Recipe();
        ChocolatePickaxe.Recipe();
        ChocolateShovel.Recipe();
        ChocolateSword.Recipe();

        // Armor
        // ChocolateHelmet.Recipe(); TODO Released in Chocolate Craft 1.5
    }

    public static void PostInitialize()
    {
        for(Item item : ItemList)
        {
            Base.registerRender(item);
        }
        for(Block block : BlockList)
        {
            Base.registerRender(Item.getItemFromBlock(block));
        }
    }

    public static ArrayList<Item> ItemList = new ArrayList<Item>();
    public static ArrayList<Block> BlockList = new ArrayList<Block>();
}
