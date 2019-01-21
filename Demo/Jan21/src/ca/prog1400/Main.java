package ca.prog1400;

public class Main {

    public static void main(String[] args) {
        /*Explicit assignment of object to array*/

        /*Car []  garage  = new Car[3];
        Car myHonda = new Car();
        Car myDodge = new Car();
        Car myNissan = new Car();
        garage[0] = myHonda;
        garage[1] = myDodge;
        garage[2] = myNissan;*/

        //This is the sane as the 7 lines above.
        Car[] garage = {new Car("Honda"),
                new Car("Dodge"),
                new Car("Nissan")};

        Car todayRide = garage[2];
        todayRide.accelerateTo(120);
        // Alternative
        garage[2].accelerateTo(120);

        /*for(int i = 0 ; i < garage.length; i ++){
            Car current = garage[i];
            System.out.println("Current Car ?? "+ current+"<stolen Memory");
            System.out.println("Current Car ?? "+ current.getSpeed());
        }*/

        for (int i = 0; i < garage.length; i++) {
            Car current = garage[i];
            System.out.println("I picked " + current.getMake());
            current.start();
            current.accelerateTo(120);
        }


//        for (Car elem: garage) {
//            System.out.println(elem.currentSpeed);
//        }
    }
}
