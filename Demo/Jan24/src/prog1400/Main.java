package prog1400;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] myDoubles = new double[5];
        int[] myInt = new int[5];
        for (int i = 0; i < myDoubles.length; i++) {
            /*myDoubles[i] = getUserInput(i+1);*/
            myDoubles[i] = getUserInputInt(i + 1);

        }
        // Arrays.toString() <- prints contents of array
        System.out.println(Arrays.toString(myDoubles));
    }

    private static int getUserInputInt(int num){
        int returnValue = -1;


        System.out.println(String.format("%d Give me a number: ", num));
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.hasNextInt());
        do {
            System.out.println("Enter a number: ");

            while(!scanner.hasNextInt()){ //Check that the value is an integer
                System.out.println("Enter a positive number : ");
                scanner.next();
            }
            returnValue = scanner.nextInt();
        }while(returnValue < 0);

        return returnValue;
    }
    private static double getUserInput(int num){
        double returnValue = 0;
        System.out.println(String.format("%d Give me a number: ", num));
        Scanner scanner = new Scanner(System.in);
        try {
            returnValue = scanner.nextDouble();  //runtime exception
        } catch (InputMismatchException ex) {
            returnValue = -1;
        }

        if (scanner.hasNextDouble()) {

            returnValue = scanner.nextDouble();
            System.out.println("You didn't enter a number.");
            System.out.println("Assuming value is -1.");
        } else {
            returnValue = -1;
        }

        return returnValue;
    }
}
