package ca.prog1400;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
    House myHouse1 = new House(30,40,true);
    House myHouse2 = new House(40,40, false);
    myHouse1.printTotalArea();
    myHouse2.printTotalArea();

    }
}
