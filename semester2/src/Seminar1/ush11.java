package Seminar1;
import javax.swing.*;
public class ush11 {
    public static void main(String[] args){
        JFrame frame = new JFrame ("frame i pare");
        JLabel lbl= new JLabel("hello world", JLabel.CENTER);
        frame.add(lbl);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

