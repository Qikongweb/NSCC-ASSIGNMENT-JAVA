package ca.prog1400;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapCalculator extends JFrame {

    private JTextField jTextField;
    public ShapCalculator(){
        super();
        setTitle("Shap Caculator");
        setBounds(10,10,600,300);
        setVisible(true);
        setLayout(null);

        JRadioButton radioButton1 = createRadiButton(new JRadioButton("Circle"),20,30);
        radioButton1.requestFocus();
        radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTextField == null){
                    showMessageDialog("Enter a correct number");
                }else{
                    Circle circle = new Circle(0,"RED", Double.parseDouble(jTextField.getText()));
                    showMessageDialog(String.format("Circle size is %.2f", circle.getArea()));
                }
            }
        });
        JRadioButton radioButton2 = createRadiButton(new JRadioButton("Triangle"),20,70);
        radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        JRadioButton radioButton3 =  createRadiButton(new JRadioButton("Rectangle"),20,110);
        radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        add(radioButton1);
        add(radioButton2);
        add(radioButton3);


        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        JLabel label = new JLabel("Radius: ");
        label.setBounds(250,30,60,20);
        add(label);
        jTextField = new JTextField();
        jTextField.setBounds(300,30,150,20);
        add(jTextField);



    }
    private JRadioButton createRadiButton(JRadioButton jRadioButton,int x, int y ){
        JRadioButton radioButton = jRadioButton;
        radioButton.setBounds(x,y,100,30);
        return radioButton;
    }

    private static void showMessageDialog(String message){
        JOptionPane.showMessageDialog(null,
               message);
    }

}
