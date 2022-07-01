package de.thb.dim.pizzaPronto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Delivery implements IService {

    private EmployeeVO[] employees;

    public EmployeeVO[] getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeVO[] employees) {
        this.employees = employees;
    }

    public Delivery() {
        employees = new EmployeeVO[]{new DeliveryManVO("02","Kutscher","Max"),new DeliveryManVO("03","Reiter","Peter")};
    }

    private EmployeeVO selectEmployee(){

        int i = (int) ((Math.random() * (employees.length)) + 0);
        return employees[i];
    }

    @Override
    public String startService(OrderVO order) {
        DeliveryManVO deliveryMan = (DeliveryManVO) selectEmployee();

        if (order==null){
            return "Service of DeliveryManVO "+deliveryMan.toString()+": No order available.";
        }

        CustomerVO customer = order.getCustomer();

     if (customer==null){
         return "Service of DeliveryManVO "+deliveryMan.toString()+": No customer available.";
     }

     if (order.getState().equals("ready")){
         order.setState("delivered");
         return "Diver to customer"+"\n"+"Service of DeliveryManVO "+deliveryMan.toString()+": Order is delivered on "+ LocalDate.now()+LocalDateTime.now();
     }

     else {
         return "Service of DeliveryManVO "+deliveryMan.toString()+": No order is ready for processing. ";

     }


    }
}
