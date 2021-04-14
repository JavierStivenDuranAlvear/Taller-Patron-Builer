package co.edu.unicauca.dishesbuilder;

/**
 *
 * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public class DishDirector {
    
    private DishBuilder dishBuilder;

    public Dish getDish() {
        return dishBuilder.getDish();
    }

    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }
    
    public void buildDish(){
        dishBuilder.setCore();
        dishBuilder.addParts();
        dishBuilder.setSize();
    }

}
