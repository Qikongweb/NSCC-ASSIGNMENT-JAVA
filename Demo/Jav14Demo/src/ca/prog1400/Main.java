package ca.prog1400;

public class Main {

    public static void main(String[] args) {


        //	static in Java
//        Main myMain = new Main();
//        for (int i = 0; i < args.length; i++) {
//            printExcitingStuff(args[i]);
//            myMain.printExcitingStuffInstence(args[i]);
//
//        }
//    }

//        public static void printExcitingStuff(String stuff){
//            System.out.println(stuff + "!!!");
//        }
//        public  void printExcitingStuffInstence(String stuff){
//            System.out.println(stuff + "!!!");
//        }
//        int carCount = 0;
//        Car myCar1 = new Car("Honda");
//        carCount++;
//        Car myCar2 = new Car("Tesla");
//        carCount++;
//        Car.setCarCount(carCount);
//        System.out.println("Total Car Count = " + Car.getCarCount());
//        System.out.println("Gimme a random: " + Math.random());

     Main myMain = new Main();
//        int test = 50;
//        // Java only passes by value.
//        myMain.increaseParameterByTen(test);
//        System.out.println("What is the value of test?" + test);
//        Car tesla = new Car("Tesla");
//        tesla.setCurrentSpeed(150);
//        myMain.increaseSpeedByTen(tesla);
//        System.out.println("tesla current speed = "+ tesla.getCurrentSpeed());
        String myName = String.format("My name is %s %s.", "Tim","Jones");
        System.out.println(myName);
        String myAge = String.format("My age is %d",21);
        System.out.println(myAge);
        String myAmt = String.format("The amount is %.2f", 12.10);
        System.out.println(myAmt);
        double tax = 15.11111;
        System.out.println(String.format("Your tax amount is %.1f", tax));


    }
    public void increaseSpeedByTen(Car carToUpdate) {
        int currentSpeed = carToUpdate.getCurrentSpeed();
        carToUpdate.setCurrentSpeed(currentSpeed + 10);
    }

    public void increaseParameterByTen(int param){
        param  += 10;
        System.out.println("Local value of param: " + param);
    }
    public static void printExcitingStuff(String stuff){
        System.out.println(stuff + "!!!");
    }

}
