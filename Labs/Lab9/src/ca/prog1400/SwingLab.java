package ca.prog1400;

import javax.swing.*;
import java.awt.*;

public class SwingLab extends JFrame {
    private JPanel panelLeft;
    private JPanel panelRight;

    public SwingLab() {
        super();

        JButton button;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Take a Swing!");
        setBounds(100,30,600,300);
        JPanel contentPane = new JPanel();

        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        //button group margin
        Insets old_insets = c.insets;
        c.insets = new Insets(0, 75, 0, 75);

        //Button Left;
        button = new JButton("Toggle Left");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weighty = 0.1;
        contentPane.add(button, c);

        //Button Right;
        button = new JButton("Toggle Right");
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 4;
        c.gridy = 0;
        c.gridwidth = 4;
        c.gridheight = 1;
        c.weighty = 0.1;
        contentPane.add(button, c);

        //button margin remove!
        c.insets = old_insets;

        //Left Panel
        panelLeft = new JPanel();
        panelLeft.setBackground(Color.BLUE);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 4;
        c.gridheight = 3;
        c.weightx = 0.5;
        c.weighty = 0.9;
        contentPane.add(panelLeft,c);
        JLabel leftLabel = new JLabel("This is the left panel");
        leftLabel.setForeground(Color.RED);
        leftLabel.setFont(new Font("Courier", Font.BOLD, 24));
        panelLeft.add(leftLabel);

        //Right Panel
        panelRight = new JPanel();
        panelRight.setBackground(Color.RED);
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 4;
        c.gridy = 1;
        c.gridwidth = 4;
        c.gridheight = 3;
        c.weightx = 0.5;
        c.weighty = 0.9;
        contentPane.add(panelRight,c);
        JLabel rightLabel = new JLabel("This is the right panel");
        rightLabel.setForeground(Color.BLUE);
        rightLabel.setFont(new Font("Courier", Font.BOLD, 24));
        panelRight.add(rightLabel);
        //add button event !
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                panelOne.setVisible(false);
//                panelTwo.setVisible(true);
//            }
//        });
    }
}
