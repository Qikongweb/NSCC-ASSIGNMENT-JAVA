package ca.prog1400;

public class Food {
    String myFavoriteFood = "Meat";
    String foodName;

    public String getFoodType() {
        return foodType;
    }

    String foodType;

    public Food(String foodName, String foodType) {
        this.foodName = foodName;
        this.foodType = foodType;
    }

    public void eatIt() {
        System.out.println("You just ate the " + this.foodName + ".");
    }

    public void denyIt() {
            System.out.println("Not eating that!  I hate " + this.foodType+ ".");
    }

}
