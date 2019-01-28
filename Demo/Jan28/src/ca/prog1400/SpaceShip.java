package ca.prog1400;

public class SpaceShip {
    protected int fuelLevel;
    protected double o2Level;
    protected String name;

    public SpaceShip(int fuelLevel, double o2Level, String name) {
        this.fuelLevel = fuelLevel;
        this.o2Level = o2Level;
        this.name = name;
    }

    public void launch(){
        System.out.println("We have lift off !!");
    }

    public String telemetry(){
        return String.format("Houston: %s\nfuel: %d\no2: %.3f"
                ,this.name
                ,this.fuelLevel,
                this.o2Level);
    }

    
}
