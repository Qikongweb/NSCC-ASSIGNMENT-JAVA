package ca.prog1400.Classes;

import javax.swing.*;

public class Sword extends Weapon {
    public static final ImageIcon img = new ImageIcon("/images/weapon/sword.png"," dagger is a knife with a very sharp point and one or two sharp edges");
    public static final String IMG_URL = "/images/weapon/sword.png";
    public static final String DESCRIPTION = " dagger is a knife with a very sharp point and one or two sharp edges, " +
            "typically designed or capable of being used as a thrusting or stabbing weapon.";

    public Sword() {
        super("Sword",10,5);
    }
}
