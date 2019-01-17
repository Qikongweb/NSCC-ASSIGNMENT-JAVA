package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        System.out.println("IN MAIN");


    Astronaut art = new Astronaut("Major Tome",150,60.0);
    Astronaut art2 = new Astronaut("Buzz",200,90);
    Astronaut art3 = new Astronaut("Buzz3",200,100);


    //Declare an empty array of fixed width
    Astronaut [] artArrays = new Astronaut[3];
    artArrays[0] = art;
    artArrays[1] = art;
    artArrays[2] = art;


    }
}
