package ca.prog1400;
import java.util.Scanner;

public class Purchase {
    public void calculateShipping(){
        double cost;
        double total;
        System.out.println("welcome Shopper:) ");
        System.out.println("==================");
        System.out.println("Enter amount for their total purchase?");
        Scanner scanner = new Scanner(System.in);
        cost = scanner.nextInt() ;
        if(cost < 50 ){
            total = cost + 10;
            System.out.println("Your total is $" + total);
        }else{
            total = cost + 0;
            System.out.println("Your total is $" + total + " and free shipping!!");
        }

        //solutions
//        System.out.println("welcome Shopper:) ");
//        System.out.println("==================");
//        System.out.println("Enter amount for their total purchase?");
//        Scanner scanner = new Scanner(System.in);
//        double total =scanner.nextDouble();
//        if(total < 50){
//            total += 10;
//        }
//        System.out.println("Final Total = " + total);
    }
}
