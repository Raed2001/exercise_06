package de.thb.dim.pizzaPronto;

public class MenuVO {

    private static final int NUMBER_OF_DISHES=18;
    private DishVO[] dishes;


    public int getNumberOfDishes() {
        return NUMBER_OF_DISHES;
    }

    public DishVO getDish(int index){
        return dishes[index];
    }

    public MenuVO() {
        initMenu();
    }

    private void initMenu(){
this.dishes=new DishVO[NUMBER_OF_DISHES];

        dishes[0] = new PizzaVO(30,"Popeye", new String[] {"Schinken", "Spinat", "Champignon", "Ei"}, 7.00f,1);
        dishes[1] = new PizzaVO(30,"Popeye", new String[] {"Schinken", "Spinat", "Champignon", "Ei"}, 8.90f,2);

        dishes[2] = new PizzaVO(31,"Hawaii", new String[] {"Schinken", "Ananas", "Curry"}, 5.80f,1);
        dishes[3] = new PizzaVO(31,"Hawaii", new String[] {"Schinken", "Ananas", "Curry"}, 7.40f,2);

        dishes[4] = new PizzaVO(32,"Prima", new String[] {"Schinken", "Salami", "Zwiebeln", "Ei"}, 7.00f,1);
        dishes[5] = new PizzaVO(32,"Prima", new String[] {"Schinken", "Salami", "Zwiebeln", "Ei"}, 8.90f,2);


        dishes[6] = new PastaVO(11,"Napoli", new String[] {"Tomatensauce"}, 5.60f,4);
        dishes[7] = new PastaVO(11,"Napoli", new String[] {"Tomatensauce"}, 5.60f,5);
        dishes[8] = new PastaVO(11,"Napoli", new String[] {"Tomatensauce"}, 5.60f,6);

        dishes[9] = new PastaVO(12,"Bolognese", new String[] {"Hackfleischsauce"}, 6.40f,4);
        dishes[10] = new PastaVO(12,"Bolognese", new String[] {"Hackfleischsauce"}, 6.40f,5);
        dishes[11] = new PastaVO(12,"Bolognese", new String[] {"Hackfleischsauce"}, 6.40f,6);

        dishes[12] = new PastaVO(13,"alla Panna", new String[] {"Schinken", "Sahne"}, 6.40f,4);
        dishes[13] = new PastaVO(13,"alla Panna", new String[] {"Schinken", "Sahne"}, 6.40f,5);
        dishes[14] = new PastaVO(13,"alla Panna", new String[] {"Schinken", "Sahne"}, 6.40f,6);


        dishes[15] = new DessertVO(21,"Hausgemachter Obstsalat", 2.30f);
        dishes[16] = new DessertVO(22,"Hausgemachte Pannacotta", 2.60f);
        dishes[17] = new DessertVO(23,"Hausgemachtes Tiramisu", 2.80f);

    }

    public String toString(){

        return "MENU PIZZA PRONTO"+"\n"+
                "Prima speciale pizzas:"+"\n"+
                "1 normal (Diameter approx. 26 cm) and"+"\n"+
                "2 grande (Diameter approx. 32 cm)"+"\n"+
                dishes[0].getNumber()+"   "+dishes[0].getName()+" "+dishes[0].ingredientsToString()+"\n"+
                "Price: "+dishes[0].getPrice()+" Euro"+"\n"+
                "Price: "+dishes[1].getPrice()+" Euro"+"\n"+
                dishes[2].getNumber()+"   "+dishes[2].getName()+" "+dishes[2].ingredientsToString()+"\n"+
                "Price: "+dishes[2].getPrice()+" Euro"+"\n"+
                "Price: "+dishes[3].getPrice()+" Euro"+"\n"+
                dishes[4].getNumber()+"   "+dishes[4].getName()+" "+dishes[4].ingredientsToString()+"\n"+
                "Price: "+dishes[4].getPrice()+" Euro"+"\n"+
                "Price: "+dishes[5].getPrice()+" Euro"+"\n"+
                "Prima special pastas:"+"\n"+
                "4 Spaghetti"+"\n"+
                "5 Tortellini"+"\n"+
                "6 Gnocchi"+"\n"+
                dishes[6].getNumber()+"   "+dishes[6].getName()+" "+dishes[6].ingredientsToString()+"\n"+
                "Price: "+dishes[6].getPrice()+" Euro"+"\n"+
                dishes[9].getNumber()+"   "+dishes[9].getName()+" "+dishes[9].ingredientsToString()+"\n"+
                "Price: "+dishes[9].getPrice()+" Euro"+"\n"+
                dishes[12].getNumber()+"   "+dishes[12].getName()+" "+dishes[12].ingredientsToString()+"\n"+
                "Price: "+dishes[12].getPrice()+" Euro"+"\n"+
                "Prima desserts"+"\n"+
                dishes[15].getNumber()+"   "+dishes[15].getName()+ "\n"+
                "Price: "+dishes[15].getPrice()+" Euro"+"\n"+
                dishes[16].getNumber()+"   "+dishes[16].getName()+ "\n"+
                "Price: "+dishes[16].getPrice()+" Euro"+"\n"+
                dishes[17].getNumber()+"   "+dishes[17].getName()+ "\n"+
                "Price: "+dishes[17].getPrice()+" Euro"+"\n";

    }


}
