package ca.prog1400;


public class Car {
    int currentSpeed = 0 ;
    String make;

    public Car(){

    }
    public Car(String make){
        this.make = make;
        // No other code here, part from initialization

    }

    public void start(){
        System.out.println("");
    }

    public void accelerateTo(int speed) {
        // Set the speed on this Car
        if(speed > 150){
            System.out.println("THAT'S ILLEGAL!");
        }else if(speed < 0 ){
            System.out.println("Impossible");
        }else{
            this.currentSpeed = speed ;
            System.out.println("VROOOMMM VROOOMMM!!!");
        }
    }

    public int getSpeed(){
        return this.currentSpeed;
    }
    public String getMake(){
        return this.make;
    }
    public void floorInt(){
        System.out.println("VROOOMMM VROOOMMM!!!");

    }
}
