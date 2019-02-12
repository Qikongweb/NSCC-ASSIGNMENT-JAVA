package ca.prog1400;

import javax.swing.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //button object;
        Object[] buttons = {"Student", "Staff", "Finish"};

        //Student ArrayList
        ArrayList<Student> students = new ArrayList<>();
        //Staff ArrayList
        ArrayList<Staff> staffs = new ArrayList<>();


        int Opt = JOptionPane.showOptionDialog(null,
                "Select Student of Staff.",
                "Accounting App",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                buttons,
                buttons[0]);



        switch (Opt) {
            case 0:
                students.add(new Student(checkValid(Opt),openInputPopup("Enter Student Name"),
                        openInputPopup("Enter Student Address")));
                break;
            case 1:
                staffs.add(new Staff(openInputPopup("Enter Staff Name"),
                        openInputPopup("Enter Staff Address"),
                        checkValid(Opt)));
                break;
        }

        String result="";
        int idx=1;
        for(Student student : students){
            result += Integer.toString(idx++);
            result += student.toString();
        }

        openMessage(result);




    }


    private static int checkValid(int type){
        String str;
        int year = 0;
        if(type == 0){
            do {
                str = openInputPopup("Enter student year(1-4)");

                //Display warning.
                if (!str.matches("^[0-9]*$")) {
                    openMessage("Please enter a number");
                }else{
                    year = Integer.parseInt(str);
                    //Check range
                    if (year < 1 || year > 4) {
                        openMessage("Please enter a number between 1 and 4.");
                    }
                }
            } while (!str.matches("^[0-9]*$") || (year < 1 || year > 4));

        }else{
            do {
                str = openInputPopup("Enter staff of year service");

                //Display warning.
                if (!str.matches("^[0-9]*$")) {
                    openMessage("Please enter a number");
                }else{
                    year = Integer.parseInt(str);
                    //Check range
                    if (year <= 0 || year >= 30) {
                        openMessage("Please enter a number between 1 and 29.");
                    }
                }
            } while (!str.matches("^[0-9]*$") || (year <= 0 || year >= 30));
        }


        return year;
    }
    private static String openInputPopup(String message) {
        return JOptionPane.showInputDialog(null,
                message,
                "Input",
                JOptionPane.QUESTION_MESSAGE);
    }

    private static void openMessage(String message) {
        JOptionPane.showMessageDialog(null,
                message);
    }
}
