package Basics;

import javax.swing.*;
import java.awt.*;

public class f_FlowLayout extends JFrame{
    public f_FlowLayout(){
        JFrame frmame = new JFrame();


        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");


        JPanel newpanel = new JPanel();
        newpanel.setLayout(new FlowLayout());
        newpanel.setBackground(Color.lightGray);
        newpanel.setPreferredSize(new Dimension(200,200));

        newpanel.add(btn1);
        newpanel.add(btn2);
        newpanel.add(btn3);
        newpanel.add(btn4);
        newpanel.add(btn5);
        newpanel.add(btn6);
        newpanel.add(btn7);
        newpanel.add(btn8);

        frmame.add(newpanel);

//        frmame.add(btn1);
//        frmame.add(btn2);
//        frmame.add(btn3);
//        frmame.add(btn4);
//        frmame.add(btn5);
//        frmame.add(btn6);
//        frmame.add(btn7);
//        frmame.add(btn8);

        frmame.setTitle("My FlowLayout SWingGUI");
        frmame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmame.setLayout(new FlowLayout());
//        frmame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frmame.setSize(600,600);
        frmame.setVisible(true);




    }
}
