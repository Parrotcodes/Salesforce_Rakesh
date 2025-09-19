package Basics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class d_JButtons extends JFrame implements ActionListener {

    JFrame frame = new JFrame();

    JButton btn = new JButton();
    JLabel label = new JLabel();

    public d_JButtons(){

        btn.setText("Click me👍");
        btn.setSize(100,100);
        btn.setBounds(150,150,100,100);
        btn.setVerticalAlignment(JButton.CENTER);
        btn.setFocusable(false);
        btn.addActionListener(this);

        label.setBounds(150,350,100,100);
        label.setLayout(null);
        label.setText("You got cliked 😊😊");
        label.setVisible(false);

        frame.add(btn);
        frame.add(label);


        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("My JButton SwingGUI Frame");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){
            label.setVisible(true);
            System.out.println("Welcome");
//            a_FirstFrame first = new a_FirstFrame();

            dispose();

        }
    }
}
