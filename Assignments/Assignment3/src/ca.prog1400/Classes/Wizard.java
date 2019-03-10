package ca.prog1400.Classes;

public class Wizard extends Player{
    public static final String IMG_URL = "/images/player/wizard.png";
    public static final String DESCRIPTION = "The Wizard is a type of magical character class in certain role-playing games, " +
            "including role-playing video games. Wizards are considered to be spellcasters who wield powerful spells, " +
            "but are often physically weak as a trade-off. Wizards are commonly confused with similar offensive spellcasting " +
            "classes such as the Warlock and the Necromancer. ";

    public Wizard(String name) {
        super(name,"Wizard",50,30,100,20);
    }
    public Wizard(String name,Weapon weapon) {
        super(name);
    }



}
