package Basics;

import javax.swing.*;
import java.awt.*;

public class h_JLayredPane extends JFrame {
    public h_JLayredPane(){

          JFrame frmame = new JFrame();


          JLayeredPane layeredPane = new JLayeredPane();
          layeredPane.setBounds(0,0,500,500);

          JLabel lable1 = new JLabel();
          lable1.setOpaque(true);
          lable1.setBounds(150,150,200,200   );
          lable1.setBackground(Color.red);

        JLabel lable2 = new JLabel();
        lable2.setOpaque(true);
        lable2.setBounds(200,200,200,200   );
        lable2.setBackground(Color.green);

        JLabel lable3 = new JLabel();
        lable3.setOpaque(true);
        lable3.setBounds(250,250,200,200   );
        lable3.setBackground(Color.blue);

        JLabel lable4 = new JLabel();
        lable4.setOpaque(true);
        lable4.setBounds(300,300,200,200   );
        lable4.setBackground(Color.yellow);

//        layeredPane.add(lable1);
//        layeredPane.add(lable2);
//        layeredPane.add(lable3);
//        layeredPane.add(lable4);

        layeredPane.add(lable1,JLayeredPane.DRAG_LAYER);
        layeredPane.add(lable2,JLayeredPane.PALETTE_LAYER);
        layeredPane.add(lable3,JLayeredPane.DRAG_LAYER);
        layeredPane.add(lable4,Integer.valueOf(4));

        frmame.add(layeredPane);

        frmame.setTitle("My JLayredPane SWingGUI");
        frmame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmame.setLayout(null);
        frmame.setSize(600,600);
        frmame.setVisible(true);
    }
}
