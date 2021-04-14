package co.edu.unicauca.dishesbuilder.builderConsola;
import co.edu.unicauca.dishesbuilder.Dish;
import co.edu.unicauca.dishesbuilder.DishDirector;
import co.edu.unicauca.dishesbuilder.DishBuilder;
/**
 *
 * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public class ClientMain {
    
    public static void main (String[] args){
        DishDirector director = new DishDirector();
        DishBuilder orientalBuilder = new OrientalDishBuilder();
        director.setDishBuilder(orientalBuilder);
        director.buildDish();
        
        Dish dish = director.getDish();
        
        System.out.println("Oriental dish: " + dish.toString());
        System.out.println("Sus partes: " + dish.showParts());
        System.out.println("El precio de sus partes: " + dish.calculatePriceParts());
        System.out.println("");
        DishBuilder italianBuilder = new ItalianDishBuilder();
        director.setDishBuilder(italianBuilder);
        director.buildDish();
        System.out.println("*************************************************");
        dish = director.getDish();
        
        System.out.println("Italian dish: " + dish.toString());
        System.out.println("Sus partes: " + dish.showParts());
        System.out.println("El precio de sus partes: " + dish.calculatePriceParts());
    }
    
}
