package ca.prog1400;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Boilerplate code for launching JFrame
        // Default display of JFrame until e ent queue is ready
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    //Here's where you create and
                    //make your frame visible
                    DemoUI frame = new DemoUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
