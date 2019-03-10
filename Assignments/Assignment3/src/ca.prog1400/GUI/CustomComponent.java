package ca.prog1400.GUI;

import javax.swing.*;
import java.awt.*;

public class CustomComponent extends JPanel {
    public static final String FONT_OLD_ENGLISH = "Old English Text MT";
    public static final String BOOK_ANTIQUA = "Book Antiqua";
    public CustomComponent() {
        super();
    }

    public static JLabel jTitleLabel(String txt,int x, int y, int w, int h){
        JLabel jLabel = new JLabel(txt);
        jLabel.setFont(new Font(FONT_OLD_ENGLISH,Font.BOLD, 30));
        jLabel.setBounds(x, y, w, h);
        return jLabel;
    }
    public static JLabel jTextLabel(String txt,int x, int y, int w, int h){
        JLabel jLabel = new JLabel(txt);
        jLabel.setFont(new Font(FONT_OLD_ENGLISH,Font.BOLD, 18));
        jLabel.setBounds(x, y, w, h);
        return jLabel;
    }
    public static JLabel jSubTextLabel(String txt,int y){
        JLabel jLabel = new JLabel(txt);
        jLabel.setFont(new Font(BOOK_ANTIQUA,Font.PLAIN, 15));
        jLabel.setBounds(10, y, 106, 23);
        return jLabel;
    }
    public static JLabel jImage(int x, int y){
        JLabel jLabel = new JLabel();
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel.setBounds(x, y, 140, 115);
        return jLabel;
    }
    public static JRadioButton jRadioButton(String txt,int y){
        JRadioButton jRadioButton = new JRadioButton(txt);
        jRadioButton.setBackground(new Color(153, 204, 255));
        jRadioButton.setFont(new Font(BOOK_ANTIQUA,Font.PLAIN, 15));
        jRadioButton.setBounds(6, y, 110, 23);
        return  jRadioButton;
    }
    public static JButton jButton(String txt, int x, int y, int w, int h){
        JButton jButton = new JButton(txt);
        jButton.setBackground(new Color(153, 204, 255));
        jButton.setFont(new Font(FONT_OLD_ENGLISH, Font.BOLD, 14));
        jButton.setBounds(x, y, w, h);
        return  jButton;

    }
    public static JPanel jPanel(String txt, int x, int y, int w, int h){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(new Color(153, 204, 255));
        jPanel.setBounds(x, y, w, h);
        jPanel.setLayout(null);
        return jPanel;
    }
    public static JTextField inputTextFeild(int y) {
        JTextField jTextField = new JTextField();
        jTextField.setBounds(150, y, 140, 26);
        jTextField.setColumns(10);
        return jTextField;
    };
    public static JTextField readTextFeild(int y){
        JTextField jTextField = new JTextField();
        jTextField.setBounds(126, y, 67, 26);
        jTextField.setColumns(10);
        jTextField.setEditable(false);
        return jTextField;
    }
    public static JTextArea readTextFeild(int y, int width){
        JTextArea jTextArea = new JTextArea();
        jTextArea.setBounds(6, y, width, 66);
        jTextArea.setColumns(10);
        jTextArea.setEditable(false);
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
        return jTextArea;
    }

}
