package Basics;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class b_FJLables extends JFrame{
    
    public b_FJLables(){
//        JFrame frame = new JFrame();
        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel lable = new JLabel("My First Lable");
        ImageIcon image = new ImageIcon("logo.jpg");

        lable.add(lable);
        lable.setIcon(image);

        lable.setSize(100,100);
        lable.setVerticalAlignment(JLabel.TOP);
        lable.setHorizontalAlignment(JLabel.HORIZONTAL);
        //lable.setVerticalAlignment(JLabel.BOTTOM);
        lable.setForeground(Color.red);
        lable.setFont(new Font("MV Boli",Font.BOLD,25));

        lable.setBackground(Color.BLACK);//background color set
        lable.setOpaque(true);//display background on

        lable.setBorder(border);
//        lable.setBounds(100,100,500,500);
        this.setLayout(null);


        this.pack();

        this.setVisible(true);
        this.setTitle("My JLable SwingGUI Frame");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
