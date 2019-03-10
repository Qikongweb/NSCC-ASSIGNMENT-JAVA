package ca.prog1400.Classes;

public class Hammer extends Weapon {

    public static final String IMG_URL = "/images/weapon/hammer.png";
    public static final String DESCRIPTION = "Against mounted opponents, the weapon could also be directed at the legs " +
            "of a horse, toppling the armored foe to the ground where they could be more easily attacked.";


    public Hammer() {
        super("Hammer",50,20);
    }

    @Override
    public String toString() {
        return "Hammer{}";
    }
}
