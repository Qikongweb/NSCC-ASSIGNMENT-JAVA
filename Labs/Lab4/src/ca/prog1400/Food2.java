package ca.prog1400;

public class Food2 {

    String myFavoriteFood = "Meat";

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    String foodName;
    String foodType;

    public Food2(String foodName, String foodType) {
        this.foodName = foodName;
        this.foodType = foodType;
    }

    public String eatIt() {
        return "You just ate the " + this.foodName;
    }
    public String denyIt(){
        return "Not eating that!  I hate " + this.foodType+ ".";
    }
}
