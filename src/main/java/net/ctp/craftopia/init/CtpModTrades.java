
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.ctp.craftopia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class CtpModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2),

					new ItemStack(CtpModBlocks.STRAWBERRY_SEEDS.get(), 5), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(CtpModItems.STRAWBERRY.get(), 4),

					new ItemStack(Items.EMERALD, 16), 30, 5, 0.05f));
		}
	}
}
