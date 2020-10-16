package io.gamer4life1.simplelogistics;

import io.gamer4life1.simplelogistics.items.Wrench;
import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
    @GameRegistry.ObjectHolder(Reference.MOD_ID + ":wrench")
    public static Wrench wrench;

    @SideOnly(Side.CLIENT)
    public static void initModels()
    {
        wrench.initModel();
    }
}
