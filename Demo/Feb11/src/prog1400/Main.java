package prog1400;


import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Simple message dialog
/*        JOptionPane.showMessageDialog(null,"Danger Will Robinson!","Hello World :)",JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null,"Danger Will Robinson!","Hello World :)",JOptionPane.ERROR_MESSAGE);*/
        // Confirm Dialog
/*
        int val = JOptionPane.showConfirmDialog(null,"Basic Confirm","OOP Demo",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        System.out.println("Return value was " + val);

        String userInput = JOptionPane.showInputDialog("Gimme a number between 1 and 10");
        System.out.println("userInput = " + userInput);
*/

 /*       Object[] myButtons = {"Red","Green","Blue"};
        int val = JOptionPane.showOptionDialog(null,
                "What's your fav color",
                "Intro OOP",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null,
                myButtons,
               myButtons[1]);

        System.out.println("You pressed " + myButtons[val]);*/
        ArrayList<String> strings = new ArrayList<>();
        strings.add("My");
        strings.add("Name");
        strings.add("Is");
        strings.add("Hana");
        strings.add(Color.RED.toString());

        for (String elem : strings) {
            System.out.println("String is " + elem);
        }
    }

}
