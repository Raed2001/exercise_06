package de.thb.dim.pizzaPronto;

import java.util.Objects;

public class PastaVO extends DishVO{

    private int typeOfPasta;


    public int getTypeOfPasta() {
        return typeOfPasta;
    }

    public void setTypeOfPasta(int typeOfPasta) {
        this.typeOfPasta = typeOfPasta;
    }

    public PastaVO() {
    }

    public PastaVO(int number, String name, String[] ingredients, float price, int typeOfPasta) {
        super(number,name,ingredients,price);
        setTypeOfPasta(typeOfPasta);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PastaVO pastaVO = (PastaVO) o;
        return getTypeOfPasta() == pastaVO.getTypeOfPasta();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfPasta());
    }



    @Override
    public String getNameOfDish() {
        String pasta;
      if (getTypeOfPasta()==4){
          pasta="Spaghetti";
      }
         else if (getTypeOfPasta()==5){
            pasta="Tortellini";
        }
       else if (getTypeOfPasta()==6){
            pasta="Gnocchi";
        }
       else pasta="";
        return "Pasta "+getName()+" - "+pasta;
    }

    @Override
    public int getNumberOfDish() {
        return getTypeOfPasta()*100+getNumber();
    }
}
