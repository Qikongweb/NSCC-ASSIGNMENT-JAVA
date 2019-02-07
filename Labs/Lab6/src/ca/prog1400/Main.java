package ca.prog1400;

public class Main {

    public static void main(String[] args) {
	 Square square = new Square(4,"red",10,10);
	 System.out.println("Squere area is "+square.getArea());

	 Circle circle = new Circle(0,"Yellow",10);
     System.out.println("Circle area is "+circle.getArea());

     Triagle triagle = new Triagle(3,"red",20,20);
     System.out.println("triagle area is "+triagle.getArea());

    }
}
