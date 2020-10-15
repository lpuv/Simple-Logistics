package io.gamer4life1.simplelogistics;
import io.gamer4life1.simplelogistics.proxy.CommonProxy;
import io.gamer4life1.simplelogistics.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class SimpleLogistics
{
    @Instance
    public static SimpleLogistics instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    private static Logger logger = LogManager.getLogger();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event)
    {

    }

    @SubscribeEvent
    public void leftClick(PlayerInteractEvent.LeftClickBlock event) {
        ItemStack itemStack = event.getEntityPlayer().getHeldItem(event.getHand());
        logger.info(itemStack.getDisplayName());
        IBlockState state = event.getWorld().getBlockState(event.getPos());
        Block block = state.getBlock();
        if (block.getLocalizedName().equalsIgnoreCase("simplelogistics:controller")) {
            logger.info("Detected click on controller yay ^-^");
        }
    }

}
