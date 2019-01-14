package ca.prog1400;
import java.util.Scanner;

public class GradeConverter {
//    private static String[] gradeLetter = {"A", "B", "C", "D", "F"};
    private static char[] gradeLetter = {'A', 'B', 'C', 'D', 'F'};
    private static double[] gradeNumber = {4.0,3.0,2.0,1.0,0.0};

    public static void main(String[] args) {
        System.out.println("Welcome :)");
        System.out.println("What is your grade?? ");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        String myPoint = String.format("Your grade is %s and point is %.2f",letter, GradeConverter.converter(letter));
        System.out.println(myPoint);
    }
    private static double converter(char userLetter) {
        for (int i = 0; i < gradeLetter.length; i++) {
            if (userLetter==gradeLetter[i]) {
                return gradeNumber[i];
            }
        }
        return 0;
    }
}
