package de.thb.dim.pizzaPronto;

public class Kitchen implements IService {

    private EmployeeVO[] employees;


    public Kitchen() {
        employees = new EmployeeVO[]{new ChefVO("01","Koch","Christian")};
    }

    public EmployeeVO[] getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeVO[] employees) {
        this.employees = employees;
    }

    @Override
    public String startService(OrderVO order) {

        if (order==null){
            return "Service of ChefVO "+employees[0].toString()+": No order available.";
        }

        else if (order.getState().equals("confirmed")){
            order.setState("ready");
            return "Service of ChefVO "+employees[0].toString()+": Order is ready.";
        }

        else {
            return "Service of ChefVO "+employees[0].toString()+": No order for processing available.";
        }

    }
}
