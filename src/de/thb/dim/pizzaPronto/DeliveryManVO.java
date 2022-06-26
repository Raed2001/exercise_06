package de.thb.dim.pizzaPronto;

public class DeliveryManVO extends EmployeeVO{

    private String driverLicence;

    public String getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(String driverLicence) {
        this.driverLicence = driverLicence;
    }

    public DeliveryManVO() {
    }

    public DeliveryManVO(String personnelNo, String lastName, String firstName) {
        super(personnelNo,lastName,firstName);
        setPersonnelNo(personnelNo);
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Delivery Man"+"\n"+
                "Driver Licence: "+getDriverLicence();
    }
}
