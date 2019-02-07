package ca.prog1400;

public class Circle extends Shape {
    private  double radius;

    public Circle(int numSides, String color, double radius) {
        super(numSides, color);
        this.radius = radius;

    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

}

