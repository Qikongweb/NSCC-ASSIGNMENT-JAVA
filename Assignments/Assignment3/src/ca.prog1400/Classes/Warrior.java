package ca.prog1400.Classes;

import javax.swing.*;

public class Warrior extends Player{
    public static final String IMG_URL = "/images/player/warrior.png";
    public static final String DESCRIPTION = "A warrior is a person specializing in combat or warfare, especially within" +
            " the context of a tribal or clan-based warrior culture society that recognizes a separate warrior class or " +
            "caste.";

    public Warrior(String name) {
        super(name,"Warrior",70,50,40,30);
    }



}
