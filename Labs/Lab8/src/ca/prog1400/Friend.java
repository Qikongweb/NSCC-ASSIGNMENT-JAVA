package ca.prog1400;

public class Friend extends Person {


    private String foodToBring;

    public Friend(String firstName, String lastName, boolean isInvited, String foodBring) {
        super(firstName, lastName, isInvited);
        this.foodToBring = foodBring;

    }

    @Override
    public String toString() {
        String result = this.getFullName() + "is bringing" + this.foodToBring;
        result += "They are ";
        if (!isInvited()) {
            result += "NOT";
        }
        result += " invited to the party.";
        return result;
    }


}
