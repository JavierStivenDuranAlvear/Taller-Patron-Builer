package co.edu.unicauca.dishesbuilder.builderConsola;

import co.edu.unicauca.dishesbuilder.Dish;
import co.edu.unicauca.dishesbuilder.DishBuilder;
import co.edu.unicauca.dishesbuilder.EnumSize;
import co.edu.unicauca.dishesbuilder.ItalianDish;

/**
 *
 * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public class ItalianDishBuilder extends DishBuilder {

    @Override
    public void setCore() {
        this.setDish(new ItalianDish("Pasta a la Carbonara", "Pasta al mejor estilo"
                + "italiano con adicion de pan de ajo para acompañar la pasta", "", 46000, EnumSize.HALF, "Pasta a la carbonara"));
    }

    @Override
    public void addParts() {
        this.dish.addPart(new Dish("Pasta a la carbonara", "Pasta al mejor estilo italiano", "", 24000, EnumSize.HALF) {
        });

        this.dish.addPart(new Dish("Pan de ajo", "Pan hornado en horno de leña", "", 8000, EnumSize.ALL) {
        });
    }

    @Override
    public void setSize() {
        this.dish.setSize(EnumSize.ALL);
    }
}
