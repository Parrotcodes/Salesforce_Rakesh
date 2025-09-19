package Basics;

import javax.swing.*;
import java.awt.*;

public class c_JPanel extends JFrame{

    public c_JPanel(){
        JLabel lable = new JLabel("COntainer Text 😊😊");
//        lable.setText("My Text");

        ImageIcon icon = new ImageIcon("logo1.jpg");
        lable.setIcon(icon);
        lable.setVerticalAlignment(JLabel.BOTTOM);
        lable.setHorizontalAlignment(JLabel.RIGHT);
        lable.setBounds(0,0,100,100);

        JPanel redPanel = new JPanel();
        JPanel greenPanel = new JPanel();
        JPanel bluePanel = new JPanel();

        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,200,200);
//        redPanel.setLayout(null);
        redPanel.setLayout(new BorderLayout()); //BorderLayout Panel

        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(200,0,200,200);
//        bluePanel.setLayout(null);
        bluePanel.setLayout(new BorderLayout());

        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,200,400,200);
        greenPanel.setLayout(null);
//        greenPanel.setLayout(new BorderLayout());



        this.add(redPanel);
        this.add(bluePanel);
        this.add(greenPanel);
        greenPanel.add(lable);
        greenPanel.add(lable);


        this.setLayout(null);
        this.setVisible(true);
        this.setTitle("My Panel SwingGUI Frame");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
