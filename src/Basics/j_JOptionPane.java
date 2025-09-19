package Basics;

import javax.swing.*;

public class j_JOptionPane extends JFrame {
    public j_JOptionPane(){

//        JFrame frmame = new JFrame();

//        JOptionPane.showMessageDialog(null,"Welcome mr.","message",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Welcome mr.","message",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Welcome mr.","message",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Welcome mr.","message",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"Welcome mr.","message",JOptionPane.ERROR_MESSAGE);

//        JOptionPane.showConfirmDialog(null,"Welcome mr.","message",JOptionPane.YES_NO_CANCEL_OPTION);
//        int reply = JOptionPane.showConfirmDialog(null,"Welcome mr.","message",JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("Wha is your name?");

        if (name.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter you name","NameInfo",JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showConfirmDialog(null,"Are you Mr."+name,"Confimation",JOptionPane.OK_OPTION);
        }




//        frmame.setTitle("My JOptionPane SWingGUI");
//        frmame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frmame.setLayout(null);
//        frmame.setSize(600,600);
//        frmame.setVisible(true);
    }
}
