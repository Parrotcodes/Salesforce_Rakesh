package Basics;

import javax.swing.*;
import java.awt.*;

public class g_GridLayout extends JFrame {
    public g_GridLayout(){

          JFrame frmame = new JFrame();

        frmame.add(new JButton("1"));
        frmame.add(new JButton("2"));
        frmame.add(new JButton("3"));
        frmame.add(new JButton("4"));
        frmame.add(new JButton("5"));
        frmame.add(new JButton("6"));
        frmame.add(new JButton("7"));
        frmame.add(new JButton("8"));
        frmame.add(new JButton("9"));
        frmame.add(new JButton("10"));


        frmame.setTitle("My GridLayout SWingGUI");
        frmame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frmame.setLayout(new GridLayout());
//        frmame.setLayout(new GridLayout(10,0));
        frmame.setLayout(new GridLayout(3,3,5,5));
        frmame.setSize(600,600);
        frmame.setVisible(true);
    }
}
