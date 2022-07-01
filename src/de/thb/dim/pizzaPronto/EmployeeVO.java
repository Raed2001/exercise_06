package de.thb.dim.pizzaPronto;

import java.util.Objects;

public abstract class EmployeeVO extends PersonVO {

    protected String personnelNo;
    protected float salary;
    protected int vacationDays;


    public String getPersonnelNo() {
        return personnelNo;
    }

    public void setPersonnelNo(String personnelNo) {
        this.personnelNo = personnelNo;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public EmployeeVO() {
    }

    public EmployeeVO(String personnelNo,String lastName, String firstName) {
        super(lastName,firstName);
        setPersonnelNo(personnelNo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployeeVO that = (EmployeeVO) o;
        return Objects.equals(getPersonnelNo(), that.getPersonnelNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPersonnelNo());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Personalnummer: " + getPersonnelNo() + "\n" + "Gehalt: " + getSalary() + "\n" + "Urlaubstage: " + getVacationDays();
    }
}
