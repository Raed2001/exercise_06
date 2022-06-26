package de.thb.dim.pizzaPronto;

import java.util.Objects;

public abstract class PersonVO {

    protected String lastName;
    protected String firstName;
    protected String street;
    protected int houseNumber;


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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public PersonVO() {
    }

    public PersonVO(String lastName, String firstName, String street, int houseNumber) {
        setLastName(lastName);
        setFirstName(firstName);
        setStreet(street);
        setHouseNumber(houseNumber);
    }

    public PersonVO(String lastName, String firstName) {
        setLastName(lastName);
        setFirstName(firstName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonVO personVO = (PersonVO) o;
        return getHouseNumber() == personVO.getHouseNumber() && Objects.equals(getLastName(), personVO.getLastName()) && Objects.equals(getFirstName(), personVO.getFirstName()) && Objects.equals(getStreet(), personVO.getStreet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getFirstName(), getStreet(), getHouseNumber());
    }

    @Override
    public String toString() {
        return "PersonVO{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }



}
