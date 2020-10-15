package io.gamer4life1.simplelogistics;

import io.gamer4life1.simplelogistics.blocks.Controller;
import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks
{
    @GameRegistry.ObjectHolder(Reference.MOD_ID + ":controller")
    public static Controller controller;
}
