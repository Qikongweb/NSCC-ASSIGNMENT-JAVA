package ca.prog1400;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car player1 = new Car("xyz123",25.0, Color.ORANGE,true);
        player1.drive();
        Car player2 = new Car("123xyz",23, Color.RED,false);
        player2.drive();

        //String
        String str1 = "Hello world";
        System.out.println(str1.split(" ")[0]);

        //Arrays
        int [] integers = {1,2,3,4,5};
        String [] strings = {"Hello","World"};
        boolean [] bools = new boolean[10];
        bools[0] = true;
        System.out.println(integers[3]);
        System.out.println(strings[1]);
        System.out.println(bools[0]);
        System.out.println(bools[1]);
        System.out.println(bools.length);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string, please? ");
        String input = scanner.nextLine();
        System.out.println("You typped " + input);
        System.out.println("Give me a integer, please? ");
        int inputInt = scanner.nextInt();

        System.out.println("You typped " + inputInt);

        char[] ch = {'x','y','z'};
        for(int i =0 ; i<ch.length;i++){
            System.out.println(ch[i]);
        }



    }
}
