package ca.prog1400;
import java.util.Scanner;

public class GradeConverter {
    private static String[] gradeLetter = {"A", "B", "C", "D", "F"};
    private static double[] gradeNumber = {4,3,2,1,0};

    public static void main(String[] args) {
        System.out.println("Enter a letter grade: ");
        Scanner scanner = new Scanner(System.in);
        String myPoint = String.format("Your grade is %.2f", GradeConverter.converter(scanner.next()));
        System.out.println(myPoint);


    }
    private static double converter(String userLetter) {
        for (int i = 0; i < gradeLetter.length; i++) {
            if (userLetter.equals(gradeLetter[i])) {
                return gradeNumber[i];
            }
        }
        return 0;
    }
}
