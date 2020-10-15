package io.gamer4life1.simplelogistics.proxy;

import io.gamer4life1.simplelogistics.ModBlocks;
import io.gamer4life1.simplelogistics.ModItems;
import io.gamer4life1.simplelogistics.blocks.Controller;
import io.gamer4life1.simplelogistics.items.LogisticIngot;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class CommonProxy
{
    //ITEMS
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().register(new LogisticIngot()); //Logistic ingot item

        event.getRegistry().register(new ItemBlock(ModBlocks.controller).setRegistryName(ModBlocks.controller.getRegistryName())); //Controller item
    }

    //BLOCKS
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(new Controller()); //Controller block
    }
}
