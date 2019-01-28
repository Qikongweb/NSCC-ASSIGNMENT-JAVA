package ca.prog1400;

public class Main {
    public static void main(String[] args) {
        System.out.println("I am public!");
        SpaceShip spaceX = new SpaceShip(1000,89.9,"Dragon");
        spaceX.launch();
        System.out.println("Reoirt?" + spaceX.telemetry());
    }
}
