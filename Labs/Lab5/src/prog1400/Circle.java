package prog1400;

public class Circle {

    private double radius;
    private String colour;

    // Default Constructor: supplying empty values.
    public Circle(){
        this.radius = 2.0;
        this.colour = "green";
    }

    // Standard Constructor: parameters for circle size.
    public Circle(double radius) {
        this.radius = radius;
        this.colour = "green"; // default color;
    }

    // Standard Constructor: parameters for each attribute
    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    //  To calculate and return the total area of a circle object.
    public double getArea(){
        return this.radius * this.radius *  Math.PI;
    }
    public String toString(){
        return String.format("Radius = %.2f, Colour = %s",this.radius,this.colour);
    }

    //  getter method
    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

}
