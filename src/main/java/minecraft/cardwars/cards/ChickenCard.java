// Classe da carta da galinha, onde ela puxa os dados de BaseCard passando apenas os parametros como nome e vida

package minecraft.cardwars.cards;

import net.minecraft.world.item.Item;

public class ChickenCard extends BaseCard{

    public ChickenCard(){

        super(
                new Item.Properties(),
                "Galinha",
                2,
                3,
                1
        );

    }


}

