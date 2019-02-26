package ca.prog1400;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Boilerplate code for launching JFrame
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Here's where you create and
                    //make your frame visible
                    SwingLab frame = new SwingLab();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
