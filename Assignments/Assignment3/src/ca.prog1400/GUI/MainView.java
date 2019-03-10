package ca.prog1400.GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView extends JPanel {
    public MainView() {
        super();
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(null);

        JLabel jTitleLabel = new JLabel("Dragons and Dungeons");
        jTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jTitleLabel.setFont(new Font("Old English Text MT", Font.BOLD, 30));
        jTitleLabel.setBounds(10, 10, 529, 95);
        add(jTitleLabel);

        JLabel jImage = new JLabel("");
        jImage.setBounds(10, 96, 529, 386);
        add(jImage);

        JButton btnNewButton = new JButton("Build A Character");

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                removeAll();
                BuildCharacterView buildCharacter = new BuildCharacterView();
                add(buildCharacter);
                updateUI();
                setVisible(true);
            }
        });
        btnNewButton.setBounds(176, 535, 195, 64);
        add(btnNewButton);

    }
}
