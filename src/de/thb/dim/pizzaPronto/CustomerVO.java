package de.thb.dim.pizzaPronto;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class CustomerVO extends PersonVO {


    private String gender;
    private LocalDate dateOfBirth;
    private int id;
    private static int nextId =0;
    private OrderVO order;


    public OrderVO getOrder() {
        return order;
    }

    public void setOrder(OrderVO order) {

        this.order = order;

    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        if (calculateAge()<18||dateOfBirth==null){
            this.dateOfBirth=null;
        }
    }

    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }



    public boolean hasOrder(){
        return getOrder()!=null;
   }

    public CustomerVO() {
        id=getNextId();
        nextId+=1;
    }



    public CustomerVO(String lastName, String firstName,String street,int houseNumber, String gender, LocalDate dateOfBirth) {
        super(lastName,firstName,street,houseNumber);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
        id=getNextId();
        nextId+=1;
    }

    public CustomerVO(String lastName, String firstName, LocalDate dob) {
        setLastName(lastName);
        setFirstName(firstName);
        setDateOfBirth(dob);
        id=getNextId();
        nextId+=1;
    }

    private String dobToString(){
        return dateOfBirth.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerVO that = (CustomerVO) o;
        if (getDateOfBirth()!=null&&that.getDateOfBirth()==null){
            return false;
        }
        if (getDateOfBirth()==null&&that.getDateOfBirth()!=null){
            return false;
        }
        if (getDateOfBirth()==null&&that.getDateOfBirth()==null){
            return super.equals(o);
        }
        return super.equals(o)&&that.getDateOfBirth().equals(dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDateOfBirth())+super.hashCode();
    }

    @Override
    public String toString() {
        if (getOrder()==null){
            return super.toString()+"\n"+"Gender: "+gender+"\n"+"ID: "+getId()+"\n"+"Date of Birth: "+getDateOfBirth().format(DateTimeFormatter.ofPattern("dd MMM yyyy"))+"\n"+"Bestllungen: "+"\n"+"Alter: "+calculateAge();
        }
        return super.toString()+"\n"+"Gender: "+gender+"\n"+"ID: "+getId()+"\n"+"Date of Birth: "+getDateOfBirth().toString()+"\n"+"Bestllungen: "+getOrder().toString()+"\n"+"Alter: "+calculateAge();
    }

    public short calculateAge(){

        if (this.dateOfBirth==null||this.dateOfBirth.isAfter(LocalDate.now())||this.dateOfBirth.equals(LocalDate.now())){
            return -1;
        }

        return (short) Period.between(this.dateOfBirth,LocalDate.now()).getYears();
    }
}
