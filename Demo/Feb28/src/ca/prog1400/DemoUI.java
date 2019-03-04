package ca.prog1400;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoUI extends JFrame {
    private JTextField userName;
    private JTextArea  textArea;
    public DemoUI(){
        super();
        setTitle("Feb 28 Demo");
        setBounds(10,10,600,300);
        setVisible(true);
        setLayout(null);


        JLabel label = new JLabel("Demo");
        label.setBounds(20,20,225,225);
        label.setIcon(new ImageIcon(getClass().getResource("/images/supermario.jpg")));
        label.setBackground(Color.DARK_GRAY);
        label.setOpaque(true);

        //Add an image

        add(label);

        JRadioButton button1 = new JRadioButton("Yes");
        button1.setBounds(280,30,100,20);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("testtttt!!!!!!!!!" + userName.getText());
            }
        });
        add(button1);
        JRadioButton button2 = new JRadioButton("No");
        button2.setBounds(400,30,100,20);
        add(button2);
        ButtonGroup group = new ButtonGroup();
        group.add(button1);
        group.add(button2);

        userName = new JTextField();
        userName.setBounds(400,50,100,20);
        add(userName);

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setBounds(200,100,200,200);
        add(textArea);


    }

}

