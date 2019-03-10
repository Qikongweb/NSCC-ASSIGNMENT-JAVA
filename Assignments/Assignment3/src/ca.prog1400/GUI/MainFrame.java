package ca.prog1400.GUI;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 565, 688);
        JPanel contentPane = new MainView();
        setContentPane(contentPane);
    }



}
