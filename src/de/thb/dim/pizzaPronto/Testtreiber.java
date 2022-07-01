package de.thb.dim.pizzaPronto;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testtreiber {
    public static void main(String[] args) {

         DishVO[] dishes = new DishVO[18];

        int o = 0;

        dishes[o++] = new PizzaVO(30, "Popeye", new String[] { "Schinken", "Spinat", "Champignon", "Ei" }, 7.00f, 1);
        dishes[o++] = new PizzaVO(30, "Popeye", new String[] { "Schinken",
                "Spinat", "Champignon", "Ei" }, 8.90f, 2);
        dishes[o++] = new PizzaVO(31, "Hawaii", new String[] { "Schinken", "Ananas", "Curry" }, 5.80f, 1);
        dishes[o++] = new PizzaVO(31, "Hawaii", new String[] { "Schinken", "Ananas", "Curry" }, 7.40f, 2);

        dishes[o++] = new PizzaVO(32, "Prima", new String[] { "Schinken", "Salami", "Zwiebeln", "Ei" }, 7.00f, 1);
        dishes[o++] = new PizzaVO(32, "Prima", new String[] { "Schinken", "Salami", "Zwiebeln", "Ei" }, 8.90f, 2);

        dishes[o++] = new PastaVO(11, "Napoli", new String[] { "Tomatensauce" }, 5.60f, 4);
        dishes[o++] = new PastaVO(11, "Napoli", new String[] { "Tomatensauce" }, 5.60f, 5);
        dishes[o++] = new PastaVO(11, "Napoli", new String[] { "Tomatensauce" }, 5.60f, 6);
        dishes[o++] = new PastaVO(12, "Bolognese", new String[] { "Hackfleischsauce" }, 6.40f, 4);
        dishes[o++] = new PastaVO(12, "Bolognese", new String[] { "Hackfleischsauce" }, 6.40f, 5);
        dishes[o++] = new PastaVO(12, "Bolognese", new String[] { "Hackfleischsauce" }, 6.40f, 6);
        dishes[o++] = new PastaVO(13, "alla Panna", new String[] { "Schinken", "Sahne" }, 6.40f, 4);
        dishes[o++] = new PastaVO(13, "alla Panna", new String[] { "Schinken", "Sahne" }, 6.40f, 5);
        dishes[o++] = new PastaVO(13, "alla Panna", new String[] { "Schinken", "Sahne" }, 6.40f, 6);

        dishes[o++] = new DessertVO(21, "Hausgemachter Obstsalat", 2.30f);
        dishes[o++] = new DessertVO(22, "Hausgemachte Pannacotta", 2.60f);
        dishes[o++] = new DessertVO(23, "Hausgemachtes Tiramisu", 2.80f);


   /**  OrderVO myOrder = new OrderVO(LocalDateTime.now(),new CustomerVO());




            // add all dishes of pizzen and more
            for (int i = 0; i < OrderVO.getMAX_DISHES(); i++) {
                myOrder.addDish(dishes[i % dishes.length]);
            }
            assertEquals(OrderVO.getMAX_DISHES(), myOrder.getNumberOfDishes(), "Number of dishes in OrderVO: MAX_DISHES");
            for (int i = 0; i < myOrder.getNumberOfDishes(); i++) {
                assertEquals(

                        myOrder.getDish(i), dishes[i % dishes.length], "Dishes in OrderVO equal the given dishes");
            }
**/

/**
        LocalDate today = LocalDate.now();
        LocalDate dob = LocalDate.of(1990, 5, 24);

        ChefVO chef1 = new ChefVO();
        ChefVO chef2 = new ChefVO("Müller", "Peter", Color.white);

        PizzaVO pizza1 = new PizzaVO();
        PizzaVO pizza2 = new PizzaVO("Tonno", new String[]{"Tuna", "Onions"}, 16);

        CustomerVO customer1 = new CustomerVO();
        CustomerVO customer2 = new CustomerVO("Fischer", "Heinz", "männlich", LocalDate.of(1999, 1, 3));

**/

    }
}
