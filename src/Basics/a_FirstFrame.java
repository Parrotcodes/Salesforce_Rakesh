package Basics;

import javax.swing.*;
import java.awt.*;

public class a_FirstFrame extends JFrame {

    public a_FirstFrame(){
        this.setVisible(true);
        this.setTitle("My First SwingGUI Frame");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        this.setResizable(false);

        this.getContentPane().setBackground(new Color(14,154,154));

        ImageIcon image = new ImageIcon("logo.jpg");
        this.setIconImage(image.getImage());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
