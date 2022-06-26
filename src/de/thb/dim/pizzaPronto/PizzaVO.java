package de.thb.dim.pizzaPronto;

import java.util.Arrays;
import java.util.Objects;

public class PizzaVO extends DishVO {

    private int size;


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price<0){
            this.price=0;
        }
        else{


        this.price = price;
    }
    }

    public PizzaVO() {
    }

    @Override
    public String getNameOfDish() {
        String size;
        if (getSize()==1){
            size="Normal";
        }
        else {
            size="Grande";
        }
        return "Pizza "+getName()+" - "+size;
    }

    @Override
    public int getNumberOfDish() {
        return getNumber()*10+getSize();
    }

    public PizzaVO(int number, String name, String[] ingredients, float price) {
        super(number,name,ingredients,price);
    }
    public PizzaVO(int number, String name, String[] ingredients, float price, int size) {
       super(number,name,ingredients,price);
       setSize(size);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaVO pizzaVO = (PizzaVO) o;
        return Float.compare(pizzaVO.getPrice(), getPrice()) == 0 && Objects.equals(getName(), pizzaVO.getName()) && Arrays.equals(getIngredients(), pizzaVO.getIngredients());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getName(), getPrice());
        result = 31 * result + Arrays.hashCode(getIngredients());
        return result;
    }

    public PizzaVO clone(){
        return new PizzaVO(getNumber(),getName(),getIngredients(),getPrice());
    }


}
