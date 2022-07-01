package de.thb.dim.pizzaPronto;

import java.lang.invoke.SwitchPoint;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class OrderVO {
    private int OrderNo;

    private LocalDateTime timestampStartedOrder;
    private LocalDateTime timestampDeliverdOrder;
    private final static int MAX_DISHES=10;
    private DishVO[] shoppingBasket;
    private CustomerVO customer;
    private String state;
    private int index;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getOrderNo() {
        return OrderNo;
    }


    public LocalDateTime getTimestampStartedOrder() {
        return timestampStartedOrder;
    }

    public void setTimestampStartedOrder(LocalDateTime timestampStartedOrder) {
        this.timestampStartedOrder = timestampStartedOrder;
    }

    public LocalDateTime getTimestampDeliveredOrder() {
        return timestampDeliverdOrder;
    }

    public void setTimestampDeliveredOrder(LocalDateTime timestampDeliverdOrder) {
        this.timestampDeliverdOrder = timestampDeliverdOrder;
    }

    public DishVO[] getShoppingBasket() {
        return shoppingBasket;
    }

    public void setShoppingBasket(DishVO[] shoppingBasket) {
        this.shoppingBasket = shoppingBasket;
    }

    public CustomerVO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerVO customer) {
        this.customer=customer;
    }

    public int getIndex() {
        return index;
    }



    public static int getMAX_DISHES() {
        return MAX_DISHES;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderVO orderVO = (OrderVO) o;
        return getOrderNo() == orderVO.getOrderNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderNo(), getTimestampStartedOrder(), getTimestampDeliveredOrder());
    }



    @Override
    public String toString() {


        if (getNumberOfDishes()==0){
            return  ", timestampStartedOrder=" + timestampStartedOrder +
                    ", timestampDeliverdOrder=" + timestampDeliverdOrder +
                    ", MAX_DISHES=" + MAX_DISHES +
                    '}';
        }

        String dishes="";

        for (DishVO dish: shoppingBasket){
            if (dish!=null) {
                dishes = dishes + dish.toString() + "\n";
            }
        }

        return  ", timestampStartedOrder=" + timestampStartedOrder +
                ", timestampDeliverdOrder=" + timestampDeliverdOrder +
                ", MAX_DISHES=" + MAX_DISHES +
                ", shoppingBasket=" + dishes +
                '}';
        
    }

    public OrderVO(int orderNo, String state, LocalDateTime timestampStartedOrder,CustomerVO customer) {

shoppingBasket=new DishVO[getMAX_DISHES()];
setState(state);
index=0;
        setCustomer(customer);
        setTimestampStartedOrder(timestampStartedOrder);



        OrderNo= orderNo;

    }
    
    public void addDish(DishVO dish){
        if (dish==null){
            return;
        }
        if (index<MAX_DISHES) {
            shoppingBasket[index] = dish;
            index++;
        }

        
    }
    
    public void deleteDish(){
        if (index==0){
            return;
        }
        shoppingBasket[index-1]=null;
        index--;
    }
    
    public DishVO getDish(int index){
        if (index<MAX_DISHES&&index>-1){
            return shoppingBasket[index];
        }
        return null;
    }
    
    public int getNumberOfDishes(){
        return getIndex();
    }


    public float calculatePriceDishes(){
        float price=0;
        for (DishVO dish:shoppingBasket){
            if (dish!=null) {
                price = price + dish.getPrice();
            }
        }

        return price;

    }

}
