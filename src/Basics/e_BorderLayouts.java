package Basics;

import javax.swing.*;
import java.awt.*;

public class e_BorderLayouts extends JFrame {
    public e_BorderLayouts(){
        JFrame frmame = new JFrame();

        frmame.setTitle("My BorderLayout SWingGUI");
        frmame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmame.setLayout(new BorderLayout(10,10));
        frmame.setSize(600,600);
        frmame.setVisible(true);


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.blue);
        panel3.setBackground(Color.green);
        panel4.setBackground(Color.darkGray);
        panel5.setBackground(Color.yellow);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        frmame.add(panel1,BorderLayout.NORTH);
        frmame.add(panel2,BorderLayout.EAST);
        frmame.add(panel3,BorderLayout.WEST);
        frmame.add(panel4,BorderLayout.SOUTH);
        frmame.add(panel5,BorderLayout.CENTER);

//      ------------------Sub Panels--------------------------

        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
//        JPanel panel10 = new JPanel();

        panel6.setBackground(Color.red);
        panel7.setBackground(Color.blue);
        panel8.setBackground(Color.green);
        panel9.setBackground(Color.darkGray);
//        panel10.setBackground(Color.yellow);

        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
//        panel10.setPreferredSize(new Dimension(50,50));

        panel5.setLayout(new BorderLayout(5,5));
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.EAST);
        panel5.add(panel8,BorderLayout.WEST);
        panel5.add(panel9,BorderLayout.SOUTH);
//        panel5.add(panel10,BorderLayout.NORTH);

    }
}
