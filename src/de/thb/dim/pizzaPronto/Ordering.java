package de.thb.dim.pizzaPronto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ordering implements IOrdering {

    private static MenuVO menu;
    private static int nextId=0;
    private OrderVO currentOrder;
    private CustomerVO currentCustomer;
    private IService kitchen;
    private IService delivery;


    public static MenuVO getMenu() {
        return menu;
    }

    public static int getNextId() {
        return nextId;
    }

    public OrderVO getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(OrderVO currentOrder) {
        this.currentOrder = currentOrder;
    }

    public CustomerVO getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(CustomerVO currentCustomer) {
        this.currentCustomer = currentCustomer;
    }

    public IService getKitchen() {
        return kitchen;
    }

    public void setKitchen(IService kitchen) {
        this.kitchen = kitchen;
    }

    public IService getDelivery() {
        return delivery;
    }

    public void setDelivery(IService delivery) {
        this.delivery = delivery;
    }

    @Override
    public OrderVO startNewOrder(CustomerVO customer) {
        int orderNo;
        OrderVO newOrder;
        if (getMenu()==null){
            menu=new MenuVO();
        }
        if (customer==null){
            return null;
        }



        else {
if (nextId==0){
    nextId++;
}
             orderNo= LocalDateTime.now().getYear() * 100000 + nextId;
            nextId++;
            setCurrentCustomer(customer);
             newOrder = new OrderVO(orderNo,"new",LocalDateTime.now(),customer);
            setCurrentOrder(newOrder);
            customer.setOrder(newOrder);

        }
        return newOrder;
    }

    @Override
    public void addDish(DishVO dish) {
if (getCurrentOrder()==null){
    System.out.println("There is no order.");
}

else if (!currentOrder.getState().equals("started")){
    System.out.println("Your order is complete, you can not add any dishes.");
}
else {
    getCurrentOrder().addDish(dish);
}

    }

    @Override
    public void deleteDish() {

        if (getCurrentOrder()==null){
            System.out.println("There is no order.");
        }

        else if (!currentOrder.getState().equals("started")){
            System.out.println("Your order is complete, you can not delete any dishes.");
        }
        else {
            getCurrentOrder().deleteDish();
        }

    }

    @Override
    public float calculateTotalPrice() {
        if (getCurrentOrder()==null){
            System.out.println("There is no order.");
            return 0;
        }

        return getCurrentOrder().calculatePriceDishes();
    }

    @Override
    public void confirmOrder() {

        if (getCurrentOrder()==null){
            System.out.println("There is no order.");
        }

        else if (getCurrentOrder().getState().equals("started")){
            getCurrentOrder().setState("confirmed");
        }

        else {
            System.out.println("Your order can not be confirmed.");
        }

    }

    public void startService(){
        if (getCurrentOrder()==null){
            System.out.println("There is no order.");
        }

        else if (getCurrentOrder().getState().equals("started")){
            System.out.println("Your order can not be processed.");
        }

        else if (getCurrentOrder().getState().equals("confirmed")){
           String s= kitchen.startService(getCurrentOrder());
            System.out.println(s);
        }
        else if (getCurrentOrder().getState().equals("ready")){
           String s= delivery.startService(getCurrentOrder());
            System.out.println(s);
        }

        else if (getCurrentOrder().getState().equals("delivered")){
            getCurrentOrder().setTimestampDeliveredOrder(LocalDateTime.now());
            getCurrentOrder().setState("finished");
            System.out.println("Order completed: ");
            getCurrentOrder().toString();
        }


    }

    public Ordering(){
        if (getNextId()==0){
            nextId++;
        }
menu=new MenuVO();
setCurrentOrder(null);
setCurrentCustomer(null);
setKitchen(new Kitchen());
setDelivery(new Delivery());

    }


}
