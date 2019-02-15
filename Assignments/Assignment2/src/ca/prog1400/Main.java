package ca.prog1400;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //Student ArrayList
        ArrayList<Student> students = new ArrayList<>();
        //Staff ArrayList
        ArrayList<Staff> staffs = new ArrayList<>();

        int userType;
        do {
            userType = openDialogPopup("Select Student of Staff.", "Accounting App", new Object[]{"Student", "Staff", "Finish"});
            if (userType == 0) {
                students.add(new Student(checkValidInt(userType, "Enter student year(1-4)"), checkValidString("Enter Student Name"),
                        checkValidString("Enter Student Address")));
            } else if (userType == 1) {
                staffs.add(new Staff(checkValidString("Enter Staff Name"),
                        checkValidString("Enter Staff Address"),
                        checkValidInt(userType, "Enter staff of year service")));
            } else {
                doFinalReport(students, staffs);
            }
        } while (userType != 2);

    }

    //function for Report
    private static void doFinalReport(ArrayList<Student> students, ArrayList<Staff> staffs) {
        StringBuffer sb = new StringBuffer();
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
            sb.append(String.format("%d. %s", i + 1, staffs.get(i).toString()));
            outgoing += staffs.get(i).getBiWeeklyPay();
        }
        sb.append("\n\n");
        sb.append(String.format("Outgoing: $%.2f \n", outgoing));
        sb.append(String.format("Incoming: $%.2f\n", incoming));
        sb.append(String.format("Total: $%.2f", incoming - outgoing));
        openMessagePopup(sb.toString());
    }

    //function for validated number;
    private static int checkValidInt(int type, String message) {
        String[][] messageArr = {{"^([1-4])\\s*$", "Please enter a number between 1 and 4."},
                {"^([1-9]|[1-2][0-9])\\s*$", "Please enter a number between 1 and 29."}};

        HashMap<Integer, String[]> userType = new HashMap<>();
        userType.put(0, messageArr[0]);
        userType.put(1, messageArr[1]);

        String str;
        Pattern p = Pattern.compile(userType.get(type)[0]);
        do {
            str = openInputPopup(message);
            Matcher m = p.matcher(str);
            if (!m.matches()) {
                //Display warning.
                openMessagePopup(userType.get(type)[1]);
            } else {
                return Integer.parseInt(m.group(1));
            }
        } while (true);
    }

    //function for validated String;
    private static String checkValidString(String message) {
        String str;
        do {
            str = openInputPopup(message);
            if (str == null || str.isEmpty()) {
                //Display warning.
                openMessagePopup("Please enter a text.");
            } else {
                return str;
            }
        } while (true);
    }

    //function for open  showInputDialog
    private static String openInputPopup(String message) {
        return JOptionPane.showInputDialog(null,
                message,
                "Input",
                JOptionPane.QUESTION_MESSAGE);
    }

    //function for open showMessageDialog
    private static void openMessagePopup(String message) {
        JOptionPane.showMessageDialog(null,
                message);
    }

    //function for open showOptionDialog
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
