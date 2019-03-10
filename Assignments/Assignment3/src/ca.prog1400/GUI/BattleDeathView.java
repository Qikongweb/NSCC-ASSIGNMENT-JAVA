package ca.prog1400.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BattleDeathView extends JPanel {
    private JPanel contentPane;

    public BattleDeathView(){
        super();
        setBounds(100, 100, 559, 688);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(153, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);

        JLabel lblBattelGoTo = new JLabel("Battel Go The Death!");
        lblBattelGoTo.setFont(new Font("Old English Text MT", Font.PLAIN, 35));
        lblBattelGoTo.setBounds(42, 30, 466, 60);
        lblBattelGoTo.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblBattelGoTo);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(59, 101, 172, 169);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JLabel label = new JLabel("Player:XXX");
        label.setBounds(59, 8, 52, 14);
        panel_1.add(label);

        JLabel lblNewLabel = new JLabel("1");
        lblNewLabel.setBackground(new Color(153, 0, 153));
        lblNewLabel.setBounds(26, 33, 119, 113);
        panel_1.add(lblNewLabel);

        JPanel panel = new JPanel();
        panel.setBounds(315, 101, 172, 169);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel label_1 = new JLabel("Player:XXX");
        label_1.setBounds(60, 5, 52, 14);
        panel.add(label_1);

        JLabel label_2 = new JLabel("1");
        label_2.setBackground(new Color(153, 0, 153));
        label_2.setBounds(30, 33, 119, 113);
        panel.add(label_2);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setBounds(10, 281, 523, 295);
        contentPane.add(textArea);

        JButton btnNewButton = new JButton("Play Again");
        btnNewButton.setBounds(131, 602, 272, 36);
        contentPane.add(btnNewButton);
    }
}
