package Basics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class k_JTextField extends JFrame implements ActionListener {
    JFrame frmame = new JFrame();
    JButton btn = new JButton("submit");
    JTextField txt = new JTextField();

    public k_JTextField(){


        btn.addActionListener(this);

        txt.setPreferredSize(new Dimension(250,50));


        frmame.add(txt);
        frmame.add(btn);


        frmame.setTitle("My TextFiled SWingGUI");
        frmame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmame.setLayout(new FlowLayout());
        frmame.setSize(600,600);
        frmame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn){
            System.out.println("Welcome, "+txt.getText());
        }

    }
}
