package io.gamer4life1.simplelogistics.items;

import io.gamer4life1.simplelogistics.SimpleLogistics;
import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Wrench extends Item
{
    public Wrench()
    {
        setRegistryName("wrench");
        setUnlocalizedName(Reference.MOD_ID + ".wrench");
        setCreativeTab(SimpleLogistics.ItemTAB);
    }

    @SideOnly(Side.CLIENT)
    public void initModel()
    {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
