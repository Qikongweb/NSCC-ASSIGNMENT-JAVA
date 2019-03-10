package ca.prog1400.Classes;

public class Cleric extends Player {
    public static final String IMG_URL = "/images/player/cleric.png";
    public static final String DESCRIPTION = " The cleric is a healer, usually a priest and a holy warrior, originally " +
            "modeled on or inspired by the Military Orders. Clerics are usually members of religious orders, " +
            "with the original intent being to portray soldiers of sacred orders who have magical abilities, although " +
            "this role was later taken more clearly by the paladin.";
    public Cleric(String name) {
        super(name,"Cleric",80,80,90,40);
    }



}
