package de.thb.dim.pizzaPronto;

public class DessertVO extends DishVO{


    public DessertVO() {
    }

    public DessertVO(int number, String name, float price) {
        super(number,name,price);
    }


    @Override
    public String getNameOfDish() {
        return getName();
    }

    @Override
    public int getNumberOfDish() {
        return getNumber();
    }


}
