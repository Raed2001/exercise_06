package de.thb.dim.pizzaPronto;

import java.util.Arrays;
import java.util.Objects;

public abstract class DishVO {

    protected int number;
    protected String name;
    protected String[] ingredients;
    protected float price;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
        else {
            this.price = price;
        }

    }

    public DishVO() {
    }

    public DishVO(int number, String name, String[] ingredients, float price) {
        setNumber(number);
        setName(name);
        setIngredients(ingredients);
        setPrice(price);
    }

    public DishVO(int number, String name, float price) {
        setNumber(number);
        setName(name);
        setPrice(price);
    }

    public abstract String getNameOfDish();

    public abstract int getNumberOfDish();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DishVO dishVO = (DishVO) o;
        return getNumber() == dishVO.getNumber() && Float.compare(dishVO.getPrice(), getPrice()) == 0 && Objects.equals(getName(), dishVO.getName()) && Arrays.equals(getIngredients(), dishVO.getIngredients());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNumber(), getName(), getPrice());
        result = 31 * result + Arrays.hashCode(getIngredients());
        return result;
    }


    public String ingredientsToString(){
        String ingredients="";

        if (getIngredients()==null){
            return "";
        }

        for (String s:getIngredients()){
            ingredients=ingredients+s+", ";
        }
        return ingredients;

    }



    @Override
    public String toString() {
        return getNameOfDish()+" - "+getNameOfDish()+", "+getPrice()+"\n"+ ingredientsToString();
    }




}
