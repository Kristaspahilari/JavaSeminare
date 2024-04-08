package Seminar3;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
public class ush4 {
    public static void main(String[] args){
        JFrame frame = new JFrame("FlowLayout");
        frame.setSize(487,182);
        JPanel panel= new JPanel();
        JLabel label = new JLabel();

        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        for (char c = 'A'; c <= 'Z'; c++) {
            JButton button = new JButton(String.valueOf(c));
            button.setPreferredSize(new Dimension(49,30));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event){
                    label.setText("Ju klikuat " +button.getText());
                }
            });
            panel.add(button);
        }
        panel.add(label);
        frame.add(panel);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
