package ca.prog1400;

public class Square extends Shape {

    private double height;
    private double width;


    public Square(int numSides, String color, double height, double width) {
        super(numSides, color);
        this.height = height;
        this.width = width;

    }

    public double getArea(){
        return this.width * this.height;
    }

}
