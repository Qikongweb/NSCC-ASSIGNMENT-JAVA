package prog1400;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Friend> friends = new ArrayList<>();
        String message = "Welcome to the Party Picker. \n\n";
        message += "Enter person's name and the type of food they're likely to bring,\n";
        message += "then indicate whether they are actually invited to the party or not";
        JOptionPane.showMessageDialog(
                null,
                message,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );

        String firendFirstName = JOptionPane.showInputDialog(null,
                 "Enter firt name",
                 "Pary Picker",
                 JOptionPane.QUESTION_MESSAGE);
        String firendLastName = JOptionPane.showInputDialog(null,
                "Enter Last name",
                "Pary Picker",
                JOptionPane.QUESTION_MESSAGE);
        String bringFood = JOptionPane.showInputDialog(null,
                "Enter Last name",
                "Pary Picker",
                JOptionPane.QUESTION_MESSAGE);

        int invited = JOptionPane.showConfirmDialog(null,"Basic Confirm","OOP Demo",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if(invite)
        friends.add(new Friend(firendFirstName,firendLastName,,invited));

        Friend friend = new Friend(firendFirstName,firendLastName,isInvited,bringFood);

        friend.toString();

    }
}
