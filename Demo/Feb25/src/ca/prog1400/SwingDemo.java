package ca.prog1400;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo extends JFrame {
    private JPanel panelOne;
    private JPanel panelTwo;

    public SwingDemo(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,400,400);
        setTitle("Swing Title");

        // Set up my Content Pane
        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        // Tell the JFrame to display this panel for content
        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        //Set a second panel within the content pane
        panelOne = new JPanel();
        panelOne.setBackground(Color.ORANGE);
        contentPane.add(panelOne);
        panelOne.setLayout(null);  // setLayout 설정 시 사용자 위치 설정할 수 있음.!

        JLabel label = new JLabel();
        label.setText("Hello World!!!");
        label.setBounds(85,40,120,20);
        panelOne.add(label);
        // Switch Me Button
        JButton button = new JButton();
        button.setText("Switch Panels");
        button.setBounds(70,200, 120, 20);
        panelOne.add(button);
        //add button event !
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelOne.setVisible(false);
                panelTwo.setVisible(true);
            }
        });

        // This is the second panel;
        panelTwo = new JPanel();
        panelTwo.setBackground(Color.PINK);
        contentPane.add(panelTwo);
        panelTwo.setLayout(null);

    }

}
