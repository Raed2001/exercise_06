package de.thb.dim.pizzaPronto;

import java.awt.*;
import java.util.Objects;

public class ChefVO extends EmployeeVO {


    private Color colorApron;


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Color getColorApron() {
        return colorApron;
    }

    public void setColorApron(Color colorApron) {
        this.colorApron = colorApron;
    }

    public ChefVO() {
    }

    public ChefVO(String personnelNo,String lastName, String firstName) {
      super(personnelNo,lastName,firstName);
    }

    @Override
    public String toString() {
        if (getColorApron()==null){
            return super.toString()+"\n"+"Chef";
        }
        return super.toString()+"\n"+"Chef"+"\n"+"Farbe: "+getColorApron().toString();
    }

}
