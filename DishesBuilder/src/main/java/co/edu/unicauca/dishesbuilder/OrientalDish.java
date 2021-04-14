package co.edu.unicauca.dishesbuilder;

import java.util.ArrayList;

/**
 *
  * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public class OrientalDish extends Dish{
    
    private String orientalName;

    public OrientalDish(String name, String description, String image, int price, EnumSize size, String orientalName){
        super(name, description, image, price, size);
        this.orientalName = orientalName;
    }
        
}
