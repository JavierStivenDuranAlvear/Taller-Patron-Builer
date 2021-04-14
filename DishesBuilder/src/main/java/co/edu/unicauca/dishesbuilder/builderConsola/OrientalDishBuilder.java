package co.edu.unicauca.dishesbuilder.builderConsola;
import co.edu.unicauca.dishesbuilder.Dish;
import co.edu.unicauca.dishesbuilder.DishBuilder;
import co.edu.unicauca.dishesbuilder.DishBuilder;
import co.edu.unicauca.dishesbuilder.EnumSize;
import co.edu.unicauca.dishesbuilder.EnumSize;
import co.edu.unicauca.dishesbuilder.OrientalDish;
import java.util.ArrayList;
/**
 *
 * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public class OrientalDishBuilder extends DishBuilder{
    
    @Override
    public void setCore() {
        this.setDish(new OrientalDish("Arroz oriental", "arroz con estilo oriental"
                + ", añadiendo ingredientes con sabores orientales como la soja"
                + "las verduras y las gambas", "", 56000, EnumSize.ALL, "East rice"));
    }   

    @Override
    public void setSize() {
        this.dish.setSize(EnumSize.ALL);
    }

    @Override
    public void addParts() {
        this.dish.addPart(new Dish("Base de arroz", "Base de arroz para preparar arroz oriental", "", 12000, EnumSize.ALL) {
        });
        this.dish.addPart(new Dish("Soja", "Soja oriental", "", 8000, EnumSize.ALL) {
        });
        this.dish.addPart(new Dish("Verduras orientales", "Verduras con sabor oriental", "", 15000, EnumSize.HALF) {
        });
        this.dish.addPart(new Dish("Gambas", "Gambas orientales", "", 12000, EnumSize.ALL) {
        });
    }
       
    
    
}
