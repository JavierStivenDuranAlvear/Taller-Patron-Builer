package co.edu.unicauca.dishesbuilder;

/**
 *
 * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public class ItalianDish extends Dish{
    private String italianName;

    public ItalianDish(String name, String description, String image, int price, EnumSize size, String italianName){
        super(name, description, image, price, size);
        this.italianName = italianName;
    }
}
