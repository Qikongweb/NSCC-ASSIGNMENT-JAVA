package ca.prog1400;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Hammer hammer = new Hammer();

        System.out.println(Player.getSummary(warrior,hammer));


    }

}
