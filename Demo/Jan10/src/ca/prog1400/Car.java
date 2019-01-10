package ca.prog1400;

import java.awt.*;

public class Car {
//    Properties or Attributes. The Class State.
    String licensePlate;
    double avgMilespartGallon;
    Color color;
    boolean tailLightsWorking;
    // Constructor
    public Car (String plate, double mpg, Color color, boolean tailLights){
        //Use the input parameters to initialize the class.
        this.licensePlate = plate;
        this.avgMilespartGallon = mpg;
        this.color = color;
        this.tailLightsWorking = tailLights;
    }

    //Behaviour
    public void drive(){
        System.out.println(this.licensePlate + " Vroom Vroom");
    }


}

