package io.gamer4life1.simplelogistics;

import io.gamer4life1.simplelogistics.items.LogisticIngot;
import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
    @GameRegistry.ObjectHolder(Reference.MOD_ID + ":logistic_ingot")
    public static LogisticIngot logisticIngot;
}
