package ca.prog1400;

public class Triagle extends Shape{
    private double height;
    private double width;

    public Triagle(int numSides, String color, double height, double width) {
        super(numSides, color);
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return (this.width * this.height) / 2;
    }

}
