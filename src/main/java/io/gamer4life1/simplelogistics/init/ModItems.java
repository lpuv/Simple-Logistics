package io.gamer4life1.simplelogistics.init;

import io.gamer4life1.simplelogistics.util.Reference;
import jdk.nashorn.internal.ir.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

//Items added to the mod also blocks etc
public class ModItems
{
    @GameRegistry.ObjectHolder("simplelogistics:logistic_ingot")
    public static LogisticIngot logisticIngot;
}
