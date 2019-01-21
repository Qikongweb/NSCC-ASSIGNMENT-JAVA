package ca.prog1400;

public class Main {

    public static void main(String[] args) {

        Food picnicBasket[] = {new Food("cucumber", "Vegetable")
                , new Food("pork", "Meat")
                , new Food("orange", "Fruit")};

        for (Food ch : picnicBasket) {
            if (!ch.myFavoriteFood.toLowerCase().equals(ch.getFoodType().toLowerCase())) {
                ch.denyIt();
            } else {
                ch.eatIt();
            }
        }
    }
}
