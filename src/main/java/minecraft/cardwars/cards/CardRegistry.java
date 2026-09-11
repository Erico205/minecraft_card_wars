// Classe para registro das cartas
package minecraft.cardwars.cards;

import minecraft.cardwars.MinecraftCardWars;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// Este é o registrador
public class CardRegistry {

    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(MinecraftCardWars.MODID);

    // aqui defino o que ele vai registar, para criar uma nova carta apenas trocar os nomes do registro

    public static final DeferredItem<ChickenCard> CHICKEN_CARD =
            ITEMS.register("chicken_card", ChickenCard::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
