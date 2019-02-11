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
        int confirm ;
        do{
            boolean invited = true;
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

            int userInvited = JOptionPane.showConfirmDialog(null,"Basic Confirm","OOP Demo",
                    JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            confirm = JOptionPane.showConfirmDialog(null,"Basic Confirm","OOP Demo",
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);

            if(userInvited != 0){
                invited = false;
            }
            friends.add(new Friend(firendFirstName,firendLastName,invited,bringFood));
        }while(confirm != 0 );

        for(Friend friend : friends){
            System.out.println(friend.toString());
        }

    }
}
