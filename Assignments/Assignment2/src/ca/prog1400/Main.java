package ca.prog1400;

import javax.swing.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        //Student ArrayList
        ArrayList<Student> students = new ArrayList<>();
        //Staff ArrayList
        ArrayList<Staff> staffs = new ArrayList<>();

        int opt;

        do {
            opt = openDialogPopup("Select Student of Staff.", "Accounting App", new Object[]{"Student", "Staff", "Finish"});
            if (opt == 0) {
                students.add(new Student(checkValid(opt), openInputPopup("Enter Student Name"),
                        openInputPopup("Enter Student Address")));
            } else if (opt == 1) {
                staffs.add(new Staff(openInputPopup("Enter Staff Name"),
                        openInputPopup("Enter Staff Address"),
                        checkValid(opt)));
            } else {
                StringBuffer sb = new StringBuffer("");
                int idx = 1;
                double incoming = 0;
                double outgoing = 0;

                sb.append(String.format("Students [Total: %d]", students.size()));
                for (int i = 0; i < students.size(); i++) {
                    sb.append("\n");
                    sb.append(String.format("%d. %s", i + 1, students.get(i).toString()));
                    incoming += students.get(i).getHalfFee();
                }
                sb.append("\n\n");
                sb.append(String.format("Staff [Total: %d]", staffs.size()));
                for (int i = 0; i < staffs.size(); i++) {
                    sb.append("\n");
                    sb.append(i + 1 + staffs.get(i).toString());
                    outgoing += staffs.get(i).getBiWeeklyFee();
                }
                sb.append("\n\n");
                sb.append(String.format("Outgoing: $%.2f \n", outgoing));
                sb.append(String.format("Incoming: $%.2f\n", incoming));
                sb.append(String.format("Total: $%.2f", incoming - outgoing));
                openMessagePopup(sb.toString());
            }
        } while (opt != 2);

    }


    private static int checkValid(int type) {
        String str;
        int year = 0;
        if (type == 0) {
            do {
                str = openInputPopup("Enter student year(1-4)");

                //Display warning.
                if (!str.matches("^[0-9]*$")) {
                    openMessagePopup("Please enter a number");
                } else {
                    year = Integer.parseInt(str);
                    //Check range
                    if (year < 1 || year > 4) {
                        openMessagePopup("Please enter a number between 1 and 4.");
                    }
                }
            } while (!str.matches("^[0-9]*$") || (year < 1 || year > 4));

        } else {
            do {
                str = openInputPopup("Enter staff of year service");

                //Display warning.
                if (!str.matches("^[0-9]*$")) {
                    openMessagePopup("Please enter a number");
                } else {
                    year = Integer.parseInt(str);
                    //Check range
                    if (year <= 0 || year >= 30) {
                        openMessagePopup("Please enter a number between 1 and 29.");
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

    private static void openMessagePopup(String message) {
        JOptionPane.showMessageDialog(null,
                message);
    }

    private static int openDialogPopup(String message, String title, Object[] buttons) {
        return JOptionPane.showOptionDialog(null,
                message,
                title,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                buttons,
                buttons[0]);
    }

}
