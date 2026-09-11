// Classe Basica das cartas, aqui criei ela para que não seja necessário fazermos tudo de novo para cada cccarta

package minecraft.cardwars.cards;

import net.minecraft.world.item.Item;

// Criei uma classe abstrata para que ela não possa ser instanciada e não seja aterado os seus valores originais
// Ela vai ser o Pai de todas as Classes de Carta
public abstract class BaseCard extends Item {

    private final String name;
    private final int attack;
    private final int health;
    private final int cost;

    public BaseCard (Properties properties, String name, int attack, int health, int cost){

        super(properties);

        this.name = name;
        this.attack = attack;
        this. health = health;
        this.cost = cost;

    }

    public String getName(){

        return name;

    }

    public int getAttack(){

        return  attack;

    }

    public int getHealth(){

        return health;

    }

    public int getCost(){

        return cost;

    }



}
