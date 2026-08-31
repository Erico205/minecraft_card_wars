package minecraft.cardwars.cards;

import com.google.common.eventbus.EventBus;
import minecraft.cardwars.MinecraftCardWars;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Card {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MinecraftCardWars.MODID);

    public static final DeferredItem<Item> CARD = ITEMS.register("card",
            () -> new Item(new Item.Properties()));



    public static void register (IEventBus eventBus){

        ITEMS.register(eventBus);

    }

}

