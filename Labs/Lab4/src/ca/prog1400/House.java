package ca.prog1400;

import java.awt.*;
import java.util.Scanner;

public class House {
    double length;
    double weight;
    String roofColour = "Black";
    boolean changeRoofColour;

    public House(double l, double w, boolean changeRoofColour){
        this.length = l;
        this.weight = w;
        this.changeRoofColour = changeRoofColour;
        if(changeRoofColour){
            this.roofColour = chooseRoofColor();
        }

    }
    public void printTotalArea(){
        System.out.println(String.format("the house size is %.2f & roof color is %s", length * weight , roofColour));
    }
    private String chooseRoofColor(){
        System.out.println("You can choose color you want. what do you want color?");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
