package co.edu.unicauca.dishesbuilder;

import java.util.ArrayList;

/**
 *
 * @author Javier Stiven Duran Alvear
 * @author Luis Arango
 */
public class Dish {
    
    private String name;
    private String description;
    private String image;
    private int price;
    private EnumSize size;
    private ArrayList<Dish> parts;

    public Dish(String name, String description, String image, int price, EnumSize size) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.size = size;
        parts = new ArrayList<Dish>();
    }
    
    public void addPart(Dish part){
        parts.add(part);
    }   
    
    public int calculatePriceParts(){
        int priceParts = 0;
        for(Dish i : parts){
            if(i.size == EnumSize.ALL){
                priceParts += i.price;
            }else{
                priceParts += i.price/2;
            }
        }
        if (!parts.isEmpty())
            price = priceParts;
        return priceParts;
    }

    public void setSize(EnumSize size) {
        this.size = size;
    }

    public ArrayList<Dish> getParts() {
        return parts;
    }

    @Override
    public String toString(){
        calculatePriceParts();
        return "\nName: "+name+"\nDescription: "+description+"\nPrice unit.:  "+price+"\nSize: "+size+"\n";
    }
    
    public String showParts(){
        String show = "";
        for(Dish i : parts){
            show += i.toString();
        }
        return show;
    }
    
    
}
