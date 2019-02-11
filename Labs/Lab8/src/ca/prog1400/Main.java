package ca.prog1400;

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
        int confirm ;
        boolean invited = true;
        Object[] buttons ={"Invited","Not Invited"};
        do{

            String firendFirstName = JOptionPane.showInputDialog(null,
                    "Enter firt name",
                    "Pary Picker",
                    JOptionPane.QUESTION_MESSAGE);
            String firendLastName = JOptionPane.showInputDialog(null,
                    "Enter Last name",
                    "Pary Picker",
                    JOptionPane.QUESTION_MESSAGE);
            String bringFood = JOptionPane.showInputDialog(null,
                    "Enter the food they usally bring",
                    "Pary Picker",
                    JOptionPane.QUESTION_MESSAGE);
            int userInvited = JOptionPane.showOptionDialog(null,
                    "Choose if this guested is Invited or Not Invited",
                    "Party Picker",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    buttons,
                    buttons[0]
                   );
            confirm = JOptionPane.showConfirmDialog(null,
                    "Enter another guest",
                    "Party Picker",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);

            if(userInvited == 1){
                invited = false;
            }
            friends.add(new Friend(firendFirstName,firendLastName,invited,bringFood));
        }while(confirm==0);
        String stem = "Guests: \n\n";

        for(Friend friend : friends){
            stem += friend.toString()+"\n";
        }
        JOptionPane.showMessageDialog(
                null,
                stem,
                "Message",
                JOptionPane.INFORMATION_MESSAGE
        );

    }
}
