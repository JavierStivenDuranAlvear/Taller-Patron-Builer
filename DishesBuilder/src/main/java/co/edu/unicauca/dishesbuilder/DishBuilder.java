package co.edu.unicauca.dishesbuilder;

/**
 *
 * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public abstract class DishBuilder {
    
    protected Dish dish;
        
    public abstract void setCore();
    public abstract void addParts();
    public abstract void setSize();
    
    public Dish getDish(){
        return this.dish;
    }
    
    public void setDish(Dish dish){
        this.dish = dish;
    }
    
}
