package ca.prog1400.GUI;


import ca.prog1400.Classes.*;
import com.sun.javafx.binding.StringFormatter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class BuildCharacterView extends JPanel {
    //private JTextField txtDdd;
    private JTextField name =  CustomComponent.inputTextFeild(69);
    private JTextField hitPoints = CustomComponent.readTextFeild(51);
    private JTextField defense = CustomComponent.readTextFeild(80);
    private JTextField agility = CustomComponent.readTextFeild(110);
    private JTextField baseAttack = CustomComponent.readTextFeild(139);
    private JTextField modifier = CustomComponent.readTextFeild(51);
    private JTextField weight = CustomComponent.readTextFeild(80);
    private JTextArea classDesc = CustomComponent.readTextFeild(165,274);
    private JTextArea weaponDesc = CustomComponent.readTextFeild(165,274);
    private JLabel classImage = CustomComponent.jImage(140,51);
    private JLabel weaponImage = CustomComponent.jImage(140,51);
    private Player player;
    private Weapon weapons;

    public BuildCharacterView(){
        super();
        setBounds(0, 0, 559, 688);
        setBackground(new Color(153, 204, 255));
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(null);

        add(CustomComponent.jTitleLabel("Character Generator",20, 23, 459, 35));
        add(CustomComponent.jTextLabel("Enter Name",26, 69, 159, 35));
        add(name);


        //Stats Panel! If there are more elements, I recommend you to remove the class separately!
        JPanel Stats = CustomComponent.jPanel("",320, 108, 202, 250);
        add(Stats);
        Stats.add(CustomComponent.jTextLabel("Character Stats",10, 0, 159, 35));
        Stats.add(CustomComponent.jSubTextLabel("Hit Points",51));
        Stats.add(CustomComponent.jSubTextLabel("Defense",80));
        Stats.add(CustomComponent.jSubTextLabel("Agility",110));
        Stats.add(CustomComponent.jSubTextLabel("Base Attack",139));
        Stats.add(hitPoints);
        Stats.add(defense);
        Stats.add(agility);
        Stats.add(baseAttack);
        JButton jButton = CustomComponent.jButton("Reroll",41, 197, 127, 42);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player.doRandomAbility();
                doGetAbility(player);
            }
        });
        Stats.add(jButton);

        JPanel jobClass = CustomComponent.jPanel("",20, 108, 294, 250);
        add(jobClass);
        jobClass.add(CustomComponent.jTextLabel("Character Type",6, 0, 163, 31));

        JRadioButton warrior = CustomComponent.jRadioButton("Warrior",51);
        warrior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player = new Warrior(name.getName());
                doGetAbility(player);
                classImage.setIcon(new ImageIcon(getClass().getResource(Warrior.IMG_URL)));
                classDesc.setText(Warrior.DESCRIPTION);

            }
        });
        jobClass.add(warrior);
        JRadioButton wizard = CustomComponent.jRadioButton("Wizard",93);
        wizard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player = new Wizard(name.getName());
                doGetAbility(player);
                classImage.setIcon(new ImageIcon(getClass().getResource(Wizard.IMG_URL)));
                classDesc.setText(Wizard.DESCRIPTION);
            }
        });
        jobClass.add(wizard);

        JRadioButton cleric = CustomComponent.jRadioButton("Cleric",137);
        cleric.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player = new Cleric(name.getName());
                doGetAbility(player);
                classImage.setIcon(new ImageIcon(getClass().getResource(Cleric.IMG_URL)));
                classDesc.setText(Cleric.DESCRIPTION);
            }
        });
        jobClass.add(cleric);
        jobClass.add(classImage);
        jobClass.add(classDesc);

        ButtonGroup group = new ButtonGroup();
        group.add(warrior);
        group.add(wizard);
        group.add(cleric);


        JPanel weapon = CustomComponent.jPanel("",20, 369, 294, 250);
        add(weapon);

        weapon.add(CustomComponent.jTextLabel("Select Power Weapon",6, 0, 288, 31));

        JRadioButton hammer = CustomComponent.jRadioButton("Hammer",51);
        hammer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weapons = new Hammer();
                doGetweaponAbility(weapons);
                weaponImage.setIcon(new ImageIcon(getClass().getResource(Hammer.IMG_URL)));
                weaponDesc.setText(Hammer.DESCRIPTION);
            }
        });
        JRadioButton sword = CustomComponent.jRadioButton("Sword",93);
        sword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weapons = new Sword();
                doGetweaponAbility(weapons);
                weaponImage.setIcon(new ImageIcon(getClass().getResource(Sword.IMG_URL)));
                weaponDesc.setText(Sword.DESCRIPTION);
            }
        });
        JRadioButton dagger = CustomComponent.jRadioButton("Sword",137);
        dagger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weapons = new Dagger();
                doGetweaponAbility(weapons);
                weaponImage.setIcon(new ImageIcon(getClass().getResource(Dagger.IMG_URL)));
                weaponDesc.setText(Dagger.DESCRIPTION);
            }
        });


        ButtonGroup group2 = new ButtonGroup();
        group2.add(hammer);
        group2.add(sword);
        group2.add(dagger);

        weapon.add(hammer);
        weapon.add(sword);
        weapon.add(dagger);
        weapon.add(weaponImage);
        weapon.add(weaponDesc);

        JPanel weaponStats = CustomComponent.jPanel("",320, 369, 202, 250);
        add(weaponStats);

        weaponStats.add(CustomComponent.jTextLabel("Weapon Stats",10, 0, 159, 35));
        weaponStats.add(CustomComponent.jSubTextLabel("Attack Modifier",51));
        weaponStats.add(CustomComponent.jSubTextLabel("Weight",80));
        weaponStats.add(modifier);
        weaponStats.add(weight);

        weaponStats.add(CustomComponent.jButton("Battle",41, 197, 127, 42));
    }



    private void doGetAbility(Player player){
        hitPoints.setText(Integer.toString(player.getHp()));
        defense.setText(Integer.toString(player.getDefense()));
        agility.setText(Integer.toString(player.getAgility()));
        baseAttack.setText(Integer.toString(player.getBaseAttack()));
    }

    private void doGetweaponAbility(Weapon weapon){
        weight.setText(Integer.toString(weapon.getWeight()));
        modifier.setText(String.format("%+d",weapon.getAttackModifier()));
    }
}
