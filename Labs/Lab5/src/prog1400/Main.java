package prog1400;

public class Main {
    public static void main(String[] args) {

        Circle [] circles = new Circle[3];
        circles[0] = new Circle();
        circles[1] = new Circle(2);
        circles[2] = new Circle(3,"blue");

        for(Circle circle : circles){
            System.out.println(String.format("The total area is %.3f.", circle.getArea()));
            System.out.println(circle.toString());
        }
    }
}
