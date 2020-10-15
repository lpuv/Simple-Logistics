package io.gamer4life1.simplelogistics.tabs;

import io.gamer4life1.simplelogistics.ModItems;
import io.gamer4life1.simplelogistics.items.LogisticIngot;
import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CreativeItemTab extends CreativeTabs
{
    public CreativeItemTab(String name)
    {
        super(Reference.MOD_ID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ModItems.logisticIngot);
    }
}
