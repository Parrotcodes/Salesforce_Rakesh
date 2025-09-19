package Basics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class i_NewWindow extends JFrame implements ActionListener {
    JFrame frmame = new JFrame();
    JButton btn = new JButton("New Window Launch");

    public i_NewWindow(){

        btn.setFocusable(false);
        btn.addActionListener(this);
        btn.setBounds(100,100,200,70);

        frmame.add(btn);

        frmame.setTitle("My NewWindow Launch SWingGUI");
        frmame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmame.setLayout(null);
        frmame.setSize(600,600);
        frmame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn){
            frmame.dispose();
            new f_FlowLayout();
        }
    }
}
