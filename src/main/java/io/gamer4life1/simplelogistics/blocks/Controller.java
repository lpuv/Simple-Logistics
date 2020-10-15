package io.gamer4life1.simplelogistics.blocks;

import io.gamer4life1.simplelogistics.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Controller extends Block
{
    public Controller()
    {
        super(Material.ROCK);
        setUnlocalizedName(Reference.MOD_ID + ".controller");
        setRegistryName("controller");
    }
}
