package gamingparadigm.chocolatecraft.blocks;

import gamingparadigm.chocolatecraft.items.ItemForgedObsidianPlate;
import gamingparadigm.chocolatecraft.main.ChocolateCraft;
import gamingparadigm.chocolatecraft.main.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockCompressedObsidian extends Block
{
    public static void Main()
    {
        Initialize();
        Register();
    }

    private static void Initialize()
    {
        BlockCompressedObsidian = new BlockCompressedObsidian();
        BlockCompressedObsidian.setUnlocalizedName("block_compressed_obsidian");
        BlockCompressedObsidian.setCreativeTab(Main.tabCC);
    }

    private static void Register()
    {
        GameRegistry.registerBlock(BlockCompressedObsidian, BlockCompressedObsidian.getUnlocalizedName());
        ChocolateCraft.BlockList.add(BlockCompressedObsidian);
    }

    public static void Recipe()
    {
        GameRegistry.addRecipe(new ItemStack(BlockCompressedObsidian), new Object[]{"FFF", "F F", "FFF", 'F', ItemForgedObsidianPlate.ItemForgedObsidianPlate});
    }

    public static Block BlockCompressedObsidian;

    public BlockCompressedObsidian()
    {
        super(Material.rock);
    }
}
