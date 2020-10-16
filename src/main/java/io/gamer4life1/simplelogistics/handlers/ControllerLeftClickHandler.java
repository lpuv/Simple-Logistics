package io.gamer4life1.simplelogistics.handlers;

import io.gamer4life1.simplelogistics.SimpleLogistics;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static io.gamer4life1.simplelogistics.SimpleLogistics.logger;

@Mod.EventBusSubscriber
public class ControllerLeftClickHandler {
    @SubscribeEvent
    public void leftClick(PlayerInteractEvent.LeftClickBlock event) {
        ItemStack itemStack = event.getEntityPlayer().getHeldItem(event.getHand());
        if (itemStack.toString().equalsIgnoreCase("Air")) {
            return;
        }
        IBlockState state = event.getWorld().getBlockState(event.getPos());
        Block block = state.getBlock();
        logger.info(block.getLocalizedName());
        if (block.getLocalizedName().equalsIgnoreCase("tile.simplelogistics.controller.name")) {
            logger.info("Item: " + itemStack.getItem().getRegistryName().toString());
            logger.info("Detected click on controller yay ^-^");
            NBTTagCompound nbt;
            if (itemStack.hasTagCompound()) {
                nbt = itemStack.getTagCompound();
            } else {
                nbt = new NBTTagCompound();
            }

            nbt.setInteger("controllerx", event.getPos().getX());
            nbt.setInteger("controllery", event.getPos().getY());
            nbt.setInteger("controllerz", event.getPos().getZ());
            itemStack.setTagCompound(nbt);

        }
    }
}
